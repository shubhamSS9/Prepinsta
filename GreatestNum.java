package com.Bridglabs; //Greatest of two numbers.

import java.util.Scanner;

public class GreatestNum {
    public static void main(String[] args) {
        int num1,num2;
        System.out.println("Enter First Number: ");
        System.out.println("Enter Second Number: ");

        Scanner r=new Scanner(System.in);
        num1=r.nextInt();
        num2=r.nextInt();

        if (num1>num2){
            System.out.println(num1+ " Is greater than "+ num2);
        }
        else if (num2>num1) {
            System.out.println(num2+ " Is greater than "+ num1);
        }
        else{
            System.out.println(num1+ " and "+ num2+ " equal");
        }
    }
}
