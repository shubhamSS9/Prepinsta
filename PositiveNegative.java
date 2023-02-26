package com.Bridglabs;  //program to find positive or negative numbers.
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number: ");
        Scanner r=new Scanner(System.in);
        n=r.nextInt();

        if (n>0){
            System.out.println("Positive number");
        } else if (n<0) {
            System.out.println("Negetive number");
        }
        else {
            System.out.println("Zero");
        }
    }
}
