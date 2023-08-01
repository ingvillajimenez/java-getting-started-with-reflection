package com.skillsoft.reflection;

public class Main {

    private static class HR extends Department {

        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> organizationClass = Class.forName("com.skillsoft.reflection.Organization");
        Class<?> employeeClass = Class.forName("com.skillsoft.reflection.Employee");
        Class<?> hrClass = Class.forName("com.skillsoft.reflection.Main$HR");
        Class<?> departmentClass = Class.forName("com.skillsoft.reflection.Department");

        System.out.println("****** toString() representations of custom class objects");
        System.out.println("Organization: " + organizationClass); // class com.skillsoft.reflection.Organization
        System.out.println("Employee: " + employeeClass); // class com.skillsoft.reflection.Employee
        System.out.println("HR: " + hrClass); // class com.skillsoft.reflection.Main$HR
        System.out.println("Department: " + departmentClass); // class com.skillsoft.reflection.Department

        System.out.println();

        Class<?> doubleClass = Class.forName("java.lang.Double");
        Class<?> hashSetClass = Class.forName("java.util.HashSet");
        Class<?> stringArrayClass = Class.forName("[[Ljava.lang.String;");
        Class<?> intArrayClass = Class.forName("[I");

        System.out.println("****** toString() representations of Java language class objects");
        System.out.println("Double: " + doubleClass); // class java.lang.Double
        System.out.println("HashSet: " + hashSetClass); // class java.util.HashSet
        System.out.println("String array: " + stringArrayClass); // class [[Ljava.lang.String;
        System.out.println("int array: " + intArrayClass); // class [I

        System.out.println();

        Class<?> enggClass = Class.forName("com.skillsoft.reflection.Main$Engineering"); // java.lang.ClassNotFoundException
    }
}

// https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Class.html
// Java docs for the class Class