package eu.neoaren.mooc.part_01.part_01_07;

import java.util.Scanner;

public class MessageThreeTimes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        String input = scanner.nextLine();
        System.out.println(input + "\n" + input + "\n" + input);

    }

}
