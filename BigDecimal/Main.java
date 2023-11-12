package BigDecimal;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.valueOf(4.4);
        BigDecimal num2 = BigDecimal.valueOf(8.8);

        String operazione = Operazione.operazioni(Operazione.Tipo.MOLTIPLICAZIONE,num1,num2);

        try {
            System.out.println(operazione);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }



    }
}
   /* Scrivi un programma Java dove imposti 2 BigDecimal e 1 operazione aritmetica
        (Addizione, sottrazione, moltiplicazione e divisione, min e max) definita in un enum,
        crei un metodo per calcolare l'operazione richiesta e e ritorni il risultato.
        Il tipo di operazione, i due dati in input e il risultato dovranno essere stampati a schermo*/