import java.util.Arrays;

package Exception4;

import java.util.Arrays;
public class Exception4 {
    public static void main(String[] args) throws Exception {
        double[] num = {1.0, 2.5, 3.0, 4.5, 5.0, 6.5, 7.0, 8.5, 9.0};
        double indice = 80.0;

        System.out.println(Arrays.toString(stampa(num)));

        try {
            System.out.println(indiceArr(num, indice));
            System.out.println(divisione(indice));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

    public static double[] stampa(double[] num) {
        for (int i = 0; i < num.length; i++) {
        }
        return num;
    }

    public static boolean indiceArr(double[] num, double indice) throws Exception {
        for (double n : num) {
            if (n != indice) {
                throw new Exception("L'indice non è presente all'interno dell'array");
            } else {
                return true;
            }
        }
        return true;
    }

    public static boolean divisione(double indice) throws ArithmeticException {
        if (Double.isNaN(indice % 0)) {
            throw new ArithmeticException("Impossibile dividere un numero per 0");
        }
        return true;
    }

}
    /*Scrivere una funzione che accetti un array in input e provi a dividere
        un numero dell'array per 0 e gestisca sia l'eccezione della divisione
        che quella di indice non presente nell'array, leggendone il messaggio.
        Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/

