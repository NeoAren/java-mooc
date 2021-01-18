package eu.neoaren.mooc.part_03.part_03_09;

import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        int greatest = 0;
        for (int integer : list) {
            greatest = Math.max(greatest, integer);
        }

        System.out.println("The greatest number: " + greatest);

    }

}
