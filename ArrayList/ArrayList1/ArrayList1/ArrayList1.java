package MyExercisesJavaAdvanced.ArrayList.ArrayList1.ArrayList1;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[]args){
        Student studente1 = new Student("Jennifer","Saint",16);
        Student studente2 = new Student("Oscar","Wilde",18);
        Student studente3 = new Student("Junji","Ito",13);
        Student studente4 = new Student("Madeline","Miller",14);

        ArrayList<Student> studenti = new ArrayList<Student>();

        studenti.add(studente1);
        studenti.add(studente2);
        studenti.add(studente3);
        studenti.add(studente4);

        primaStampa(studenti);

        studenti.add(new Student("Lisa","Halliday",15));
        studenti.add(new Student("Marzia","Sicignano",17));
        studenti.add(new Student("Antonio","DiStefano",15));
        studenti.add(new Student("Johann","Goethe",18));


        stampaFinale(studenti);
    }
    public static ArrayList primaStampa (ArrayList<Student> studenti){
        for(Student studente : studenti){
            System.out.println(studente);
        }
        return studenti;
    }
    public static ArrayList stampaFinale(ArrayList<Student> studenti){
        for(Student studente : studenti){
            System.out.println(studente);
        }
        return studenti;
    }


}

    /*Creare una classe Student che accenti nel costruttore il parametro name (String e age Int)
    In questa classe avere i metodi pubblici per ottenere le informazioni.
        Creare un ArrayList con n elementi e stamparlo in console.
        Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console*/
