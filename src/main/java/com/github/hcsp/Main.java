package com.github.hcsp;

public class Main {
    public static void main(String[] args) {
        System.out.println("1+1=" + addOne(1));
        System.out.println("2+1=" + addOne(2));
        System.out.println("3+1=" + addOne(3));
    }

    public static int addOne(int i ){
        return i+1;
    }
}
