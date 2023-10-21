package Exception2;



public class Exception2 {
    public static void main(String[]args){
        char x = '5';
        checkChar(isChar(x),x);

    }
    public static boolean isChar (char x){
        boolean isNum = true;
        if(Character.isDigit(x)) {
            isNum = false;
        }
        return isNum;
    }
    public static String checkChar(boolean isChar,char x){
        try{
            if(!isChar){
                throw new Exception ("This is a number, please choose a character");
            }
        } catch (Exception e) {
            System.out.println("Error"+ e);
        }
        return null;
    }
}
    /*Scrivere una funzione che controlli se un carattere è un numero altrimenti lanciare una eccezione.*/