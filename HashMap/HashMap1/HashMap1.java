package MyExercisesJavaAdvanced.HashMap.HashMap1;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
        Map<String,String> menu = new HashMap<String,String>();
        menu.put("Dolce", "Gelato Fritto");
        menu.put("Primo","Riso alla cantonese");
        menu.put("Secondo","Pollo in salsa agrodolce");

        stampaPrimoMenu(menu);

        Map<String,String> menu2 = new HashMap<>(Map.of("Dolce", "Tiramisù",
                "Primo","Spaghetti alla carbonara","Secondo","Bistecca"));

        stampaSecondoMenu(menu2);

        Map<String,String> menu3 = new HashMap<>(Map.ofEntries(
                (new AbstractMap.SimpleEntry<>("Dolce", "Torta al cioccolato")),
                (new AbstractMap.SimpleEntry<>("Primo","Tagliatelle ai funghi")),
                (new AbstractMap.SimpleEntry<>("Secondo","Braciole di maiale"))
        ));

        stampaTerzoMenu(menu3);

    }
    public static Map stampaPrimoMenu (Map<String,String>menu){
        System.out.println("Il primo menu contiene: ");
        for(Map.Entry<String,String> element : menu.entrySet()){
            System.out.println(element);
        }
        return menu;
    }
    public static Map stampaSecondoMenu (Map<String,String>menu2){
        System.out.println("Il secondo menu contiene: ");
        for(Map.Entry<String,String> element : menu2.entrySet()){
            System.out.println(element);
        }
        return menu2;
    }
    public static Map stampaTerzoMenu (Map<String,String>menu3){
        System.out.println("Il terzo menu contiene: ");
        for(Map.Entry<String,String> element : menu3.entrySet()){
            System.out.println(element);
        }
        return menu3;
    }
}
//Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
