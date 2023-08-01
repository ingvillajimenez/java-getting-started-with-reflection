package com.skillsoft.reflection;

import java.lang.reflect.Constructor; // Reflection Constructor class
//import java.lang.reflect.Method; // Reflection Method class
//import java.lang.reflect.Field; // Reflection Field class

public class Main {
    public static void main(String[] args) {

        Employee jessica = new Employee("Jessica", "VP", 124000);

        System.out.println("Employee Jessica: " + jessica);

        Class<?> employeeClass = jessica.getClass();

        System.out.println("Class for object Jessica: " + employeeClass);
        System.out.println();

        Constructor<?>[] constructors = employeeClass.getConstructors(); // getConstructors only gets the public constructor methods

        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

//        Method[] methods = employeeClass.getMethods(); // getMethods only gets the public methods
//
//        for (Method method : methods) {
//            System.out.println(method);
//        }

//        Field[] fields = employeeClass.getFields(); // getFields method is only going to return all of the public fields
//
//        System.out.println("Fields of the Employee class: " + fields);
//        System.out.println();
//
//        for (Field field: fields) {
//            System.out.println(field);
//        }
    }
}