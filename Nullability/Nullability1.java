package Nullability;

public class Nullability {
    public static void main (String[]args) throws Exception {
        Integer num = 20;
        Integer den = 30;

        try{
            System.out.println(nullCheck(num,den));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public static boolean nullCheck (Integer num,Integer den) {
        if(num != null && den != null){
            System.out.println("Il numeratore corrisponde a: \"" + num + "\" e il denominatore corrisponde a: \""+ den + "\"");
        }else{
            throw new NullPointerException("Il numeratore o il denominatore risulta NULL");
        }
        return true;
    }

}

    /*Scrivere una funzione che accetti in input un numeratore e un denominatore
    Controlli che il numeratore e il denominatore non siano null
        Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.*/
