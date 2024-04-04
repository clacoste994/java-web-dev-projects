package org.launchcode;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Double area;
        Scanner input = new Scanner(System.in);
        System.out.println("Rectangle length Please: ");
        Double triLength = input.nextDouble();

        System.out.println("Rectangle width Please: ");
        Double triWidth = input.nextDouble();
        input.close();

        area = triLength * triWidth;
        System.out.println("Your rectangles area is " + area);
    }
}
