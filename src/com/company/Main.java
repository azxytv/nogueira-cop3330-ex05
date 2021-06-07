package com.company;
import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 5 Solution
 *  Copyright 2021 Adam Nogueira
 */

public class Main {

    public static void main(String[] args) {
        Scanner first= new Scanner(System.in);
        Scanner second = new Scanner(System.in);



        System.out.println("What is the first number?");

        int firststr = first.nextInt();

        System.out.println("What is the second Number?");

        int secondstr = second.nextInt();
        int sum = firststr + secondstr;
        int diff = firststr - secondstr;
        int mult = firststr*secondstr;
        int divi = firststr/secondstr;
        System.out.println(firststr + " + " + secondstr + " = " + sum );
        System.out.println(firststr + " - " + secondstr + " = " + diff);
        System.out.println(firststr + " * " + secondstr + " = " + mult);
        System.out.println(firststr + " / " + secondstr + " = " + divi);

        }
}
