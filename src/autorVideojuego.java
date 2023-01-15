public class autorVideojuego extends categoriaVideojuego{//Clase Nieta
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
        return ("Nombre del videojuego es: " + nombre + " Publicado: " + anio + " Categoria: " + tipoCategoria + " Pais: " + pais
                + " Autor:" + nombreAutor + " Edad del autor: " + edad);
    }
    public void imprimirVideojuego(){
        System.out.print("Nombre del videojuego es: " + nombre + " Publicado: " + anio + " Categoria: " + tipoCategoria + " Pais: " + pais
                + " Autor:" + nombreAutor + " Edad del autor: " + edad);
    }
}
