package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        double area;
        double radius;


        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();

        area = 3.14 * radius * radius;

    }
}
