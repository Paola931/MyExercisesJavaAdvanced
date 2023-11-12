package Test.Test1.Test4;

import org.junit.Test;

import java.time.format.DateTimeParseException;

import static org.junit.Assert.*;

public class MainTest {
    Main test = new Main();

    @Test
    public void parse() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("2023-03-01T13:00Z",Main.parse(data).toString());
    }
    @Test
    public void parseEmpy() {
        String data = "";
        Exception e =
                assertThrows(DateTimeParseException.class,()->Main.parse(data));
        assertEquals("La stringa che contiene la data risulta vuota",e.getMessage());
    }
    @Test
    public void parseBlanck() {
        String data = " ";
        Exception e =
                assertThrows(DateTimeParseException.class,()->Main.parse(data));
        assertEquals("La stringa che contiene la data risulta vuota",e.getMessage());
    }
    @Test
    public void parseNull() {
        String data = null;
        Exception e =
                assertThrows(NullPointerException.class,()->Main.parse(data));
        assertEquals("La stringa che contiene la data risulta NULL",e.getMessage());
    }
    @Test
    public void parseWrong() {
        String data = "data non valida";
        Exception e =
                assertThrows(DateTimeParseException.class,()->Main.parse(data));
        assertEquals("Errore durante il parsing",e.getMessage());
    }


    @Test
    public void getYear() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("2023", Main.getYear(data));
    }

    @Test
    public void getMonth() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("MARCH",Main.getMonth(data).toString());
    }

    @Test
    public void getDay() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("1",Main.getDay(data));

    }

    @Test
    public void getDayOfWeek() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("WEDNESDAY",Main.getDayOfWeek(data).toString());
    }
}