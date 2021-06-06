/*
 *  UCF COP3330 Summer 2021 Assignment 7 Solution
 *  Copyright 2021 Sachin Mishra
 */

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double conversion = 0.09290304;

        System.out.print("What is the length of the room in feet? (Please enter whole numbers). ");
        int length = input.nextInt();

        System.out.print("What is the width of the room in feet? (Please enter whole numbers). ");
        int width = input.nextInt();

        int areaf = length * width;
        double aream = areaf * conversion;

        System.out.println();
        System.out.printf("The area is:%n%d square feet%n%f square meters", areaf, aream);
    }
}
