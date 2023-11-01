package MyExercisesJavaAdvanced;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    public static void main(String[]args){
        Set<String> lista = new HashSet<String>();
        lista.add("1");
        lista.add("2");
        lista.add("3");

        stampa((HashSet<String>) lista);
    }
    public static String stampa(HashSet<String> lista){
        System.out.println("Gli elementi nella lista sono: ");
        for(String elemento : lista){
            System.out.println(elemento);
        }
        int hashsetSize = lista.size();
        System.out.println("La lunghezza dell'HashSet è di: " + hashsetSize);
        return null;
    }

}
    /*Scrivere una funzione che restituisca un hashset riempito
    Leggere l'hashSet e stampre grandezza ed elementi*/
