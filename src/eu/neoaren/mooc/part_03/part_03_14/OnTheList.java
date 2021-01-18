package eu.neoaren.mooc.part_03.part_03_14;

import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            list.add(input);
        }

        System.out.println("Search for?");
        String input = scanner.nextLine();

        int index = list.indexOf(input);

        if (index != -1) {
            System.out.println(input + " was found!");
        } else {
            System.out.println(input + " was not found!");
        }

    }

}
