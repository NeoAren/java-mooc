package eu.neoaren.mooc.part_01.part_01_14;

import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        boolean input = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("True or false? " + input);

    }

}
