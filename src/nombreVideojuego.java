public class nombreVideojuego {
    String nombre;
    int anio;

    public nombreVideojuego(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String datosImportantes(String nombre, int anio){//Muestra solo los datos de la clase padre
        return ("Nombre del videojuego es: " + nombre + " Publicado: " + anio);
    }
}
