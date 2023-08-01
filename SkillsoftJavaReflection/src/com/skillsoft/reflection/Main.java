package com.skillsoft.reflection;

import java.lang.reflect.Modifier;

public class Main {

    private static final class HR extends Department {

        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> organizationClass = Class.forName("com.skillsoft.reflection.Organization");
        Class<?> employeeClass = Class.forName("com.skillsoft.reflection.Employee");
        Class<?> hrClass = Class.forName("com.skillsoft.reflection.Main$HR");
        Class<?> departmentClass = Class.forName("com.skillsoft.reflection.Department");

        System.out.println("****************** Organization");

        int organizationModifiers = organizationClass.getModifiers();
        System.out.println("Organization class modifiers: " + organizationModifiers); // 17
        System.out.println("Organization class modifiers in binary format: " +
                Integer.toBinaryString(organizationModifiers)); // 10001

        System.out.println("Public: " + Modifier.isPublic(organizationModifiers)); // true
        System.out.println("Final: " + Modifier.isFinal(organizationModifiers)); // true

        System.out.println("Abstract: " + Modifier.isAbstract(organizationModifiers)); // false
        System.out.println("Static: " + Modifier.isStatic(organizationModifiers)); // false

        System.out.println("****************** Department");

        int departmentModifiers = departmentClass.getModifiers();
        System.out.println("Department class modifiers: " + departmentModifiers); // 1025
        System.out.println("Department class modifiers in binary format: " +
                Integer.toBinaryString(departmentModifiers)); // 10000000001

        System.out.println("Public: " + Modifier.isPublic(departmentModifiers)); // true
        System.out.println("Abstract: " + Modifier.isAbstract(departmentModifiers)); // true

        System.out.println("******************* HR");

        int hrModifiers = hrClass.getModifiers();
        System.out.println("HR class modifiers: " + hrModifiers); // 26
        System.out.println("HR class modifiers in binary format: " +
                Integer.toBinaryString(hrModifiers)); // 11010

        System.out.println("Private: " + Modifier.isPrivate(hrModifiers)); // true
        System.out.println("Static: " + Modifier.isStatic(hrModifiers)); // true
        System.out.println("Final: " + Modifier.isFinal(hrModifiers)); // true

        System.out.println("******************* Employee");

        int employeeModifiers = employeeClass.getModifiers();
        System.out.println("Employee class modifiers: " + employeeModifiers); // 1
        System.out.println("Employee class modifiers in binary format: " +
                Integer.toBinaryString(employeeModifiers)); // 1

        System.out.println("Public: " + Modifier.isPublic(employeeModifiers)); // true
    }
}

// https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Class.html
// Java docs for the class Class