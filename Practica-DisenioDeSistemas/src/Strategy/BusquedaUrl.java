package Strategy;

import java.util.ArrayList;
import java.util.List;

public class BusquedaUrl implements Buscador{
    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio) {
        String urlBusqueda = (String) criterio;
        List<PaginaWeb> resultado = new ArrayList<>();
        for (PaginaWeb pagina : paginas) {
            if (pagina.getUrl().toLowerCase().contains(urlBusqueda.toLowerCase())) {
                resultado.add(pagina);
            }
        }
        return resultado;
    }
}
