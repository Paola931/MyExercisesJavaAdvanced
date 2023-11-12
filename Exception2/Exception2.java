public class Exception2 {
    public static void main(String[]args) {
        char x = '5';

        try{
            checkChar(isChar(x),x);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public static boolean isChar (char x) throws Exception {
        if(Character.isDigit(x)) {
            throw new Exception("This is a number, please choose a character");
        }else{
            return true;
        }
    }
    public static String checkChar(boolean isChar, char x){
        try{
            if(isChar){
                System.out.print("You have chosen this character: " + x);
            }
        } catch (Exception e) {
            System.out.println("Error"+ e);
        }
        return null;
    }
}
    /*Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.*/
