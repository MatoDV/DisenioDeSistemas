package Strategy;

import java.util.ArrayList;
import java.util.List;

public class BusquedaPorAutor implements Buscador{
    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio) {
        String autorBusqueda = (String) criterio;
        List<PaginaWeb> resultado = new ArrayList<>();
        for (PaginaWeb pagina : paginas) {
            for (Articulo articulo : pagina.getArticulos()) {
                if (articulo.getAutor().getNombre().toLowerCase().contains(autorBusqueda.toLowerCase())) {
                    resultado.add(pagina);
                    break;
                }
            }
        }
        return resultado;
    }
}
