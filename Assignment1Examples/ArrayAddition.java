/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.correajulian.capgemini;

/**
 *
 * @author Julian
 */
public class ArrayAddition {
    public static void main(String[] args) {
        int[] arr = new int[5];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        
        int sum = 0;
        //prints each number as it is added
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        //prints some of numbers 1-5
        System.out.println(sum);
    }
}
