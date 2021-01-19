package eu.neoaren.mooc.part_03.part_03_22;

public class PrintInStars {

    public static void main(String[] args) {

        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);

    }

    public static void printArrayInStars(int[] array) {
        for (int item : array) {
            for (int i = 0; i < item; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
