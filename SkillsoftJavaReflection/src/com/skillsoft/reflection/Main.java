package com.skillsoft.reflection;

public class Main {

    enum Weekday  {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday
    }

    public static void main(String[] args) {

        Weekday day = Weekday.Monday;

        System.out.println("************ Enum");

        System.out.println("Is enum: " + day.getClass().isEnum()); // true
        System.out.println("Is primitive: " + day.getClass().isPrimitive()); // false

        System.out.println();

        Integer[] integerArray = new Integer[] {1, 2, 3, 4};

        System.out.println("************** Integer arrays");

        System.out.println("Is array: " + integerArray.getClass().isArray()); // true
        System.out.println("Is primitive: " + integerArray.getClass().isPrimitive()); // false

        System.out.println();

        int[] intArray = new int[] {1, 2, 3, 4};

        System.out.println("*************** int arrays");

        System.out.println("Is array: " + intArray.getClass().isArray()); // true
        System.out.println("Is primitive: " + intArray.getClass().isPrimitive()); // false

        System.out.println();

        System.out.println("************** ints");

        System.out.println("Is array: " + int.class.isArray()); // false
        System.out.println("Is primitive: " + int.class.isPrimitive()); // true

        System.out.println();
    }
}

// https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Class.html
// Java docs for the class Class