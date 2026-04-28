package com._6.preparation2026.java21.newFeature.VECTORAPI;


public class Example {

/**
 * vector api is faster than loop
 */


    public static void main(String[] args) {
        float[] arr = {1.2f, 2.1f, 3.1f};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        /**
         * new approach
         */

       // FloatVector.fromArray(arr);
    }



}
