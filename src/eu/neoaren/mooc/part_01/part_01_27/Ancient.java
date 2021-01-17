package eu.neoaren.mooc.part_01.part_01_27;

import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int year = Integer.parseInt(scanner.nextLine());
        if (year < 2015) {
            System.out.println("Ancient history!");
        }

    }

}
