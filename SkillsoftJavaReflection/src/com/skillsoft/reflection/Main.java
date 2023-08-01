package com.skillsoft.reflection;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Object object = new Object();

        System.out.println("Object class via object: " + object.getClass());
        System.out.println("Object class via class: " + Object.class);
        System.out.println();

        Integer integerObject = 123;

        System.out.println("Integer class via object: " + integerObject.getClass());
        System.out.println("Integer class via class: " + Integer.class);
        System.out.println();

        Double doubleObject = 123.0;

        System.out.println("Double class via object: " + doubleObject.getClass());
        System.out.println("Double class via class: " + Double.class);
        System.out.println();

        ArrayList arrayList = new ArrayList();

        System.out.println("ArrayList class via object: " + arrayList.getClass());
        System.out.println("ArrayList class via class: " + ArrayList.class);
        System.out.println();

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        System.out.println("Integer ArrayList class via object: " + integerArrayList.getClass());

        System.out.println();

        List<Integer> integerList = new ArrayList<>();
        List<Float> floatList = new ArrayList<>();

        System.out.println("Integer ArrayList class via object: " + integerList.getClass());
        System.out.println("Float ArrayList class via object: " + floatList.getClass());


    }
}

// https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Class.html
// Java docs for the class Class