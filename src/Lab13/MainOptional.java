package Lab13;

import java.util.Arrays;

public class MainOptional {

    public static void main(String[] args){
        LogicalOpOptional logicalOpOptional = new LogicalOpOptional();
        /*
        * Ex2:
        * Creati o metoda care insereze un element pe o pozitie specifica intr-un array.
         */
        int[] numbers = { 2, -6, 0, 21, 231, 11, 3};
        System.out.println("Ex2 : "+Arrays.toString(logicalOpOptional.insertElementAtIndex(numbers, 1, 202)));

        /*
         *
         * Ex3. Creati o metoda care sa gaseasca cel mai mare si cel mai mic numar dintr-un array.
         *
         */
        System.out.println("Ex3 : "+ Arrays.toString(logicalOpOptional.getSmallestAndLargestFromArray(numbers)));


        /*
         *
         * Ex4. Creati o metoda care sa inverseze valorile unui array de int-uri.
         */
        System.out.println("Ex4 : "+Arrays.toString(logicalOpOptional.reversedArray(numbers)));

        /*
         *
         * Ex7. Creati o metoda care sa primeasca un array de numere ne-ordonat, si sa il returneze ordonat crescator.
         */
        System.out.println("Ex7 : "+Arrays.toString(logicalOpOptional.sortAscendingArray(numbers)));

    }
}
