package Primer_pregunta.CONTROLADOR;

public class Main {
    public static void main(String[] args) {

        Libro Libro1 = new Libro("El principito", "Roberto", "200","12/!2/2000");

        Libreria libreria = new Libreria(null) ;
        libreria.agregarLibro(Libro1);
        libreria.buscarLibrosAutor("Roberto");
        libreria.buscarLibrosTitulo("El principito");
        libreria.obtenerLibroPrecios("200");
        libreria.obtenerLibroAño("12/!2/2000");
    }
    
}

  