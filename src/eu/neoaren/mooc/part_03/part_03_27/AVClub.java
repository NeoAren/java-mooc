package eu.neoaren.mooc.part_03.part_03_27;

import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] items = input.split(" ");
                for (String item : items) {
                    if (item.contains("av")) {
                        System.out.println(item);
                    }
                }

            }
        }

    }

}
