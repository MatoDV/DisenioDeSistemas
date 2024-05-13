package Strategy;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusquedaFechaPubli implements Buscador{
    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio) {
        Date fechaBusqueda = (Date) criterio;
        List<PaginaWeb> resultado = new ArrayList<>();
        for (PaginaWeb pagina : paginas) {
            for (Articulo articulo : pagina.getArticulos()) {
                if (articulo.getFechaPublicacion().equals(fechaBusqueda)) {
                    resultado.add(pagina);
                    break;
                }
            }
        }
        return resultado;
    }
}
