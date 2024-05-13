package Composite;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        Productos producto1 = new Productos(10);
        Productos producto2 = new Productos(15);

        // Crear caja con productos
        Cajas caja1 = new Cajas();
        caja1.agregarItem(producto1);
        caja1.agregarItem(producto2);

        // Crear caja más grande con caja y productos
        Cajas caja2 = new Cajas();
        caja2.agregarItem(producto1);
        caja2.agregarItem(caja1);

        // Calcular precio total del pedido
        double precioTotal = caja2.getPrecioTotal();
        System.out.println("Precio total del pedido: $" + precioTotal);
    }
}
