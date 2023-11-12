package Date.Date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date1 {
    public static void main(String[] args) {
        String data = "2002-03-01T13:00:00Z";

        System.out.println(printFull(data));
        System.out.println(printMedium(data));
        System.out.println(printShort(data));
    }
    public static OffsetDateTime parse( String data){
       return OffsetDateTime.parse(data);
    }
    public static String printFull(String data){
       return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
    }
    public static String printShort(String data){
        return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
    }
    public static String printMedium(String data){
        return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

    }
}
    /*Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
        Formatta la data ottenuta in FULL, MEDIUM e SHORT
        Stampa le varie versioni*/
