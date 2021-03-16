package com.practice;

import java.util.Scanner;

public class userInput {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        System.out.println(a);
        System.out.println("Enter a double:");
        double d = scan.nextDouble();
        System.out.println(d);
        System.out.println("Enter a float:");
        float f = scan.nextFloat();
        System.out.println(f);
        System.out.println("Enter a boolean value:");
        Boolean b = scan.nextBoolean();
        System.out.println(b);
    }
}
