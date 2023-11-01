public class Exception4 {
    public static void main(String[]args) throws Exception {
        double [] num = {1.0,2.5,3.0,4.5,5.0,6.5,7.0,8.5,9.0};
        double indice = 1.0;


        System.out.println(Arrays.toString(stampa(num)));
        System.out.println(indiceArr(num,indice));
        gestione(indice,num);

    }
    public static double [] stampa (double[]num){
        for(int i = 0;i < num.length;i++){
        }
        return num;
    }
    public static boolean indiceArr (double [] num,double indice) throws Exception {
        for(double n : num){
            if( n == indice){
                return true;
            }else{
                throw new Exception("L'indice non è presente all'interno dell'array");
            }
        }
        return true;
    }
    public static boolean divisione (double indice) throws ArithmeticException {
        if (Double.isNaN(indice % 0)){
            throw new ArithmeticException("Impossibile dividere un numero per 0");
        }
        return true;
    }

    public static String gestione (double indice,double[] num) throws Exception {
        try{
            if(!divisione(indice)){

            }

        } catch (ArithmeticException e){
            if(divisione(indice)){
                System.out.println(e);
            }

        } catch (Exception e) {
            if (!indiceArr(num,indice)){
                System.out.println(e);
            }
        }
        return null;
    }

}
    /*Scrivere una funzione che accetti un array in input e provi a dividere
        un numero dell'array per 0 e gestisca sia l'eccezione della divisione
        che quella di indice non presente nell'array, leggendone il messaggio.
        Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/

