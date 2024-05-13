package Strategy;

import java.util.List;

public class BuscadorPaginasWeb {
    private Buscador buscador;

    public BuscadorPaginasWeb(Buscador buscadores) {
        this.buscador = buscadores;
    }

    public List<PaginaWeb> buscar(List<PaginaWeb> paginas, Object criterio) {
        return buscador.buscar(paginas, criterio);
    }
}
