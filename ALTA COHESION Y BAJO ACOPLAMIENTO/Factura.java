import java.util.Date;
import java.util.List;

public class Factura {
    private Cliente cliente;
    private List<Producto> listaProductosComprados;
    private double descuento;
    private double total;
    private Date fechaCompra;

    public Factura(Cliente cliente, List<Producto> listaProductosComprados, double descuento, Date fechaCompra) {
        this.cliente = cliente;
        this.listaProductosComprados = listaProductosComprados;
        this.descuento = descuento;
        this.fechaCompra = fechaCompra;
        this.total = 0;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProductosComprados() {
        return listaProductosComprados;
    }

    public void setListaProductosComprados(List<Producto> listaProductosComprados) {
        this.listaProductosComprados = listaProductosComprados;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}