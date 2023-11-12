package Test.Test1.Test5;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";

        System.out.println(parse(data));
        System.out.println(addYear(data));
        System.out.println(rmvMonth(data));
        System.out.println(addDays(data));
        System.out.println(dataIta(data));
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
    public static OffsetDateTime addYear (String data){
        return parse(data).plusYears(1);
    }
    public static OffsetDateTime rmvMonth (String data){
        return parse(data).minusMonths(1);
    }
    public static OffsetDateTime addDays (String data){
        return parse(data).plusDays(7);
    }
    public static String dataIta (String data){
        return parse(data).format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    }

}
    /*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        aggiungi un anno
        sottrai un mese
        aggiungi 7 giorni
        Stampa il risultato localizzata per l'Italia
        Crea dei test per questo esercizio*/