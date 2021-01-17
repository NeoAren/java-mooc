package eu.neoaren.mooc.part_02.part_02_09;

import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int negatives = 0;

        while (true) {
            System.out.println("Give a number:");
            int input = Integer.parseInt(scanner.nextLine());
            if (input == 0) {
                break;
            } else if (input < 0) {
                negatives++;
            }
        }

        System.out.println("Number of negative numbers: " + negatives);

    }

}
