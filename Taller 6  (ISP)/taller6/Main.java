package taller6;

public class Main {
    public static void main(String[] args) {
        Libro miLibro = new Libro("Relatos de una naufrago", "Imagen/jpg", 349, 3, 19);

        System.out.println("Clase libro:");
        System.out.println("Título: " + miLibro.getTitulo());
        miLibro.prestar();
        miLibro.devolver();
        miLibro.renovarPortada();
        miLibro.mantenimientoHojas();
        miLibro.solicitarVersion();

        Dvd miDVD = new Dvd("Dvd1", 8);

        System.out.println("\nClase dvd:");
        System.out.println("Título: " + miDVD.getTitulo());
        miDVD.prestar();
        miDVD.devolver();

        Cartilla miCartilla = new Cartilla("Manual", 26, 3);

        System.out.println("\nClase cartilla:");
        System.out.println("Título: " + miCartilla.getTitulo());
        miCartilla.prestar();
        miCartilla.devolver();
        miCartilla.mantenimientoHojas();
    }
}
