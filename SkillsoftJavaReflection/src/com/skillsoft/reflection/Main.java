package com.skillsoft.reflection;

public class Main {
    public static void main(String[] args) {

        Employee jack = new Employee();

        System.out.println("Employee Jack: " + jack);

        Employee jessica = new Employee("Jessica", "VP", 124000);

        System.out.println("Employee Jessica: " + jessica);

    }
}