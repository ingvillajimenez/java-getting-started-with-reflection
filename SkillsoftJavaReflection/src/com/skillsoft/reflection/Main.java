package com.skillsoft.reflection;

public class Main {
    public static void main(String[] args) {

        Employee jessica = new Employee("Jessica", "VP", 124000);

        System.out.println("Employee Jessica: " + jessica);
        System.out.println("Class for object Jessica: " + jessica.getClass());
        System.out.println("The Employee class: " + Employee.class);
        System.out.println();

        System.out.println("The class object is of type java.lang.Class: " +
                (jessica.getClass() instanceof java.lang.Class));
        System.out.println("This is the same class object of type java.lang.Class: " +
                (Employee.class instanceof java.lang.Class));
        System.out.println();

        System.out.println("Both are exactly the same class objects: " +
                (jessica.getClass().equals(Employee.class)));
        System.out.println();

//        System.out.println("Employee Jessica: " + jessica);
//        System.out.println("ID: " + jessica.getEmployeeId());
//        System.out.println("Name: " + jessica.getName());
//        System.out.println("Title: " + jessica.getTitle());
//        System.out.println("Salary: " + jessica.getSalary());

//        Employee jack = new Employee();
//
//        System.out.println("Employee Jack: " + jack);
//
//        Employee jessica = new Employee("Jessica", "VP", 124000);
//
//        System.out.println("Employee Jessica: " + jessica);

    }
}