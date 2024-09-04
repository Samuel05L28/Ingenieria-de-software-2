package taller6;

public class Cartilla implements LibreriaCartilla {
    private String titulo;
    private int cantidadHojas;
    private int stock;

    public Cartilla(String titulo, int cantidadHojas, int stock) {
        this.titulo = titulo;
        this.cantidadHojas = cantidadHojas;
        this.stock = stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    @Override
    public void prestar() {
        if (stock > 0) {
            stock--;
            System.out.println("Libro prestado. Stock restante: " + stock);
        } else {
            System.out.println("No hay stock disponible para prestar.");
        }
    }

    @Override
    public void devolver() {
        stock++;
        System.out.println("Libro devuelto. Stock actual: " + stock);
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Realizando mantenimiento de las hojas del libro.");
    }

}