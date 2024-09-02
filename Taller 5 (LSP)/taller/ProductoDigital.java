package taller;

 class ProductoDigital extends Producto {
    private int tamañoArchivo;

    public ProductoDigital(String nombre, int precio, int cantidad, int tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.tamañoArchivo = tamañoArchivo;
    }

    public int getTamañoArchivo() {
        return tamañoArchivo;
    }

    @Override
    public double CalcularCosto() {
        return gertPrecio() * getCantidad();
    }
}
