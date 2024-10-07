import java.util.Date;
import java.util.ArrayList;
import java.util.List;

class Pedido {
    private int id;
    private Date fecha;
    private Cliente cliente;
    private List<Producto> productos;

    public Pedido(int id, Date fecha, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

   
    public int getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}

class Cliente {
    private String nombre;
    private String direccion;

    public Cliente(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }


    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}

class FabricaPedidos {
    public Pedido crearPedido(int id, Date fecha, Cliente cliente) {
        return new Pedido(id, fecha, cliente);
    }

    public Producto crearProducto(String nombre, double precio, int cantidad) {
        return new Producto(nombre, precio, cantidad);
    }

    public Cliente crearCliente(String nombre, String direccion) {
        return new Cliente(nombre, direccion);
    }
}

public class Main {
    public static void main(String[] args) {
        FabricaPedidos fabrica = new FabricaPedidos();

        Cliente cliente = fabrica.crearCliente("Samuel", "Cr 10");
        Pedido pedido = fabrica.crearPedido(1, new Date(), cliente);
        Producto producto1 = fabrica.crearProducto("Celular", 800.0, 3);
        Producto producto2 = fabrica.crearProducto("USB", 20.0, 1);

        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);

        System.out.println("Pedido ID: " + pedido.getId());
        System.out.println("Cliente: " + pedido.getCliente().getNombre());
        System.out.println("Productos:");
        for (Producto producto : pedido.getProductos()) {
            System.out.println("- " + producto.getNombre() + " x" + producto.getCantidad() + " $" + producto.getPrecio());
        }
    }
}