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
                int opMenu = menuPrincipal();
                switch (opMenu){
                    case 1:{
                        System.out.println(AZUL + "\n\t1. Videojuegos"+ RESET);
                    }break;
                    case 2:{
                        System.out.println(AZUL + "\n\t2. Grupos Musicales o Artistas" + RESET);
                    }break;
                    case 3:{
                        System.out.println(AZUL + "\n\t3. Comida a Nivel Mundial" + RESET);
                    }break;
                    case 4:{
                        System.out.printf(VERDE + "Saliendo......" + RESET);
                        pausar = true;
                    }
                }

            }
        }catch (Exception ex){
            System.out.println(ROJO + "\n\tTipo de dato ingresado incorrectamente!!!" + ex.getLocalizedMessage() + RESET);
        }
    }
    public static int menuPrincipal(){
        int opPrincipal = 0;//Variable paa recoger la opcion del menu ingresado por el usuario
        System.out.println(AZUL + "\t\t\t ***** MENU *****" + RESET);
        System.out.println(AZUL + "\t1. Videojuegos"+ RESET);
        System.out.println(AZUL + "\t2. Grupos Musicales o Artistas" + RESET);
        System.out.println(AZUL + "\t3. Comida a Nivel Mundial" + RESET);
        System.out.println(AZUL + "\t4. SALIR" + RESET);
        System.out.print("\tOpcion?: ");
        opPrincipal = sc.nextInt();
        while ((opPrincipal < 1) || (opPrincipal > 4)){
            System.out.print(ROJO + "Ingrese una opcion en el rango 1-4: ");
            opPrincipal = sc.nextInt();
        }
        return opPrincipal;
    }

}
