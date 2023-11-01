package HashSet.Hashset1.HashSet3;

import java.util.*;

public class HashSet13 {
    public static void main(String[]args){
        Set<String> lista = new HashSet<>(Arrays.asList("sale","pepe","caffe","zucchero"));
        String indice = "sale";

        stampa((HashSet<String>) lista);
       rimozioneIndice((HashSet<String>) lista,indice);
       nuovaLista((HashSet<String>) lista);
    }
    public static String stampa (HashSet<String> lista){
        System.out.println("Nella lista sono presenti i seguenti elementi :");
        for(String elemento : lista){
            System.out.println(elemento);
        }
        return null;
    }
    public static String rimozioneIndice (HashSet<String>lista, String indice){
       Iterator <String> iterator = lista.iterator();
       while(iterator.hasNext()){
           String element = iterator.next();
           if(Objects.equals(element, indice)){
               iterator.remove();
           }
       }
       System.out.println("L'elemento rimosso è: " + indice);
        return indice;
    }
    public static String nuovaLista (HashSet<String>lista){
        System.out.println("La lista modificata è la seguente: ");
        for(String element:lista){
            System.out.println(element);
        }
        return null;
    }

}
    /*Scrivere una funzione che restituisca un hashset riempito
    Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
        Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
        Svuotare l'hashset, verificarlo e stampare il risultato*/