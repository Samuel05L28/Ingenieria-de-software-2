import java.util.List;

public class FacturaService {
    public double calcularPrecioConDescuento(Factura factura, double descuento) {
        return factura.getTotal() - (factura.getTotal() * descuento);
    }

    public void calcularTotal(Factura factura) {
        double total = 0;
        for (Producto producto : factura.getListaProductosComprados()) {
            total += producto.getPrecioProducto();
        }
        factura.setTotal(total);
    }

    public String generarNumeroFactura() {
        return "FACT-" + System.currentTimeMillis();
    }

    public void procesarFactura(Factura factura, Cliente cliente, List<Producto> productos) {
        factura.setCliente(cliente);
        factura.setListaProductosComprados(productos);
        calcularTotal(factura);
        FacturaCrud facturaCrud = new FacturaCrud();
        facturaCrud.save(factura);
    }
}