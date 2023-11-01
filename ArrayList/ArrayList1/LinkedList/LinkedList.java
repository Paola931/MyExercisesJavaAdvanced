package MyExercisesJavaAdvanced.ArrayList.ArrayList1.LinkedList;

import java.util.List;

public class LinkedList {
    public static void main(String[]args){
        List<Frutta> frutti = new java.util.LinkedList<>();

        frutti.add(new Frutta("Avocado"));
        frutti.add(new Frutta("Mela"));


        primaStampa(frutti);

        frutti.addFirst(new Frutta("Mango"));
        frutti.addLast(new Frutta("Fragola"));

        secondaStampa(frutti);

    }

    public static LinkedList primaStampa(List<Frutta>frutti){
        System.out.println("Lista primi frutti: ");
        for(Frutta frutto: frutti){
            System.out.println(frutto);
        }
        return null;
    }

    public static LinkedList secondaStampa(List<Frutta>frutti){
        System.out.println("Lista con frutti aggiunti: ");
        for(Frutta frutto: frutti){
            System.out.println(frutto);
        }
        return null;
    }
}
   /* Creare una classe Fruit che accenti nel costruttore il parametro name (String)
    In questa classe avere i metodi pubblici per ottenere le informazioni.
        Creare un LinkedList con elementi e stamparlo in console.
        Aggiungere un elemento al primo posto della lista e uno all'ultimo
        Stampare la collezione aggiornata*/
