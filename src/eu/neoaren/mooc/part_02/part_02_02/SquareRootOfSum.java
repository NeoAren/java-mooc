package eu.neoaren.mooc.part_02.part_02_02;

import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int sum = number1 + number2;
        System.out.println(Math.sqrt(sum));

    }

}
