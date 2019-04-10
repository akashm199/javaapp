/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp;

import java.util.Arrays;

/**
 *
 * @author akash
 */
public class JavaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Author :: Akash Mishra");
        System.out.println("This is A Test Enviroment.");
        //***********************Highest/Lowest Number from an array//
        int[] inputArray = {210, 210, 129, 1, 22, 20, 31, 20, 18, 92, 129, 2, 43, 20, 2};
        Arrays.sort(inputArray);
        System.out.println("Input Array " + Arrays.toString(inputArray));
        getHighestNumber(inputArray);
        getLowestNumber(inputArray);
        getSecondHighest(inputArray);
        //**************************************************//
    }

    public static void getHighestNumber(int[] inputarray) {
        int temp1 = 0;
        if (inputarray.length > 0) {
            for (int i = 0; i < inputarray.length; i++) {
                if (inputarray[i] > temp1) {
                    temp1 = inputarray[i];
                }
            }
            System.out.println("Highest :: " + temp1);
        } else {
            System.out.println("Input array empty!");
        }
    }

    public static void getLowestNumber(int[] iputarray) {
        int temp1 = 0;
        if (iputarray.length > 0) {
            temp1 = iputarray[0];
            for (int i = 0; i < iputarray.length; i++) {
                if (iputarray[i] < temp1) {
                    temp1 = iputarray[i];
                } else {

                }
            }
            System.out.println("Lowest :: " + temp1);
        } else {
            System.out.println("Input array empty!");
        }
    }

    public static void getSecondHighest(int[] array) {
        int max = array[0], secondmax = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondmax = max;
                max = array[i];
            } else if (array[i] != max && array[i] > secondmax) {
                secondmax = array[i];
            }
        }
        System.out.println("Second Max:: " + secondmax);
        System.out.println("Max:: " + max);
    }
}
