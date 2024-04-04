package org.launchcode;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {

        Double mph;
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven?: ");
        Double miles = input.nextDouble();

        System.out.println("Gallons of gas consumed?: ");
        Double gas = input.nextDouble();
        input.close();

        mph = miles / gas;
        System.out.println("Your miles per gallon is " + mph);
    }
}
