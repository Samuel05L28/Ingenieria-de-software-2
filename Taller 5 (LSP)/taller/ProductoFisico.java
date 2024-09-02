package taller;

public class ProductoFisico extends Producto implements EnviarCorreo {
    private double peso;

    public ProductoFisico(String nombre, int precio, int cantidad, double peso) {
        super(nombre, precio, cantidad);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    @Override
    public double CalcularCosto() {
        double costoEnvio = peso * 10;
        return gertPrecio() * getCantidad() + costoEnvio;
    }

    @Override
    public void enviarPorCorreo() {
        System.out.println("El producto físico " + getNombre() + " ha sido enviado por correo.");
    }
}
