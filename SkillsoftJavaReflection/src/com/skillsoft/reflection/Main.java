package com.skillsoft.reflection;

public class Main {

    private static class HR extends Department {

        public HR() {
            super("HR");
        }
    }

    public static void main(String[] args) {

        Department hr = new HR();

        System.out.println("**************** HR");

        System.out.println("Is local class: " + hr.getClass().isLocalClass()); // false
        System.out.println("Is member class: " + hr.getClass().isMemberClass()); // true

        System.out.println();
//
//        Employee julian = new Employee(43000, 5);
//
//        System.out.println("************ Employee");
//
//        System.out.println("Is local class: " + julian.getClass().isLocalClass()); // false
//        System.out.println("Is member class: " + julian.getClass().isMemberClass()); // false
//
//        System.out.println();
//
//        Employee.Salary salary = julian.getSalary();
//
//        System.out.println("************* Employee.Salary");
//
//        System.out.println(salary.toString()); // ID: 951808072, Base salary: 43000.000000, Bonus percentage: 5.000000
//
//        System.out.println("Is local class: " + salary.getClass().isLocalClass()); // false
//        System.out.println("Is member class: " + salary.getClass().isMemberClass()); // true
//
//        System.out.println();

//        System.out.println("************** Deliverable");
//
//        System.out.println("Is anonymous class: " + Deliverable.class.isAnonymousClass()); // false
//        System.out.println("Is local class: " + Deliverable.class.isLocalClass()); // false
//        System.out.println("Is interface: " + Deliverable.class.isInterface()); // true
//
//        System.out.println();
//
//        Deliverable webApplication = new Deliverable() {
//
//            @Override
//            public String getProjectName() {
//                return "Mongo Web Application";
//            }
//
//            @Override
//            public String getProjectStatus() {
//                return "In Progress";
//            }
//        };
//
//        System.out.println("*************** Instance of Deliverable (web application)");
//
//        System.out.println("Is anonymous class: " + webApplication.getClass().isAnonymousClass()); // true
//        System.out.println("Is local class: " + webApplication.getClass().isLocalClass()); // false
//        System.out.println("Is interface: " + webApplication.getClass().isInterface()); // false
//
//        System.out.println();
//
//        class MobileApplication implements Deliverable {
//
//            @Override
//            public String getProjectName() {
//                return "Mongo Mobile Application";
//            }
//
//            @Override
//            public String getProjectStatus() {
//                return "Deployed";
//            }
//        }
//
//        Deliverable mobileApplication = new MobileApplication();
//
//        System.out.println("**************** Instance of Deliverable (mobile application)");
//
//        System.out.println("Is anonymous class: " + mobileApplication.getClass().isAnonymousClass()); // false
//        System.out.println("Is local class: " + mobileApplication.getClass().isLocalClass()); // true
//        System.out.println("Is interface: " + mobileApplication.getClass().isInterface()); // false
//
//        System.out.println();

    }
}

// https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Class.html
// Java docs for the class Class