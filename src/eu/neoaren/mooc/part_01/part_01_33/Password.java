package eu.neoaren.mooc.part_01.part_01_33;

import java.util.Scanner;

public class Password {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Password?");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }

    }

}
