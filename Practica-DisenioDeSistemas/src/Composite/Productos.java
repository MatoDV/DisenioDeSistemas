package Composite;

public class Productos implements ItemPedido {
    private int precio;
    public Productos(int unPrecio){
        this.precio = unPrecio;
    }

    @Override
    public int getPrecioTotal() {
        return this.precio;
    }
}
