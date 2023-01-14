import java.util.ArrayList;
import java.util.List;
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
                        String nombreVideojuego, categoria, pais, nombreAutorv;
                        int anio, edad;
                        List listaVideojuegos = new ArrayList();
                        //for(int i = 0;i < 4; i++) {
                            System.out.print("Ingrese el nombre del videojuego: ");
                            sc.nextLine();
                            nombreVideojuego = sc.nextLine();
                            System.out.print("Ingrese el anio de publicacion: ");
                            anio = sc.nextInt();
                            System.out.print("Ingrese la categoria: ");
                            sc.nextLine();
                            categoria = sc.nextLine();
                            System.out.print("Ingrese el pais de origen del videojuego: ");
                            pais = sc.nextLine();
                            System.out.print("Ingrese el nombre del autor: ");
                            nombreAutorv = sc.nextLine();
                            System.out.print("Ingrese la edad del autor: ");
                            edad = sc.nextInt();

                            //List listaVideojuegos = new ArrayList();

                            listaVideojuegos.add(new autorVideojuego(nombreVideojuego, anio, categoria, pais, nombreAutorv, edad));
                        //}
                        imprimirLista((ArrayList) listaVideojuegos);
                        /*autorVideojuego miPVideojuego = new autorVideojuego(nombreVideojuego,anio,categoria,pais,nombreAutorv,edad);
                        System.out.println(miPVideojuego.datosImportantes(nombreVideojuego,anio));
                        System.out.println(miPVideojuego.datosMas(nombreVideojuego,anio,categoria,pais));
                        System.out.println(miPVideojuego.miVideojuego(nombreVideojuego,anio,categoria,pais,nombreAutorv,edad));*/
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

    public static void imprimirLista(ArrayList lista){
        for (int i = 0; i < lista.size();i++){
            autorVideojuego videojuego = (autorVideojuego)lista.get(i);
            videojuego.imprimirVideojuego();

            System.out.println("");
        }
    }

}
