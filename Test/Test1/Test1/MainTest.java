package Test.Test1;

import Test.Test1.Main;
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
    public void parseEmpty() {
        String data = "";
        Exception e =
        assertThrows(DateTimeParseException.class,() ->Main.parse(data).toString());
        assertEquals("La stringa che contiene la data risulta vuota",e.getMessage());
    }
    @Test
    public void parseBlanck() {
        String data = " ";
        Exception e =
                assertThrows(DateTimeParseException.class,() ->Main.parse(data).toString());
        assertEquals("La stringa che contiene la data è vuota",e.getMessage());
    }
    @Test
    public void parseNull() {
        String data = null;
        Exception e =
                assertThrows(NullPointerException.class,() ->Main.parse(data).toString());
        assertEquals("La stringa che contiene la data risulta NULL",e.getMessage());
    }

    @Test
    public void parseWrong(){
        String data = "2023T13:00:00Z";
        Exception e =
                assertThrows(DateTimeParseException.class, () -> Main.parse(data));
        assertEquals("Errore durante il parsing", e.getMessage());
    }

    @Test
    public void printLong() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("1 marzo 2023",Main.printLong(data));
    }
}