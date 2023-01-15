public class ubicacionComida extends nombreComida{//Clase Hija
    String paisComida;
    String categoriaCom;

    public ubicacionComida(String nombreComida, double precio, String paisComida, String categoriaCom) {
        super(nombreComida, precio);//Hereda de la clase nombreComida
        this.paisComida = paisComida;
        this.categoriaCom = categoriaCom;
    }

    public String getPaisComida() {
        return paisComida;
    }

    public void setPaisComida(String paisComida) {
        this.paisComida = paisComida;
    }

    public String getCategoriaCom() {
        return categoriaCom;
    }

    public void setCategoriaCom(String categoriaCom) {
        this.categoriaCom = categoriaCom;
    }
}
