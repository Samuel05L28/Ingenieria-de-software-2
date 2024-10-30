package Primer_pregunta.CONTROLADOR;
import java.util.ArrayList;
import java.util.List;

public class Libreria {
    private List<Libro> libros = new ArrayList<>();

    public Libreria(List<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public Libro buscarLibrosTitulo(String titulo){
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null; 
        

    }

    public Libro buscarLibrosAutor(String autor){
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null; 
        
    }

    public Libro obtenerLibroPrecios(String precio){
        for (Libro libro : libros) {
            if (libro.getPrecio().equals(precio)) {
                return libro;
            }
        }
        return null;
        
    }

    public Libro obtenerLibroAño(String año){
        for (Libro libro : libros) {
            if (libro.getAño().equals(año)) {
                return libro;
            }
        }
        return null; 
    }
    
}
