package MyExercisesJavaAdvanced.ArrayList.ArrayList1.ArrayList2;

import ArrayList.ArrayList1.ArrayList1.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ArrayList2 {
    public static void main(String[]args){

        ArrayList<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Jennifer","Saint",15));
        studenti.add(new Student("Oscar","Wilde",17));
        studenti.add(new Student("Junji","Ito",18));
        studenti.add(new Student("Madeline","Miller",15));
        studenti.add(new Student("Lisa","Halliday",13));
        studenti.add(new Student("Marzia","Sicignano",16));
        studenti.add(new Student("Antonio","DiStefano",14));
        studenti.add(new Student("Johann","Goethe",18));
        studenti.add(new Student("Vladimir","Nabokov",15));
        studenti.add(new Student("George","Orwell",14));
        studenti.add(new Student("Jane","Austen",13));
        studenti.add(new Student("Maurice","Leblanc",17));

        stampaDis(studenti);
        stampaOrd(studenti);
    }
    public static ArrayList stampaDis(ArrayList<Student>studenti){
        System.out.println("Stampa degli studenti disordinata: ");
        for(Student studente:studenti){
            System.out.println(studente);
        }
        return studenti;
    }

    public static ArrayList stampaOrd(ArrayList<Student>studenti){
        System.out.println("Stampa degli studenti ordinata per ordine alfabetico: ");
        Collections.sort(studenti, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(studenti);
        return studenti;
    }
}
    /*Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
    In questa classe avere i metodi pubblici per ottenere le informazioni.
        Creare un ArrayList con 12 elementi e stamparlo in console.
        mettere in ordine la collezione e stampare il risultato*/