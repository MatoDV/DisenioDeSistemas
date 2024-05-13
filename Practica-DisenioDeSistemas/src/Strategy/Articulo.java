package Strategy;

import java.util.Date;
import java.util.List;

public class Articulo{
    private String titulo;
    private List<String> temas;
    private Autor autor;
    private Date fechaPublicacion;

    public Articulo(String titulo, List<String> temas, Autor autor, Date fechaPublicacion) {
        this.titulo = titulo;
        this.temas = temas;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getTemas() {
        return temas;
    }

    public Autor getAutor() {
        return autor;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }
}
