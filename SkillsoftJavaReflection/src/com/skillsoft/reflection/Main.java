package com.skillsoft.reflection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final class HR extends Department {

        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        System.out.println("********** toGenericString()");
        Class<?> employeeClass = Class.forName("com.skillsoft.reflection.Employee");
        Class<?> salaryClass = Class.forName("com.skillsoft.reflection.Employee$Salary");
        Class<?> hrClass = Class.forName("com.skillsoft.reflection.Main$HR");

        class MobileApplication implements Deliverable {

            @Override
            public String getProjectName() {
                return "Mongo Mobile Application";
            }

            @Override
            public String getProjectStatus() {
                return "Deployed";
            }
        }

        Class<?> mobileApplicationClass = Class.forName("com.skillsoft.reflection.Main$1MobileApplication");

        System.out.println(employeeClass.toGenericString()); // public class com.skillsoft.reflection.Employee
        System.out.println(salaryClass.toGenericString()); // public class com.skillsoft.reflection.Employee$Salary
        System.out.println(hrClass.toGenericString()); // private static final class com.skillsoft.reflection.Main$HR
        System.out.println(mobileApplicationClass.toGenericString()); // class com.skillsoft.reflection.Main$1MobileApplication

        System.out.println();

        System.out.println("************** packages");

        Package employeeClassPackage = employeeClass.getPackage();
        Package mobileApplicationClassPackage = mobileApplicationClass.getPackage();

        System.out.println("Employee package: " + employeeClassPackage); // package com.skillsoft.reflection
        System.out.println("MobileSApplication package: " + mobileApplicationClassPackage); // package com.skillsoft.reflection

        Set<Integer> set = new HashSet<>();

        System.out.println("Set package: " + set.getClass().getPackage()); // package java.util
        System.out.println("Double package: " + Double.class.getPackage()); // package java.lang

        System.out.println();

        System.out.println("*************** Superclass");

        System.out.println("Employee superclass: " + employeeClass.getSuperclass()); // class java.lang.Object
        System.out.println("MobileApplication superclass: " + mobileApplicationClass.getSuperclass()); // class java.lang.Object
        System.out.println("HR superclass: " + hrClass.getSuperclass()); // class com.skillsoft.reflection.Department
        System.out.println("Set superclass: " + set.getClass().getSuperclass()); // class java.util.AbstractSet

        System.out.println();

        System.out.println("************ Implemented interfaces");

        System.out.println("*** MobileApplication");
        System.out.println(Arrays.asList(mobileApplicationClass.getInterfaces())); // [interface com.skillsoft.reflection.Deliverable]

        System.out.println("*** HashSet");
        System.out.println(Arrays.asList(set.getClass().getInterfaces())); // [interface java.util.Set, interface java.lang.Cloneable, interface java.io.Serializable]

        System.out.println();


        System.out.println("********* Declaring and Enclosing Class");

        System.out.println("******* Employee");
        System.out.println("Declaring class: " + employeeClass.getDeclaringClass()); // null
        System.out.println("Enclosing class: " + employeeClass.getEnclosingClass()); // null

        System.out.println("******* HR");
        System.out.println("Declaring class: " + hrClass.getDeclaringClass()); // class com.skillsoft.reflection.Main
        System.out.println("Enclosing class: " + hrClass.getEnclosingClass()); // class com.skillsoft.reflection.Main

        System.out.println("****** MobileApplication");
        System.out.println("Declaring class: " + mobileApplicationClass.getDeclaringClass()); // null
        System.out.println("Enclosing class: " + mobileApplicationClass.getEnclosingClass()); // class com.skillsoft.reflection.Main
    }
}

// https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Class.html
// Java docs for the class Class