package com.skillsoft.reflection;

import java.util.ArrayList;
import java.util.List;

public class Main {

    enum Weekday {
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday
    }

    public static void main(String[] args) {

        int intVal = 23;
        long longVal = 20000;
        float floatVal = 34.6f;
        double doubleVal = 432.9;
        boolean boolVal = true;

//        System.out.println("int class: " + intVal.getClass()); // Cannot resolve method 'getClass()'
//        System.out.println("long class: " + longVal.getClass()); // Cannot resolve method 'getClass()'
//        System.out.println("float class: " + floatVal.getClass()); // Cannot resolve method 'getClass()'
//        System.out.println("double class: " + doubleVal.getClass()); // Cannot resolve method 'getClass()'
//        System.out.println("boolean class: " + boolVal.getClass()); // Cannot resolve method 'getClass()'

        System.out.println();

        System.out.println("int class: " + int.class); // int
        System.out.println("long class: " + long.class); // long
        System.out.println("float class: " + float.class); // float
        System.out.println("double class: " + double.class); // double
        System.out.println("boolean class: " + boolean.class); // boolean

        System.out.println("void class: " + void.class); // void

        System.out.println();

//        Object object = new Object();
//
//        System.out.println("Object class via object: " + object.getClass()); // java.lang.Object
//        System.out.println("Object class via class: " + Object.class); // java.lang.Object
//        System.out.println();
//
//        Integer integerObject = 123;
//
//        System.out.println("Integer class via object: " + integerObject.getClass()); // java.lang.Integer
//        System.out.println("Integer class via class: " + Integer.class); // java.lang.Integer
//        System.out.println();
//
//        Double doubleObject = 123.0;
//
//        System.out.println("Double class via object: " + doubleObject.getClass()); // java.lang.Double
//        System.out.println("Double class via class: " + Double.class); // java.lang.Double
//        System.out.println();
//
//        ArrayList arrayList = new ArrayList();
//
//        System.out.println("ArrayList class via object: " + arrayList.getClass()); // java.util.ArrayList
//        System.out.println("ArrayList class via class: " + ArrayList.class); // java.util.ArrayList
//        System.out.println();
//
//        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//
//        System.out.println("Integer ArrayList class via object: " + integerArrayList.getClass()); // java.util.ArrayList
//
//        System.out.println();
//
//        List<Integer> integerList = new ArrayList<>();
//        List<Float> floatList = new ArrayList<>();
//
//        System.out.println("Integer ArrayList class via object: " + integerList.getClass()); // java.util.ArrayList
//        System.out.println("Float ArrayList class via object: " + floatList.getClass()); // java.util.ArrayList
//
//        Integer[] integerArray = new Integer[] {1, 2, 3};
//        String[] stringArray = new String[] {"Ana", "Boris", "Christine"};
//        Object[] objectArray = new Object[] {"Ana", 2, 3.0};
//
//        System.out.println("Integer array class via object : " + integerArray.getClass()); // [Ljava.lang.Integer;
//        System.out.println("Integer array class via class : " + Integer[].class); // [Ljava.lang.Integer;
//        System.out.println();
//
//        System.out.println("String array class via object: " + stringArray.getClass()); // [Ljava.lang.String;
//        System.out.println("String array class via class: " + String[].class); // [Ljava.lang.String;
//        System.out.println();
//
//        System.out.println("Object array class via object: " + objectArray.getClass()); // [Ljava.lang.Object;
//        System.out.println("Object array class via class: " + Object[].class); // [Ljava.lang.Object;
//        System.out.println();
//
//        int[] intArray = new int[] {1, 2, 3};
//        long[] longArray = new long[] {1, 2, 3};
//        float[] floatArray = new float[] {1.2f, 2.3f, 3.4f};
//
//        System.out.println("int array class via object: " + intArray.getClass()); // [I
//        System.out.println("int array class via class: " + int[].class); // [I
//        System.out.println();
//
//        System.out.println("long array class via object: " + longArray.getClass()); //[J
//        System.out.println("long array class via class: " + long[].class); // [J
//        System.out.println();
//
//        System.out.println("float array class via object: " + floatArray.getClass()); // [F
//        System.out.println("float array class via class: " + float[].class); // [F
//        System.out.println();
//
//        Weekday day = Weekday.Friday;
//
//        System.out.println("enum class via object: " + day.getClass()); // com.skillsoft.reflection.Main$Weekday
//        System.out.println("enum class via class: " + Weekday.class); // com.skillsoft.reflection.Main$Weekday
//        System.out.println();
    }
}

// https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Class.html
// Java docs for the class Class