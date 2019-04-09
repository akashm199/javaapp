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
        int[] inputArray = {0, -1, 129, -1, 22, 20, 31, 20, 18, 92, 129, 2, 43, 20, 2};
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
        int size = array.length, temp;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(":: " + Arrays.toString(array));
        System.out.println("Third second largest number is:: " + array[size - 2]);
    }
}
