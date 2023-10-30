package Nullability;

public class Nullability {
    public static void main (String[]args) throws Exception {
        Integer num = 20;
        Integer den = 30;

        System.out.println(nullCheck(num,den));
        tryCheck(num,den);
    }
    public static boolean nullCheck (Integer num,Integer den) throws Exception {
        if(num == null || den == null){
            throw new Exception("Un valore corrisponde a null, impostare nuovo valore");
        }
        return true;
    }
    public static String tryCheck (Integer num,Integer den){
        try{
            if(num != null && den != null){
                System.out.println("Il numeratore corrisponde a: \"" + num + "\" e il denominatore corrisponde a: \""+ den + "\"");
            }
        } catch (Exception e) {
            System.out.println("Errore: " +e);
        }
        return null;
    }
}

    /*Scrivere una funzione che accetti in input un numeratore e un denominatore
    Controlli che il numeratore e il denominatore non siano null
        Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.*/
