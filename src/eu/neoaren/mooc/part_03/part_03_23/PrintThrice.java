package eu.neoaren.mooc.part_03.part_03_23;

import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a word:");
        String input = scanner.nextLine();
        System.out.println(input + input + input);

    }

}
