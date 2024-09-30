import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private double precio;
    private int cantidad;

    public Libro(String titulo, String autor, String isbn, double precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCanitidad() {
        return cantidad;
    }
}
class Carrito{
   private List<Libro> libros = new ArrayList<>();
    private List<Integer> cantidades = new ArrayList<>();

    public void agregarLibro(Libro libro, int cantidad) {
        libros.add(libro);
        cantidades.add(cantidad);
    }

    public void eliminarLibro(Libro libro) {
        int index = libros.indexOf(libro);
        if (index != -1) {
            libros.remove(index);
            cantidades.remove(index);
        }
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Libro libro : libros) {
            total += libro.getPrecio() * libro.getCanitidad();
        }
        return total;
    }
}

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("El principito", "Autor", "ISBN1", 1000.0, 3);

        Carrito carrito = new Carrito();
        carrito.agregarLibro(libro1, 2);

        System.out.println("Precio total del carrito: " + carrito.calcularPrecioTotal());
    }
}
        

