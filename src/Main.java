import java.util.Scanner;

public class Main {
    static final String RESET = "\u001B[0m";//Elimina el color anterior
    static final String AZUL = "\u001B[34m";//Color azul a las letras
    static final String ROJO = "\u001B[31m";//Color rojo a las letras
    static final String VERDE = "\u001B[32m";//Color verde a las letras

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        boolean pausar = false;
        try{
            while(!pausar){

            }
        }catch (Exception ex){
            System.out.println(ROJO + "\n\tTipo de dato ingresado incorrectamente!!!" + ex.getLocalizedMessage() + RESET);
        }
    }


}
