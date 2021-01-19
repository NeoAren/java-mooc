package eu.neoaren.mooc.part_03.part_03_18;

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("");

        System.out.println("Give two indices to swap:");
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;

        System.out.println("");
        for (int j : array) {
            System.out.println(j);
        }

    }

}
