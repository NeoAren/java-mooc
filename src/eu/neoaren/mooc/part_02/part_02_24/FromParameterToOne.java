package eu.neoaren.mooc.part_02.part_02_24;

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(7);
    }

    public static void printFromNumberToOne(int number) {
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }

}
