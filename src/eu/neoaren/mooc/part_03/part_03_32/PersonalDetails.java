package eu.neoaren.mooc.part_03.part_03_32;

import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ageSum = 0;
        int ageCount = 0;
        String longest = "";

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] person = input.split(",");
                if (longest.length() < person[0].length()) {
                    longest = person[0];
                }
                ageSum += Integer.parseInt(person[1]);
                ageCount++;
            }
        }

        System.out.println("Longest name: " + longest);
        System.out.println("Average of birth years: " + (1.0 * ageSum / ageCount));

    }

}
