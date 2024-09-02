package taller;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularValorInventario() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.CalcularCosto();
        }
        return total;
    }

    public void enviarProductosPorCorreo() {
        for (Producto producto : productos) {
            if (producto instanceof EnviarCorreo) {
                ((EnviarCorreo) producto).enviarPorCorreo();
            }
        }
    }
}
