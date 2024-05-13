package Strategy;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Supongamos que tenemos una lista de páginas web
        List<PaginaWeb> paginas = obtenerPaginasDesdeAlgunaFuente();

        // Creamos el buscador con una estrategia de búsqueda específica (por autor)
        BuscadorPaginasWeb buscador = new BuscadorPaginasWeb(new BusquedaPorAutor());

        // Realizamos la búsqueda por autor
        List<PaginaWeb> resultado = buscador.buscar(paginas, "John Doe");

        // Mostramos el resultado de la búsqueda
        for (PaginaWeb pagina : resultado) {
            System.out.println(pagina.getUrl());
        }
    }

    // Método ficticio para obtener las páginas web desde alguna fuente
    private static List<PaginaWeb> obtenerPaginasDesdeAlgunaFuente() {
        // Implementación ficticia para obtener las páginas web
        return null;
    }
}
