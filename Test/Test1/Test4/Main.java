package Test.Test1.Test4;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";

        System.out.println(parse(data));
        System.out.println(getYear(data));
        System.out.println(getMonth(data));
        System.out.println(getDay(data));
        System.out.println(getDayOfWeek(data));
    }
    public static OffsetDateTime parse (String data){
        if (data != null) {
            try {
                OffsetDateTime dataParse = OffsetDateTime.parse(data);
                return OffsetDateTime.parse(data);
            } catch (DateTimeParseException e) {
                if (data.isBlank() || data.isEmpty()) {
                    throw new DateTimeParseException("La stringa che contiene la data risulta vuota", data ,e.getErrorIndex());
                } else {
                    throw new DateTimeParseException("Errore durante il parsing", data, e.getErrorIndex());
                }
            }
        } else {
            throw new NullPointerException("La stringa che contiene la data risulta NULL");
        }
    }

    public static String getYear(String data){
        return String.valueOf(parse(data).getYear());
    }

    public static Month getMonth (String data){
        return parse(data).getMonth();
    }
    public static String getDay (String data){
        return String.valueOf(parse(data).getDayOfMonth());
    }
    public static DayOfWeek getDayOfWeek (String data){
        return parse(data).getDayOfWeek();
    }
}
  /*  Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        ottieni l'anno
        ottieni il mese
        ottieni il giorno
        ottieni il giorno della settimana
        Stampa i risultati sulla console -Crea dei test per questo esercizio*/