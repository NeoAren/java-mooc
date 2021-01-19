package eu.neoaren.mooc.part_03.part_03_20;

public class SumOfArray {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));

    }

    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int item : array) {
            sum += item;
        }
        return sum;
    }

}
