package eu.neoaren.mooc.part_03.part_03_13;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

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

        int sum = 0;
        for (int item : list) {
            sum += item;
        }

        System.out.println("Average: " + (1.0 * sum / list.size()));

    }

}
