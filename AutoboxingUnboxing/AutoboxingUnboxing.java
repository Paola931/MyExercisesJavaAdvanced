package AutoboxingUnboxing;

public class AutoboxingUnboxing {
    public static void main(String[]args){
        int num1 = 5;
        int num2 = 3;
        System.out.println(sommaInt(num1,num2));

        char x = 'x';
        System.out.println(stampaChar(x));

        Integer num3 = 10;
        Integer num4 = 20;
        System.out.println(sommaInteger(num3,num4));

        Character y = 'y';
        System.out.println(stampaChar2(y));

        Integer intObj = 2;
        Double doubleObj = 20.5;
        Character charObj = 'A';

        int primitivaInt = intObj.intValue();
        double primitivaDouble = doubleObj.doubleValue();
        char primitivaChar = charObj.charValue();
    }
    public static int sommaInt (int num1, int num2){
        int somma = num1 + num2;
        System.out.println("La somma di " + num1 + " e " + num2 + " corrisponde a: ");
        return somma;
    }
    public static char stampaChar (char x){
        System.out.println("Il carattere scelto è: ");
        return x;
    }
    public static Integer sommaInteger (Integer num3, Integer num4){
        Integer somma = num3 + num4;
        System.out.println("La somma di " + num3 + " e " + num4 + " corrisponde a: ");
        return somma;
    }
    public static Character stampaChar2 (Character y){
        System.out.println("Il carattere scelto è: ");
        return y;
    }
}
    /*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
        Scrivere una funzione che accetti in input 1 char lo stampi
        Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
        Scrivere una funzione che accetti in input 1 Character lo stampi
        Scrivere un un valore primitivo per int, double e char e fare autoboxing
        Scrivere un oggetto per Integer, Double e Character e fare Unboxing*/
