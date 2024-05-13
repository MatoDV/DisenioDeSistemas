package Composite;

import java.util.ArrayList;
import java.util.List;

public class Cajas implements ItemPedido {
    private List<ItemPedido> items = new ArrayList<>();

    public void agregarItem(ItemPedido item) {
        items.add(item);
    }

    @Override
    public int getPrecioTotal() {
        int precio = 0;
        for (ItemPedido item : items){
            precio += item.getPrecioTotal();
        }
        return precio;
    }
}
