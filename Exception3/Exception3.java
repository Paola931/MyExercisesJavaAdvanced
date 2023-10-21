package Exception3;

import static java.lang.Double.NaN;

public class Exception3 {
    public static void main(String[]args){
        double num = 2;
        double num2 = 0;

        checkDiv(num,num2);
    }
    public static boolean division (double num,double num2){
        if(num % num2 == NaN){
            return true;
        }else{
            return false;
        }
    }
    public static void checkDiv (double num,double num2){
        try{
            if(!division(num,num2)){
                throw new Exception("It's impossible to divide a number for 0");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
    /*Scrivere una funzione che provi a dividere un numero per 0 e
        catturi l'eccezione leggendone il messaggio.*/

