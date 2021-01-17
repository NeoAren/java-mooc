package eu.neoaren.mooc.part_01.part_01_15;

import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a string:");
        String strInput = scanner.nextLine();
        System.out.println("Give an integer:");
        int intInput = Integer.parseInt(scanner.nextLine());
        System.out.println("Give a double:");
        double dblInput = Double.parseDouble(scanner.nextLine());
        System.out.println("Give a boolean:");
        boolean blnInput = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("You gave the string " + strInput);
        System.out.println("You gave the integer " + intInput);
        System.out.println("You gave the double " + dblInput);
        System.out.println("You gave the boolean " + blnInput);

    }

}
