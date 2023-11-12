package Date.Date1.Date2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date2 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";

        System.out.println(printLong(data));

    }
    public static OffsetDateTime parse( String data){
        return OffsetDateTime.parse(data);
    }
    public static String printLong(String data){
        return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
}
   /* Crea un oggetto OffsetDateTime da questa stringa 2023-03-01T13:00:00Z
        Formatta la data ottenendo 01 marzo 2023
        Stampa sulla console*/
