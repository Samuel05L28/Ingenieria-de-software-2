package Primer_pregunta.CONTROLADOR;

public class Libro {
    private String titulo;
    private String autor;
    private String  precio;
    private String año;
    
    public Libro(String titulo, String autor, String precio, String año) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.año = año;
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public String getPrecio() {
        return precio;
    }
    public String getAño() {
        return año;
    }

    
}
