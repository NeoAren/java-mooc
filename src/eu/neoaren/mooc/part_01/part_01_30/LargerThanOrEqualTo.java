package eu.neoaren.mooc.part_01.part_01_30;

import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Give the first number:");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 == num2) {
            System.out.println("The numbers are equal!");
        } else if (num1 < num2) {
            System.out.println("Greater number is: " + num2);
        } else {
            System.out.println("Greater number is: " + num1);
        }

    }

}
