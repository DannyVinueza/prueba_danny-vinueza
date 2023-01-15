public class generoArtistas extends nombreArtistas{
    String generoMusica;
    int nCanciones;

    public generoArtistas(String nombreArt, int anioNac, String generoMusica, int nCanciones) {
        super(nombreArt, anioNac);//Hereda de la clase nombreArtistas
        this.generoMusica = generoMusica;
        this.nCanciones = nCanciones;
    }

    public String getGeneroMusica() {
        return generoMusica;
    }

    public void setGeneroMusica(String generoMusica) {
        this.generoMusica = generoMusica;
    }

    public int getnCanciones() {
        return nCanciones;
    }

    public void setnCanciones(int nCanciones) {
        this.nCanciones = nCanciones;
    }

    public String imprimiClasehija(String nombreArt, int anioNac, String generoMusica, int nCanciones){
        return ("Artista: " + nombreArt +
                "\nAnio de nacimiento: " + anioNac +
                "\nGenero de Musica: " + generoMusica +
                "\n# Canciones: " + nCanciones);
    }

}
