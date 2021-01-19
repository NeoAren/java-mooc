package eu.neoaren.mooc.part_03.part_03_21;

public class PrintNeatly {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);

    }

    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i + 1 != array.length) {
                System.out.print(", ");
            }
        }
    }

}
