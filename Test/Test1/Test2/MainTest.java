package Test.Test1.Test2;

import org.junit.Test;

import java.time.format.DateTimeParseException;

import static org.junit.Assert.*;

public class MainTest {

    Main test = new Main();

    @Test
    public void parse() {
        String data = "2002-03-01T13:00:00Z";
        assertEquals("2002-03-01T13:00Z",Main.parse(data).toString());
    }
    @Test
    public void parseEmpty() {
        String data = "";
        Exception e =
                assertThrows(DateTimeParseException.class,() -> Main.parse(data).toString());
        assertEquals("La stringa che contiene la data risulta vuota",e.getMessage());
    }
    @Test
    public void parseBlanck() {
        String data = " ";
        Exception e =
                assertThrows(DateTimeParseException.class,() -> Main.parse(data).toString());
        assertEquals("La stringa che contiene la data risulta vuota",e.getMessage());
    }
    @Test
    public void parseNull() {
        String data = null;
        Exception e =
                assertThrows(NullPointerException.class,() -> Main.parse(data).toString());
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
    public void printFull() {
        String data = "2002-03-01T13:00:00Z";
        assertEquals("venerdì 1 marzo 2002", Main.printFull(data));
    }

    @Test
    public void printMedium() {
        String data = "2002-03-01T13:00:00Z";
        assertEquals("1 mar 2002", Main.printMedium(data));
    }

    @Test
    public void printShort() {
        String data = "2002-03-01T13:00:00Z";
        assertEquals("01/03/02", Main.printShort(data));
    }
}