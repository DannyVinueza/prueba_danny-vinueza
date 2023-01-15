public class nombreArtistas {//Clase padre o superclase
    String nombreArt;
    int anioNac;

    public nombreArtistas(String nombreArt, int anioNac){
        this.nombreArt = nombreArt;
        this.anioNac = anioNac;
    }

    public String getNombreArt() {
        return nombreArt;
    }

    public void setNombreArt(String nombreArt) {
        this.nombreArt = nombreArt;
    }

    public int getAnioNac() {
        return anioNac;
    }

    public void setAnioNac(int anioNac) {
        this.anioNac = anioNac;
    }
    public String imprimiClasePadre(String nombreArt, int anioNac){
        return ("Artista: " + nombreArt +
                "\nAnio de nacimiento: " + anioNac);
    }
}
