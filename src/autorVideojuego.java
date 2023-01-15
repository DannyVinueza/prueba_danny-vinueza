public class autorVideojuego extends categoriaVideojuego{//Clase Nieta
    static final String RESET = "\u001B[0m";//Elimina el color anterior
    static final String AZUL = "\u001B[34m";//Color azul a las letras
    String nombreAutor;
    int edad;

    public autorVideojuego(String nombre, int anio, String tipoCategoria, String pais, String nombreAutor, int edad) {
        super(nombre, anio, tipoCategoria, pais);//Hereda de la clase categoriaVideojuego
        this.nombreAutor = nombreAutor;
        this.edad = edad;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String miVideojuego(String nombre, int anio, String tipoCategoria, String pais, String nombreAutor, int edad){
        return (AZUL + "Nombre del videojuego es: " + RESET + nombre +
                AZUL + "\nPublicado: " + RESET + anio +
                AZUL + "\nCategoria: " + RESET + tipoCategoria +
                AZUL + "\nPais: " + RESET + pais +
                AZUL + "\nAutor:" + RESET + nombreAutor +
                AZUL + "\nEdad del autor: " + RESET + edad);
    }
    public void imprimirVideojuego(){
        System.out.print(AZUL + "Nombre del videojuego es: " + RESET + nombre +
                AZUL + "\nPublicado: " + RESET + anio +
                AZUL + "\nCategoria: " + RESET + tipoCategoria +
                AZUL + "\nPais: " + RESET + pais +
                AZUL + "\nAutor: " + RESET + nombreAutor +
                AZUL + "\nEdad del autor: " + RESET + edad);
    }
}
