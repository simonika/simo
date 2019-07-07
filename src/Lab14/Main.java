package Lab14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[]args){
        LogicalOp myOp = new LogicalOp();


     /*
     * Ex1: Scrieti o metoda Java, care sa primeasca parametru o Lista, si sa afiseze, pe rand,
     * toate valorile din lista, fiecare pe rand nou.
     *
      */
        List<String> list = Arrays.asList("dog", "cow", "horse", "cat", "frog", "mouse");
        myOp.printList(list);

        List<String> list2 = new ArrayList<>();
        list2.add("dog");
        list2.add("cow");
        list2.add("horse");
        list2.add("cat");
        list2.add("frog");
        list2.add("mouse");
        myOp.addStringToList(list2, "rat");

        /*
        *
        * Ex. 2 Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
        * si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.
         */

        List<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(5);
        listOfNumbers.add(15);
        listOfNumbers.add(26);
        listOfNumbers.add(31);
        listOfNumbers.add(13);
        myOp.addNumberInList(listOfNumbers, 56);

        /*
        *
        *
         *Ex3: Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
         * iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
         *  fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru
         */
        System.out.println("Ex:3");
        myOp.addElementInListAndPrint(listOfNumbers, 45);

        /*
        * Ex4:
        *Scrieti o metoda Java,
         * care sa primeasca parametru o Lista, si sa afiseze, pe rand, toate valorile din lista,
         * dar invers(de la capat la inceput).
         */
        System.out.println("Ex:4");
        List<Integer> listOfNumbers2 = new ArrayList<Integer>();
        listOfNumbers2.add(5);
        listOfNumbers2.add(15);
        listOfNumbers2.add(26);
        listOfNumbers2.add(31);
        listOfNumbers2.add(13);

        myOp.printListReversed(listOfNumbers2);

        /*
        *Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri,
       * unul de tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita,
        *iar parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.
         */

        //Ex:5
        System.out.println("Ex:5");

        List<String> list3 = new ArrayList<>();
        list3.add("dog");
        list3.add("cow");
        list3.add("horse");
        list3.add("cat");
        list3.add("frog");
        list3.add("mouse");
        myOp.addStringToListAtIndex(list3, 3, "rat");
        System.out.println(list3.toString());

        //Ex7
        System.out.println("Ex:7");
        List<String> list4 = new ArrayList<>();
        list4.add("dog");
        list4.add("cow");
        list4.add("horse");
        list4.add("cat");
        list4.add("frog");
        list4.add("mouse");

        myOp.printElementListAndIndex(list4);

        /*
         * Ex8:
         *Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.
         */
        System.out.println("Ex:8");
        List<Integer> listOfNumbers3 = new ArrayList<>();
        listOfNumbers3.add(5);
        listOfNumbers3.add(15);
        listOfNumbers3.add(26);
        listOfNumbers3.add(31);
        listOfNumbers3.add(13);

        System.out.println("The largest number from list is: " + myOp.getTheLargestNumber(listOfNumbers3));





    }





}
