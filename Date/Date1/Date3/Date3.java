package Date.Date1.Date3;

import java.time.DayOfWeek;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Date3 {
    public static void main(String[] args) {
        String data= "2023-03-01T13:00:00Z";

        System.out.println(anno(data));
        System.out.println(mese(data));
        System.out.println(giorno(data));
        System.out.println(giornoSettimana(data));
    }
    public static OffsetDateTime parse( String data){
        return OffsetDateTime.parse(data);
    }
    public static int anno (String data){
        return parse(data).getYear();
    }
    public static String mese (String data){
        return String.valueOf(parse(data).getMonth());
    }
    public static int giorno (String data){
        return parse(data).getDayOfMonth();
    }
    public static DayOfWeek giornoSettimana (String data){
        return parse(data).getDayOfWeek();
    }
}

   /* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        ottieni l'anno
        ottieni il mese
        ottieni il giorno
        ottieni il giorno della settimana
        Stampa i risultati sulla console*/
