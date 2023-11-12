package Test.Test1.Test3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";

        System.out.println(parse(data));
        System.out.println(printLong(data));
    }
    public static OffsetDateTime parse(String data){
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
    public static String printLong(String data){
        return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
}
  /*  Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
        Formatta la data ottenendo 01 marzo 2023
        Stampa sulla console
        Crea dei test per questo esercizio*/