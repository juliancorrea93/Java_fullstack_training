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
public class ControlStatements {
    public static void main (String[] args) {
        
        System.out.println("Multiplication output");
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i*j)+ " ");
            }
            System.out.println();
        }
        
        System.out.println("Addition output");
        
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i+j)+ " ");
            }
            System.out.println();
        }
        
        
    }

}
