package HashSet.Hashset1.HashSet2;

import java.util.*;

public class HashSet2 {
    public static void main(String[]args){
        Set<String> lista = new HashSet<String>(Arrays.asList("sale","pepe","paprica","curry"));
        String indice = "pepe";


        System.out.println(indicePresente((HashSet<String>) lista,indice));
    }
    public static boolean indicePresente (HashSet<String> lista,String indice){
        for(String element : lista){
            if(element.equals(indice)){
                return true;
            }
        }
        return false;
    }
}
    /*Scrivere una funzione che restituisca un HashSet riempito
    Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        Verificare che l' elemento sia parte del Set e stampare il risultato*/