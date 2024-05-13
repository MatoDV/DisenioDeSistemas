package Strategy;

import java.util.ArrayList;
import java.util.List;

public class BusquedaTemas implements Buscador{
    @Override
    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio) {
        String temaBusqueda = (String) criterio;
        List<PaginaWeb> resultado = new ArrayList<>();
        for (PaginaWeb pagina : paginas) {
            if (pagina.getTemas().stream().anyMatch(tema -> tema.toLowerCase().contains(temaBusqueda.toLowerCase()))) {
                resultado.add(pagina);
            }
        }
        return resultado;
    }
}
