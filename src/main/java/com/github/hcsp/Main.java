package com.github.hcsp;

public class Main {
    public static void main(String[] args) {
        System.out.println("1+1=" + addOne(1));
        System.out.println("2+1=" + addOne(2));
        System.out.println("3+1=" + addOne(3));
    }

    // Create an addOne(int i) method here to increment an integer
    // 在这里编写一个addOne(int i)方法，对整数执行加1操作
    public static int addOne(int i) {
        return i+1;
    }
}
