package eu.neoaren.mooc.part_03.part_03_26;

import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {
                String[] array = input.split(" ");
                for (String item : array) {
                    System.out.println(item);
                }
            }
        }

    }

}
