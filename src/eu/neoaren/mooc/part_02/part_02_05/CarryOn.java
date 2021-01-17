package eu.neoaren.mooc.part_02.part_02_05;

import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Shall we carry on?");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

    }

}
