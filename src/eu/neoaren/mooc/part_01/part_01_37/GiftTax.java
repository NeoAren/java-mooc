package eu.neoaren.mooc.part_01.part_01_37;

import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.parseInt(scanner.nextLine());

        if (value < 5000) {
            System.out.println("No tax!");
        } else if (value < 25000) {
            double tax = 0.08 * (value-5000) + 100;
            System.out.println("Tax: " + tax);
        } else if (value < 55000) {
            double tax = 0.10 * (value-25000) + 1700;
            System.out.println("Tax: " + tax);
        } else if (value < 200000) {
            double tax = 0.12 * (value-55000) + 4700;
            System.out.println("Tax: " + tax);
        } else if (value < 1000000) {
            double tax = 0.15 * (value-200000) + 22100;
            System.out.println("Tax: " + tax);
        } else {
            double tax = 0.17 * (value-1000000) + 142100;
            System.out.println("Tax: " + tax);
        }

    }

}
