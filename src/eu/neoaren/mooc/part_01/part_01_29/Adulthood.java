package eu.neoaren.mooc.part_01.part_01_29;

import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int number = Integer.parseInt(scanner.nextLine());
        if (number >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }

    }

}
