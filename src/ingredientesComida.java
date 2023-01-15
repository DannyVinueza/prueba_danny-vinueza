public class ingredientesComida extends ubicacionComida{//Clase Nieta
    static final String RESET = "\u001B[0m";//Elimina el color anterior
    static final String AZUL = "\u001B[34m";//Color azul a las letras
    String ingredientes;

    public ingredientesComida(String nombreComida, double precio, String paisComida, String categoriaCom, String ingredientes) {
        super(nombreComida, precio, paisComida, categoriaCom);
        this.ingredientes = ingredientes;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String imprimirTodoArt(String nombreComida, double precio, String paisComida, String categoriaCom, String ingredientes){
        return (AZUL + "Comida: " + RESET + nombreComida +
                AZUL + "\n Precio: " + RESET + precio +
                AZUL + "\nPais de origen: " + RESET + paisComida +
                AZUL + "\nCateogria: " + RESET + categoriaCom +
                AZUL + "\nIngredientes: " + RESET + ingredientes);
    }

    public void imprimirListaCom(){
        System.out.println(AZUL + "Comida: " + RESET + nombreComida +
                AZUL + "\nPrecio: " + RESET + precio +
                AZUL + "\nPais de origen: " + RESET + paisComida +
                AZUL + "\nCateogria: " + RESET + categoriaCom +
                AZUL + "\nIngredientes: " + RESET + ingredientes);
    }
}
