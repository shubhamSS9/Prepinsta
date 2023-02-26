package com.Bridglabs;

public class ReverseNum {
    public static void main(String[] args) {
        int num = 123, rev = 0;
        System.out.println("Original Number: " + num);
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        System.out.println("Reverse Num: " + rev);

    }
}
