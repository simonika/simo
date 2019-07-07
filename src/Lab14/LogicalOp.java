package Lab14;

import java.util.List;

//tema lab 12
public class LogicalOp {

    public void printCounterStartingWith(int startNumber){
        if(startNumber > 0) {
            for (int i = 0; i < 100; i++) {
                if (i >= startNumber) {
                    System.out.println(i);
                }
            }
        }else{
            System.out.println("startNumber should be > 0");
        }

    }

    public void printCounterDecreseWith(int startNumber){
            for (int i = startNumber; i>= -100; i--) {
                    System.out.println(i);
                }
    }
    public void printBetweenNumbers (int startNumber, int stopNumber){
        for (int i = startNumber; i<=stopNumber; i++) {
            System.out.println(i);
        }
    }

    public void printBetweenNumbersCheck (int startNumber, int stopNumber){
        if(startNumber < stopNumber) {
            for (int i = startNumber; i <= stopNumber; i++) {
                System.out.println(i);
            }
        }else if(startNumber > stopNumber){
            for (int i = stopNumber; i <= startNumber; i++) {
                System.out.println(i);
            }
            }else {
            System.out.println("other case");
        }
    }

    public void printEvenNumbers (){
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0)
            System.out.println(i);

        }
    }

    public void printUnevenNumers (){
        for (int i = 0; i<= 100; i++){
            if (i % 2 != 0)
                System.out.println(i);
        }
    }

    public int printSumOfNumbers(int startNumber){
        int calculator=0;
        for(int i = startNumber; i<=100; i++){
            calculator =calculator + i;
        }

        return calculator;
    }

    public double printAveregeOfNumbers(int startNumber){
        double calculator=0.0;
        int counter = 0;
        for(int i = startNumber; i<=100; i++, counter++){
            calculator =calculator+i;

        }
        return Double.valueOf(calculator/counter);
    }

    public void printPattern(){
        String symbol = "*";
        String printSymbol = "";

        for(int i = 0; i<=7; i++ ){
            printSymbol += symbol;
            System.out.println(printSymbol);
        }
    }

    public void printToHundredWhile(int number){
        while (number<=100){
            System.out.println(number);
            number++;

        }

    }


    public void printToHundreBackwardsWhile(int number){
        //
        while (number>= -100){
            System.out.println(number);
            number--;

        }

    }

    public void printBetweenNumbersWhile( int firstParam, int secondParam ){

        while(firstParam<= secondParam){
            System.out.println(firstParam);
            firstParam++;
        }

        while(firstParam >= secondParam){
            System.out.println(secondParam);
            secondParam++;
        }


    }

    public void printEvenNumbersWhile(){
        int i = 0;
        while( i < 100){
            if(i % 2 == 0)
            System.out.println(i);
            i++;
        }

    }

    public void printUevenNumbersWhile(){
        int i = 0;
        while( i < 100){
            if(i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

    }


    public void printList(List<String> list) {
        for (int i = 0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public void printList2(List<String> list) {
        System.out.println("list has "+list.size() + " elements !");
        for (String animal :  list){
            System.out.println(list.indexOf(animal)+" "+ animal);
        }
    }

    public void addNumberInList(List<Integer> listOfNumbers, int i) {
        int index = listOfNumbers.size();
        listOfNumbers.add(i);
        System.out.println(listOfNumbers.toString());
    }

    public void addStringToList(List<String> list, String animal) {
        list.add(animal);
        System.out.println(list.toString());
    }

    public void addElementInListAndPrint(List<Integer> listOfNumbers, int element) {
        listOfNumbers.add(0, element);
        for(int index = 0; index< listOfNumbers.size(); index ++) {
            System.out.println(listOfNumbers.get(index));
        }
    }

    public void printListReversed(List<Integer> listOfNumbers) {
        for(int index = listOfNumbers.size() - 1; index >= 0 ; index --) {
            System.out.println(listOfNumbers.get(index));
        }
    }

    public void addStringToListAtIndex(List<String> list, int index, String animal) {
        if(index >=0 && index < list.size()) {
            list.add(index, animal);
        }else{
            System.out.println("Index should be  > 0 and less than list size");
        }
    }

    public void printElementListAndIndex(List<String> list) {
        for (int i = 0; i< list.size(); i++){
            System.out.println("Index is: " + i + " and element in list: " +list.get(i));
        }
    }

    public int getTheLargestNumber(List<Integer> list) {
        int max = list.get(0);
        for(int i=0; i < list.size(); i++){
            if(list.get(i) > max){
                max = list.get(i);
            }
        }

        return max;
    }
}
