public class Exception1 {
    public static void main(String[] args) throws Exception {
        int num = 5;
        int min = 5;
        int max = 15;


        System.out.println(numInRange(num,min,max));
        testError(num, min, max);
    }
    public static boolean numInRange(int num, int min, int max) throws Exception {
        if (num >= min && num <= max) {
            return true;
        } else {
            throw new Exception( num +"si trova fuori dal range");
        }

    }
    public static void testError (int num, int min , int max) throws Exception {
        boolean inRange = numInRange(num, min, max);
        try {
          if(inRange){
          }
        } catch (Exception e) {
            System.out.println("Errore " + e);
        }
    }
}
