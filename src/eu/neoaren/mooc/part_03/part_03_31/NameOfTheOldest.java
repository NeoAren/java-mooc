package eu.neoaren.mooc.part_03.part_03_31;

import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] person = input.split(",");
                if (oldest < Integer.parseInt(person[1])) {
                    oldest = Integer.parseInt(person[1]);
                    name = person[0];
                }
            }
        }

        System.out.println("Name of the oldest: " + name);

    }

}
