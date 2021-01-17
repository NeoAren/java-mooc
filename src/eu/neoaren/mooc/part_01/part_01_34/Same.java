package eu.neoaren.mooc.part_01.part_01_34;

import java.util.Scanner;

public class Same {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String input1 = scanner.nextLine();
        System.out.println("Enter the second string:");
        String input2 = scanner.nextLine();

        if (input1.equalsIgnoreCase(input2)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

    }

}
