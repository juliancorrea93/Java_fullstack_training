/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.correajulian.capgemini;

import java.util.Scanner;

/**
 * 
 * @author Julian
 */
public class Menu {
    
    public void start() {
        
        while (true) {
            display();

            int op = getSelection();

            switch (op) {
                case 1:
                    add();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    mul();
                    break;
                case 4:
                    div();
                    break;

            }
            if (op == 5) {
                System.out.println("Exiting");
                break;
            }
        }
    }
    private void display() {
        System.out.println("Please select an option below using the corresponding number");
        System.out.println("1. Addition");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Exit");
    }
    
    private int getSelection() {
        //Real world example would account for InputMismatchException here and for all input regarding Scanner methods
        int selection;
        System.out.println("Please input a selection: ");
        selection = sc.nextInt();
            
        if (selection < 1 || selection > 5) {
            System.out.println("Please input a valid selection");
            selection = getSelection();
        }
            
        return selection;
    }
    
    private void add() {
        System.out.println("Please input two integer numbers");
        int num1 = sc.nextInt();
        System.out.println("You entered: " + num1);
        int num2 = sc.nextInt();
        System.out.println("You entered: " + num2);
        
        System.out.println(num1+num2);
    }
    
    private void sub() {
        System.out.println("Please input two integer numbers");
        int num1 = sc.nextInt();
        System.out.println("You entered: " + num1);
        int num2 = sc.nextInt();
        System.out.println("You entered: " + num2);
        
        System.out.println(num1-num2);
    }
    
    private void mul() {
        System.out.println("Please input two integer numbers");
        int num1 = sc.nextInt();
        System.out.println("You entered: " + num1);
        int num2 = sc.nextInt();
        System.out.println("You entered: " + num2);
        
        System.out.println(num1 * num2);
    }
    
    private void div() {
        System.out.println("Please input two integer numbers (format is num1/num2)");
        int num1 = sc.nextInt();
        System.out.println("You entered: " + num1);
        int num2 = sc.nextInt();
        System.out.println("You entered: " + num2);
        
        double ans = (double) num1 / num2;
        System.out.println(ans);
    }
    
    Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        Menu m = new Menu();
        
        m.start();
    } 
}
