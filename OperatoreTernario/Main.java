package OperatoreTernario;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkOP("Questa è una stringa"));
    }

  public static String checkOP ( String value){
        String result = value.length() >= 10 ? "Lunghezza maggiore o uguale di 10" : "Lunghezza minore di 10";
        return result;
    }
}

