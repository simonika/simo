package lab2;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ex 1: " + printMyName("Hello \n Simona"));

        System.out.println("Ex 2(scadere): " + subtract(15, 5));
        System.out.println("Ex 2(adunare): " + sum(25, 5));
        System.out.println("Ex 2(impartire): " + divide(350, 33));
        System.out.println("Ex 2(inmultire): " + multyply(22, 14));

        System.out.println("Ex. 3: " + "\n" + printJava());


        System.out.println("Ex. 4: " + avarage(7, 85, 9.3));

        System.out.println("Ex. 7: " + converFarenheitToCelcius(101));

        System.out.println("Ex. 8: " + converInchToMeter(100));

        System.out.println("Ex. 5: " + "\n" + printModel());


    }

    public static int subtract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;

    }

    public static String printMyName(String value) {
        return value;
    }

    public static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;

    }

    public static int multyply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static double divide(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    public static double avarage(double first, double second, double third) {
        double result = (first + second + third) / 3;
        return result;
    }

    public static double converFarenheitToCelcius(double temp) {
        double t = (5 * (temp - 32)) / 9;
        return t;
    }

    public static double converInchToMeter(double inch) {
        double m = inch * 0.0254;
        return m;
    }

    public static String printJava() {
        String a = "    J    a  v     v  a" + "\n";
        String b = "    J   a a  v   v  a a" + "\n";
        String c = "J   J  aaaaa  V V  aaaaa" + "\n";
        String d = " J J  a     a  V  a     a" + "\n";
        return a + b + c + d;
    }

    public static String printModel(){
        String a = " + \" \" \" \" \"+ " + "\n";
        String b = "[|   o  o   |]" + " \n";
        String c = " |     ^    | " +  "\n";
        String d = " |    '-'   | " + "\n";
        String e = " + \" \" \" \" \"+ " + "\n";
        return a + b + c + d + e;

    }




}



