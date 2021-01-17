package eu.neoaren.mooc.part_02.part_02_30;

public class Smallest {

    public static void main(String[] args) {
        int result = smallest(2, 7);
        System.out.println("Smallest: " + result);
    }

    public static int smallest(int number1, int number2) {
        return Math.min(number1, number2);
    }

}
