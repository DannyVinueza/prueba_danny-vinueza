public class presentacionArtistas extends generoArtistas{//Clase Nieta
    static final String RESET = "\u001B[0m";//Elimina el color anterior
    static final String AZUL = "\u001B[34m";//Color azul a las letras
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
        return (AZUL + "Artista: " + RESET + nombreArt +
                AZUL + "\nAnio de nacimiento: " + RESET + anioNac +
                AZUL + "\nGenero de Musica: " + RESET + generoMusica +
                AZUL + "\n# Canciones: " + RESET + nCanciones +
                AZUL + "\nPais de presentacion: " + RESET + paisPresentacion +
                AZUL + "\nCiudad de presentacion: " + RESET + ciudadPresentacion);
    }

    public void imprimirListaArt(){
        System.out.println(AZUL + "Artista: " + RESET + nombreArt +
                AZUL + "\nAnio de nacimiento: " + RESET + anioNac +
                AZUL + "\nGenero de Musica: " + RESET + generoMusica +
                AZUL + "\n# Canciones: " + RESET + nCanciones +
                AZUL + "\nPais de presentacion: " + RESET + paisPresentacion +
                AZUL + "\nCiudad de presentacion: " + RESET + ciudadPresentacion);
    }
}
