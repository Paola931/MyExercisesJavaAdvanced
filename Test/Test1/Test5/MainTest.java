package Test.Test1.Test5;

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
    public void parseWrong(){
        String data = "data non valida";
        Exception e =
                assertThrows(DateTimeParseException.class,()->Main.parse(data));
        assertEquals("Errore durante il parsing",e.getMessage());
    }
    @Test
    public void parseEmpty(){
        String data = "";
        Exception e =
                assertThrows(DateTimeParseException.class,()->Main.parse(data));
        assertEquals("La stringa che contiene la data risulta vuota",e.getMessage());
    }

    @Test
    public void parseBlanck(){
        String data = " ";
        Exception e =
                assertThrows(DateTimeParseException.class,()->Main.parse(data));
        assertEquals("La stringa che contiene la data risulta vuota",e.getMessage());
    }

    @Test
    public void parseNull(){
        String data = null;
        Exception e =
                assertThrows(NullPointerException.class,()->Main.parse(data));
        assertEquals("La stringa che contiene la data risulta NULL",e.getMessage());
    }

    @Test
    public void addYear() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("2024-03-01T13:00Z",Main.addYear(data).toString());
    }

    @Test
    public void rmvMonth() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("2023-02-01T13:00Z",Main.rmvMonth(data).toString());
    }

    @Test
    public void addDays() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("2023-03-08T13:00Z",Main.addDays(data).toString());
    }

    @Test
    public void dataIta() {
        String data = "2023-03-01T13:00:00Z";
        assertEquals("01 marzo 2023",Main.dataIta(data));
    }
}