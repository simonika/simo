package lab12;
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
}
