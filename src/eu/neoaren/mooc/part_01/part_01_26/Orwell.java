package eu.neoaren.mooc.part_01.part_01_26;

import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int year = Integer.parseInt(scanner.nextLine());
        if (year == 1984) {
            System.out.println("Orwell");
        }

    }

}
