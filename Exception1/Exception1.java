package Exception1;

public class Exception1 {
    public static void main(String[] args) throws Exception {
        int num =20;
        int min = 5;
        int max = 15;

        try {
            if(numInRange(num,min,max)){
                System.out.println("Il numero \"" + num + "\" si trova tra i numeri \"" + min + "\" e \"" + max + "\"");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static boolean numInRange(int num, int min, int max) {
        if (num >= min && num <= max) {
            return true;
        } else {
            throw new ArithmeticException( num + " si trova fuori dal range");
        }

    }
}
