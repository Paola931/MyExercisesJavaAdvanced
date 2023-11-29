package BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Operazione {

    enum Tipo{
        ADDIZIONE,
        SOTTRAZIONE,
        MOLTIPLICAZIONE ,
        DIVISIONE,
        MIN,
        MAX
    }
    private BigDecimal num1;
    private BigDecimal num2;
    private final Tipo tipo;


    public Operazione(BigDecimal num1, BigDecimal num2, Tipo tipo) {
        this.num1 = num1;
        this.num2 = num2;
        this.tipo = tipo;
    }

    public static String operazioni(Tipo tipo, BigDecimal num1 , BigDecimal num2){
        if(num1 != null && num2 != null) {
            switch (tipo) {
                case ADDIZIONE:
                    add(num1,num2);
                    break;
                case SOTTRAZIONE:
                    sub(num1, num2);
                    break;
                case MOLTIPLICAZIONE:
                    mul(num1, num2);
                    break;
                case DIVISIONE:
                    div(num1, num2);
                    break;
                case MIN:
                    min(num1, num2);
                    break;
                case MAX:
                    max(num1, num2);
                    break;
                default:
                    System.out.println("Operatore non presente, riprovare");

            }
        } else{
            throw new NullPointerException("Uno dei valori risulta NULL");
        }
        return "Prova un'altra operazione!";
    }

    public Tipo getTipo() {
        return tipo;
    }

    public static BigDecimal add(BigDecimal num1, BigDecimal num2){
        System.out.println("Hai scelto l'operazione " + Tipo.ADDIZIONE + " tra il " + num1 + " e il " + num2);
        BigDecimal result = num1.add(num2);
        System.out.println("Il risultato è: " + result);
        return result;
    }
    public static BigDecimal sub (BigDecimal num1 , BigDecimal num2){
        System.out.println("Hai scelto l'operazione " + Tipo.SOTTRAZIONE + " tra il " + num1 + " e il " + num2);
        BigDecimal result = num1.subtract(num2);
        System.out.println("Il risultato è: " + result);
        return result;
    }
    public static BigDecimal  mul (BigDecimal num1 , BigDecimal num2){
        System.out.println("Hai scelto l'operazione " + Tipo.MOLTIPLICAZIONE + " tra il " + num1 + " e il " + num2);
        BigDecimal result = num1.multiply(num2);
        System.out.println("Il risultato è: " + result);
        return result;
    }
    public static BigDecimal div (BigDecimal num1 , BigDecimal num2){
        System.out.println("Hai scelto l'operazione " + Tipo.DIVISIONE + " tra il " + num1 + " e il " + num2);
        BigDecimal result = num1.divide(num2, RoundingMode.HALF_EVEN);
        System.out.println("Il risultato è: " + result);
        return result;
    }
    public static BigDecimal min (BigDecimal num1 , BigDecimal num2){
        System.out.println("Hai scelto l'operazione " + Tipo.MIN + " tra il " + num1 + " e il " + num2);
        BigDecimal result = num1.min(num2);
        System.out.println("Il numero minore è: " + result);
        return result;
    }
    public static BigDecimal max (BigDecimal num1 , BigDecimal num2){
        System.out.println("Hai scelto l'operazione " + Tipo.MAX + " tra il " + num1 + " e il " + num2);
        BigDecimal result = num1.max(num2);
        System.out.println("Il numero maggiore è: " + result);
        return result;
    }
}
