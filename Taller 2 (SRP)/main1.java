import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class main1 {
    public static void main(String[] args) {

        Factura factura1 = new Factura("F001", new Date(), "Samuel Escobar", 1234.56, "Cra 10 b #41 c 19");
        Cliente cliente1 = new Cliente("Samuel Escobar", "Cra 10 b #41 c 19", "+57 310 567 4365", "samuel@gmail.com");


        GuardarFactura guardarFactura = new GuardarFactura();
        EnviarEmailFactura enviarEmailFactura = new EnviarEmailFactura();
        GuardarCliente guardarCliente = new GuardarCliente();
        GenerarReporteFacturas generarReporteFacturas = new GenerarReporteFacturas();
        EmailFacturaDian emailFacturaDian = new EmailFacturaDian();


        guardarFactura.agregarFactura(factura1);
        guardarCliente.agregarCliente(cliente1);


        enviarEmailFactura.enviar(factura1, cliente1.getCorreoElectronico());


        emailFacturaDian.enviar(factura1);


        generarReporteFacturas.generarReporte(guardarFactura.listarFacturas());


        Cliente clienteBuscado = guardarCliente.buscarClientePorNombre("Samuel Escobar");
        System.out.println("Cliente buscado: " + clienteBuscado);
    }
}

// Clase Factura
// Se encarga de manejar toda la información relacionada con una factura individual.
// Esta clase es responsable únicamente de los atributos y métodos relacionados con la factura,
// como el número de factura, fecha, cliente asociado, monto total y dirección.
class Factura {
    private String numeroFactura;
    private Date fecha;
    private String cliente;
    private double montoTotal;
    private String direccion;


    public Factura(String numeroFactura, Date fecha, String cliente, double montoTotal, String direccion) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
        this.cliente = cliente;
        this.montoTotal = montoTotal;
        this.direccion = direccion;
    }


    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

// Clase Cliente
// Se encarga de manejar toda la información relacionada con un cliente individual.
// Esta clase es responsable únicamente de los atributos y métodos relacionados con el cliente,
// como el nombre, dirección, teléfono y correo electrónico.
class Cliente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String correoElectronico;


    public Cliente(String nombre, String direccion, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}

// Clase GuardarFactura
// Se encarga de almacenar y gestionar la colección de facturas.
// Esta clase tiene métodos para agregar, buscar, listar y eliminar facturas.
// Separamos esta funcionalidad para mantener la clase Factura enfocada únicamente en los datos de una factura,

class GuardarFactura {
    private List<Factura> facturas;


    public GuardarFactura() {
        this.facturas = new ArrayList<>();
    }


    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }


    public Factura buscarFacturaPorNumero(String numeroFactura) {
        Optional<Factura> factura = facturas.stream()
                                            .filter(f -> f.getNumeroFactura().equals(numeroFactura))
                                            .findFirst();
        return factura.orElse(null);
    }

    public List<Factura> listarFacturas() {
        return new ArrayList<>(facturas);
    }

    public boolean eliminarFacturaPorNumero(String numeroFactura) {
        return facturas.removeIf(f -> f.getNumeroFactura().equals(numeroFactura));
    }
}

// Clase EnviarEmailFactura
// Se encarga de enviar una factura por email.
// Esta clase está separada para mantener la clase Factura libre de responsabilidades relacionadas con el envío de emails.
// De esta manera, Factura solo maneja datos y EnviarEmailFactura maneja la lógica de comunicación.
class EnviarEmailFactura {
    public void enviar(Factura factura, String correoDestinatario) {
        System.out.println("Enviando email a: " + correoDestinatario);
        System.out.println("Asunto: Factura " + factura.getNumeroFactura());
        System.out.println("-------------------------------------");
        System.out.println("Contenido del email:\n" +
                           "Factura No: " + factura.getNumeroFactura() + "\n" +
                           "Fecha: " + factura.getFecha() + "\n" +
                           "Cliente: " + factura.getCliente() + "\n" +
                           "Monto Total: " + factura.getMontoTotal() + "\n" +
                           "Dirección: " + factura.getDireccion());
        System.out.println("Email enviado exitosamente.");
        System.out.println("-------------------------------------");
    }
}

// Clase GuardarCliente
// Se encarga de almacenar y gestionar la colección de clientes.
// Similar a GuardarFactura, esta clase se encarga de la gestión de clientes, separando la funcionalidad de manejo de datos de Cliente.
// Esto mantiene la clase Cliente enfocada únicamente en la información del cliente.
class GuardarCliente {
    private List<Cliente> clientes;

    public GuardarCliente() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorNombre(String nombre) {
        Optional<Cliente> cliente = clientes.stream()
                                            .filter(c -> c.getNombre().equalsIgnoreCase(nombre))
                                            .findFirst();
        return cliente.orElse(null);
    }

    public List<Cliente> listarClientes() {
        return new ArrayList<>(clientes);
    }
}

// Clase GenerarReporteFacturas
// Se encarga de generar un reporte basado en una lista de facturas.
// Esta clase está separada de la clase Factura para cumplir con el SRP, asegurando que Factura se mantenga enfocada en la información de las facturas,
// mientras que GenerarReporteFacturas se ocupa de la lógica de generación de reportes.
class GenerarReporteFacturas {

    public void generarReporte(List<Factura> facturas) {
        System.out.println("-------------------------------------");
        System.out.println("Reporte de Facturas:");
        for (Factura factura : facturas) {
            System.out.println("Factura No: " + factura.getNumeroFactura());
            System.out.println("Fecha: " + factura.getFecha());
            System.out.println("Cliente: " + factura.getCliente());
            System.out.println("Monto Total: " + factura.getMontoTotal());
            System.out.println("Dirección: " + factura.getDireccion());
            System.out.println("-------------------------------------");
        }
    }
}

// Clase EmailFacturaDian
// Se encarga de enviar una factura a la DIAN (Dirección de Impuestos y Aduanas Nacionales).
// La separación de esta clase sigue el SRP, manteniendo la clase Factura libre de responsabilidades de envío a entidades externas,
// mientras que EmailFacturaDian maneja la lógica específica de envío a la DIAN
class EmailFacturaDian {

    public void enviar(Factura factura) {
        System.out.println("-------------------------------------");
        System.out.println("Enviando factura a la DIAN:");
        System.out.println("Factura No: " + factura.getNumeroFactura());
        System.out.println("Fecha: " + factura.getFecha());
        System.out.println("Cliente: " + factura.getCliente());
        System.out.println("Monto Total: " + factura.getMontoTotal());
        System.out.println("Dirección: " + factura.getDireccion());
        System.out.println("Factura enviada exitosamente a la DIAN.");
        System.out.println("-------------------------------------");
    }
}
