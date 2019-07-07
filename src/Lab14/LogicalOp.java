package Lab14;

import java.util.List;


public class LogicalOp {


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
