package com.Bridglabs;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int i=1,fact=1,num;
        System.out.println("Enter number: ");
        Scanner r=new Scanner(System.in);
        num =r.nextInt();

        while (i<=num){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of number: "+ fact);


    }
}
