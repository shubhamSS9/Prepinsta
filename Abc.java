package com.Bridglabs;

public class Abc {
    public static void main(String[] args) {
        int z=21;
        int res1=z++ + z++ + ++z + ++z + z++;
        System.out.println(z);
        System.out.println(res1);

        System.out.println("-----------");

        int res2=z-- - z-- + z++ + --z + z-- - ++z + --z;
        System.out.println(z);
        System.out.println(res2);
    }
}
