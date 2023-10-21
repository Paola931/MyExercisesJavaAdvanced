package Exception4;

import java.util.Arrays;
import java.util.Random;
import static java.lang.Double.NaN;

public class Exception4 {
    public static void main(String[]args) {
        double [] num = new double[10];
        double indice = 12;


        System.out.println(Arrays.toString(riempimento(num)));
        System.out.println(indiceArr(num,indice));
        gestione(indice,num);

    }
    public static double [] riempimento (double[]num){
        Random r = new Random();
        for(int i = 0;i < num.length;i++){
            num[i]= r.nextInt(0,20);
        }
        return num;
    }
    public static boolean indiceArr (double [] num,double indice){
        for(double n : num){
            if( n == indice){
                return true;
            }
        }
        return false;
    }

    public static void gestione (double indice,double[] num) {
        try{
            if(Double.isNaN(indice % 0)){
                throw new Exception("Impossibile dividere un numero per 0");
            }
        }  catch (Exception e) {
            if (!indiceArr(num,indice)){
                System.out.println("L'indice non è presente all'interno dell'array"+ e);
            }
        }
    }

}
    /*Scrivere una funzione che accetti un array in input e provi a dividere
        un numero dell'array per 0 e gestisca sia l'eccezione della divisione
        che quella di indice non presente nell'array, leggendone il messaggio.
        Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/

