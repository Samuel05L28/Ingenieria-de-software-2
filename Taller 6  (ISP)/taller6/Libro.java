package taller6;

public class Libro implements LibreriaLibro {
    private String titulo;
    private String imgPortada;
    private int cantidadHojas;
    private int version;
    private int stock;

    public Libro(String titulo, String imgPortada, int cantidadHojas, int version, int stock) {
        this.titulo = titulo;
        this.imgPortada = imgPortada;
        this.cantidadHojas = cantidadHojas;
        this.version = version;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getImgPortada() {
        return imgPortada;
    }

    public void setImgPortada(String imgPortada) {
        this.imgPortada = imgPortada;
    }

    public int getCantidadHojas() {
        return cantidadHojas;
    }

    public void setCantidadHojas(int cantidadHojas) {
        this.cantidadHojas = cantidadHojas;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
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
    public void renovarPortada() {
        this.imgPortada = "Nueva imagen de portada";
        System.out.println("Portada del libro renovada.");
    }

    @Override
    public void mantenimientoHojas() {
        System.out.println("Realizando mantenimiento de las hojas del libro.");
    }

    @Override
    public void solicitarVersion() {
        System.out.println("Nueva versión del libro solicitada. Versión actual: " + version);
    }
}