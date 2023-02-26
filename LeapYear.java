package com.Bridglabs; //leap year

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        System.out.println("Enter year: ");
        Scanner r=new Scanner(System.in);
        year=r.nextInt();

        if (year%400==0){
            System.out.println(year+ " is a leap year");
        } else if (year%4==0 && year%100!=0 ) {
            System.out.println(year+ " is a leap year");
        }
        else{
            System.out.println(year+ " is not leap year");
        }
    }
}
