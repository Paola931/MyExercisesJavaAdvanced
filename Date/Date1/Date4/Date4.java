package Date.Date1.Date4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Date4 {
    public static void main(String[] args) {
        String data = "2023-03-01T13:00:00Z";

        System.out.println(stampa(data));
        System.out.println(stampaItalia(aggiuntaGiorni(rimozioneMese(aggiuntaAnno(data)))));

    }
    public static OffsetDateTime parse( String data){
        return OffsetDateTime.parse(data);
    }
    public static String stampa (String data){
        System.out.println("La data originaria è: ");
        return parse(data).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
    }
    public static OffsetDateTime aggiuntaAnno (String data){
        return parse(data).plusYears(1);
    }
    public static OffsetDateTime rimozioneMese (OffsetDateTime anno){
        return anno.minusMonths(1);
    }
    public static OffsetDateTime aggiuntaGiorni (OffsetDateTime mese){
        return mese.plusDays(7);
    }
    public static String stampaItalia (OffsetDateTime giorni){
        System.out.println("La data modificata è: ");
        return giorni.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
    }
}
    /*Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        aggiungi un anno
        sottrai un mese
        aggiungi 7 giorni
        Stampa il risultato localizzata per l'Italia*/