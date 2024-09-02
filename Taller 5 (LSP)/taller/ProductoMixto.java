package taller;

public class ProductoMixto extends Producto implements EnviarCorreo {
    private ProductoFisico productoFisico;
    private ProductoDigital productoDigital;

    public ProductoMixto(String nombre, int precio, int cantidad, double peso, int tamañoArchivo) {
        super(nombre, precio, cantidad);
        this.productoFisico = new ProductoFisico(nombre, precio, cantidad, peso);
        this.productoDigital = new ProductoDigital(nombre, precio, cantidad, tamañoArchivo);
    }

    @Override
    public double CalcularCosto() {
        return productoFisico.CalcularCosto() + productoDigital.CalcularCosto() - gertPrecio() * getCantidad();
    }

    @Override
    public void enviarPorCorreo() {
        productoFisico.enviarPorCorreo();
    }
}
