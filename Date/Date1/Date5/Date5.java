package Date.Date1.Date5;

import java.time.OffsetDateTime;

public class Date5 {
    public static void main(String[] args) {
        String data1 = "2023-03-01T13:00:00Z";
        String data2 = "2024-03-01T13:00:00Z";

        System.out.println(isBefore(data1,data2));
        System.out.println(isAfter(data1,data2));
        System.out.println(areEquals(data1,data2));

    }
    public static OffsetDateTime parseData1 (String data1){
        return OffsetDateTime.parse(data1);
    }
    public static OffsetDateTime parseData2 (String data2){
        return OffsetDateTime.parse(data2);
    }
    public static Boolean isBefore(String data1, String data2){
        return parseData1(data1).isBefore(parseData2(data2));
    }
    public static Boolean isAfter(String data1, String data2){
        return parseData2(data2).isAfter(parseData1(data1));
    }
    public static Boolean areEquals(String data1, String data2){
       return parseData1(data1).isEqual(OffsetDateTime.now()) && parseData2(data2).isEqual(OffsetDateTime.now());
    }
}
   /* Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
        verificare che la prima data è precedente alla seconda
        verificare che la seconda data è successiva alla prima
        verificare che le due date sono uguali ad ora
        Stampa il risultato
*/