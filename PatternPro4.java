package com.Bridglabz;

public class PatternPro4 {
    public static void main(String[] args) {
        int r=5;
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print("*");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
