package OperatoreTernario.OperatoreTernario2;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Valore: " + i);
            //System.out.println(checkValue(i));
            System.out.println(checkOP(i));
        }
    }

    private static String checkValue(int value) {
        String result = "";

        if (value % 5 == 0) {
            result = "FizzBuzz";
        } else  {
            result = "Buzz";
        }
        return result;
    }
    public static String checkOP(int value){
        String result = value % 5 == 0 ? "FizzBuzz" : "Buzz";

        return result;
    }
}