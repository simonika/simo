package Lab13;

import java.util.Arrays;

public class LogicalOpOptional {

    public int[] insertElementAtIndex(int[] numbers, int idx, int element) {
        int[] newArr = new int[numbers.length + 1];
        for(int i=0, j=0; i <= numbers.length && j < newArr.length; i++, j++){
            if(i == idx){
                newArr[idx] = element;
            }else if(i >idx) {
                newArr[j] = numbers[idx++];
            }else{
                newArr[j] = numbers[i];
            }
        }
        return  newArr;
    }

    public int[] reversedArray(int[] numbers) {
        int[] copy = new int[numbers.length];
        for(int i = numbers.length-1, j=0;  i >= 0; i--, j++){
            copy[j] = numbers[i];
        }
        return copy;
    }

    public int[] getSmallestAndLargestFromArray(int[] numbers) {
        int[] copy = new int[2];
        Arrays.sort(numbers);
        copy[0] = numbers[0];
        copy[1] = numbers[numbers.length-1];
        return copy;
    }

    public int[] sortAscendingArray(int[] numbers) {
        Arrays.sort(numbers);
        return numbers;
    }
}
