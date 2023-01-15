public class presentacionArtistas extends generoArtistas{//Clase Nieta
    String paisPresentacion;
    String ciudadPresentacion;

    public presentacionArtistas(String nombreArt, int anioNac, String generoMusica, int nCanciones, String paisPresentacion, String ciudadPresentacion) {
        super(nombreArt, anioNac, generoMusica, nCanciones);//Hereda de la clase generoArtistas
        this.paisPresentacion = paisPresentacion;
        this.ciudadPresentacion = ciudadPresentacion;
    }

    public String getPaisPresentacion() {
        return paisPresentacion;
    }

    public void setPaisPresentacion(String paisPresentacion) {
        this.paisPresentacion = paisPresentacion;
    }

    public String getCiudadPresentacion() {
        return ciudadPresentacion;
    }

    public void setCiudadPresentacion(String ciudadPresentacion) {
        this.ciudadPresentacion = ciudadPresentacion;
    }

    public String imprimirTodo(String nombreArt, int anioNac, String generoMusica, int nCanciones, String paisPresentacion, String ciudadPresentacion){
        return ("Artista: " + nombreArt +
                "\nAnio de nacimiento: " + anioNac +
                "\nGenero de Musica: " + generoMusica +
                "\n# Canciones: " + nCanciones +
                "\nPais de presentacion: " + paisPresentacion +
                "Ciudad de presentacion: " + ciudadPresentacion);
    }

    public void imprimirListaArt(){
        System.out.println("Artista: " + nombreArt +
                "\nAnio de nacimiento: " + anioNac +
                "\nGenero de Musica: " + generoMusica +
                "\n# Canciones: " + nCanciones +
                "\nPais de presentacion: " + paisPresentacion +
                "\nCiudad de presentacion: " + ciudadPresentacion);
    }
}
