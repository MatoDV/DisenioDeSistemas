package Strategy;

import java.util.Date;
import java.util.List;

public interface Buscador {
    List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio);
}