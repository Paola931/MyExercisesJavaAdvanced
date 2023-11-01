package HashMap.HashMap1.HashMap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap2 {
    public static void main(String[] args) {
        Map<String,String> preferiti = new HashMap<String,String>();
        preferiti.put("Libro", "Rose Madder");
        preferiti.put("Film","Million dollar baby");
        preferiti.put("Dolce","Gelato");

        stampaPreferiti(preferiti);
        stampaOrdinata(preferiti);
    }
    public static Map stampaPreferiti (Map<String,String>preferiti){
        System.out.println("Preferiti senza ordine: ");
        for(Map.Entry<String,String> element : preferiti.entrySet()){
            System.out.println(element);
        }
        return preferiti;
    }

    public static List stampaOrdinata(Map<String,String>preferiti){
        System.out.println("Preferiti ordinati per valore: ");
        List<Map.Entry<String,String>> listaPreferiti = new ArrayList<>(preferiti.entrySet());
        listaPreferiti.sort(Map.Entry.comparingByValue());
        listaPreferiti.forEach(System.out::println);

        return listaPreferiti;
    }

}
//    Creare un hashmap prendere tutti i valori, ordinarli e stamparli
