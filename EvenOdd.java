//Program for find even or odd numbers.
package com.Bridglabs;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number: ");   //taking input from user.
        Scanner r=new Scanner(System.in);
        n= r.nextInt();

        if (n%2==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }
}
