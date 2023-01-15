public class categoriaVideojuego extends nombreVideojuego{
    String tipoCategoria;
    String pais;

    public categoriaVideojuego(String nombre, int anio, String tipoCategoria, String pais) {
        super(nombre, anio);//Hereda de la clase nombreVideojuego
        this.tipoCategoria = tipoCategoria;
        this.pais = pais;
    }

    public String getTipoCategoria() {
        return tipoCategoria;
    }

    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String datosMas(String nombre, int anio, String tipoCategoria, String pais){//Muestra los datos de la clase hija mas la padre
        return ("Nombre del videojuego es: " + nombre + " Publicado: " + anio + " Categoria: " + tipoCategoria + " Pais: " + pais);
    }
}
