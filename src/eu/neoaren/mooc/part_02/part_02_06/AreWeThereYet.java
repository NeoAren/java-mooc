package eu.neoaren.mooc.part_02.part_02_06;

import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int response = 0;
        while (response != 4) {
            System.out.println("Give a number:");
            response = Integer.parseInt(scanner.nextLine());
        }

    }

}
