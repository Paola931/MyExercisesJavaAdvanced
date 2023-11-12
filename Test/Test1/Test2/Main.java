package Test.Test1.Test2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        String data = "2002-03-01T13:00:00Z";

        System.out.println(parse(data));
        System.out.println(printFull(data));
        System.out.println(printMedium(data));
        System.out.println(printShort(data));
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
    public static String printFull(String data){
        return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
    public static String printMedium(String data){
        return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

    }
    public static String printShort(String data){
        return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
}
    /*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        Formatta la data ottenuta in FULL, MEDIUM e SHORT
        Stampa le varie versioni*/
