package eu.neoaren.mooc.part_03.part_03_30;

import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int oldest = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] person = input.split(",");
                oldest = Math.max(oldest, Integer.parseInt(person[1]));
            }
        }

        System.out.println("Age of the oldest: " + oldest);

    }

}
