package com.Bridglabs;

import java.util.Scanner;

public class GreatestThreeNum {
    public static void main(String[] args) {
        int num1, num2, num3;
        System.out.println("Enter first number: ");
        System.out.println("Enter second number: ");
        System.out.println("Enter third number: ");

        Scanner r = new Scanner(System.in);
        num1 = r.nextInt();
        num2 = r.nextInt();
        num3 = r.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num1 is greater");
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("num2 is greater");
        } else if (num3 >= num1 && num3 >= num2) {
            System.out.println("num3 is greater");
        } else {
            System.out.println("All numbers are same");

        }
    }
}
