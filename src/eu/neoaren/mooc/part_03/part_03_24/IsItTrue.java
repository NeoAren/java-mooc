package eu.neoaren.mooc.part_03.part_03_24;

import java.util.Scanner;

public class IsItTrue {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }

    }

}
