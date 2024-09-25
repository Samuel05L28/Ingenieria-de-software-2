import java.util.ArrayList;
import java.util.List;

class Libro{
    String titulo;
    String autor;
    int añopublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñopublicacion() {
        return añopublicacion;
    }

    public void setAñopublicacion(int añopublicacion) {
        this.añopublicacion = añopublicacion;
    }

    public Libro(String titulo, String autor, int añopublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añopublicacion = añopublicacion;
    }
}

class Biblioteca {
    private List<Libro> libros = new ArrayList<Libro>();

    public void faseAgregarLibro(Libro libro){
        libro.setAñopublicacion(2021);
        libros.add(libro);
    }
}


public class YAGNI {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("El principito", "Antoine de Saint-Exupéry", 1943);
        biblioteca.faseAgregarLibro(libro);

        System.out.println("Libro: " + libro.getTitulo());
    }    
}


