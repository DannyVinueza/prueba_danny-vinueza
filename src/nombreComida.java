public class nombreComida {//Calse padre o superclase
    String nombreComida;
    double precio;

    public nombreComida(String nombreComida, double precio) {
        this.nombreComida = nombreComida;
        this.precio = precio;
    }

    public String getNombreComida() {
        return nombreComida;
    }

    public void setNombreComida(String nombreComida) {
        this.nombreComida = nombreComida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
