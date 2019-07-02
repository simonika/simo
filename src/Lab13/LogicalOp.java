package Lab13;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

public class LogicalOp {

    public LogicalOp() {


    }

    public int[] getArrayToHundred() {
        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }

    public void afisareArray(int[] myArray) {
        for (int i = 0; i< myArray.length; i++){
            System.out.println("myArray["+i+"]: " + myArray[i]);
        }
    }

    public int[] getArrayEvenNumbers() {
        int[] myArray = new int[100];
        for (int i = 1; i <= 100; i++){
            if(i % 2 ==0) {
                myArray[i - 1] = i;
            }

        }
        return myArray;
    }

    public double getAveregeOfArrayNumners(int[] numbers){
        double result = 0.0;
        for(int i=0; i < numbers.length; i++){
            result= result + numbers[i];
        }

        return result/numbers.length;

    }


    public boolean findStringInArray(String[] animals, String animal) {
        boolean flag = false;
        for(int i= 0; i < animals.length; i++){
            if (animals[i].equals(animal)){
                flag = true;
            }
        }

        return flag;
    }

    public int findNumberInArray(int[] numbers, int idx) {
        int index = 0;
        for(int i= 0; i < numbers.length; i++){
            if(numbers[i] == idx){
                index = i;
            }

        }

        return index;
    }

    public static int[] removeOneElememFromArray(int[] arr, int filter){
        int[] newArr = new int[arr.length-1];
        for(int i=0, j=0; i < arr.length && j < newArr.length; i++){
            if(arr[i] != filter) {
                newArr[j++] = arr[i];
            }

        }

        return newArr;
    }


    public int[] copyFromArray(int[] numbers, int[] newNumbers) {
        for(int i=0, j=0; i < numbers.length && j < newNumbers.length; i++,j++){
            newNumbers[j] = numbers[i];

        }
        return newNumbers;
    }

    public int getSecondSmallestFromArray(int[] numbers3) {
        Arrays.sort(numbers3);
        return  numbers3[1];
    }
}
