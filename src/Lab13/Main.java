package Lab13;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.sort;

public class Main {

    public static void main(String[] args) {
        LogicalOp myOp= new LogicalOp();
        myOp.afisareArray(myOp.getArrayToHundred());
        myOp.afisareArray(myOp.getArrayEvenNumbers());

        //Ex.4
        int[] numbers= {1, 7, 9, 67, 9, -65, 77, 123, 2309};
        System.out.println(myOp.getAveregeOfArrayNumners(numbers));

        //Ex5
       String[] animals = {"dog", "cat", "mouse", "horse", "cow", "pig"};
        System.out.println(myOp.findStringInArray(animals, "cat"));

        //Ex6
        int[] numbers2 = {6, 9, 15, 42};
        System.out.println(  myOp.findNumberInArray(numbers2,15));

        //Ex8
        int[] numbers3 = {34, 21, 9, 4, 10, 3};
            System.out.print(Arrays.toString(myOp.removeOneElememFromArray(numbers3, 21)));

        //Ex9
        int[] numbers4 = {-9, 34, 21, 9, 4, 10, 3};
        System.out.print(myOp.getSecondSmallestFromArray(numbers4));

        //Ex10
        int[] numbers5 = {-9, 34, 21, 1, 9, 4, 10, 3};
        int [] newNumbers = new int[numbers2.length];
        System.out.print(Arrays.toString(myOp.copyFromArray(numbers5, newNumbers)));





    }




}
