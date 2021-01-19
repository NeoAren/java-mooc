package eu.neoaren.mooc.part_03.part_03_28;

import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                System.out.println(input.split(" ")[0]);
            }
        }

    }

}
