//Utilizar clase abstract

abstract class Calculo {
    private String producto;
    private int cantidad;
    private int precio;
    
    public Calculo(String producto, int cantidad, int precio) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    public String getProducto() { return producto; }
    public int getCantidad() { return cantidad; }
    public int getPrecio() { return precio; }

    abstract double calcularImpuesto();

    abstract String obtenerNombreImpuesto();
}


 class CalculoImpuesto extends Calculo {
    private final double IVA = 0.19;

    public CalculoImpuesto(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * getCantidad() * IVA;
    }

    @Override
    public String obtenerNombreImpuesto() {
        return "IVA (19%)";
    }
}

class CalculoImpuestoRelativa extends Calculo {
    private final double RETE_IVA = 0.10;

    public CalculoImpuestoRelativa(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * getCantidad() * RETE_IVA;
    }

    @Override
    public String obtenerNombreImpuesto() {
        return "Rete IVA (10%)";
    }
}

class CalculoImpuestoSaludable extends Calculo {
    private final double SALUD = 0.05;

    public CalculoImpuestoSaludable(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * getCantidad() * SALUD;
    }

    @Override
    public String obtenerNombreImpuesto() {
        return "Impuesto Saludable (5%)";
    }
}

class Factura {
    public void procesarImpuesto(Calculo calculo) {
        double impuesto = calculo.calcularImpuesto();
        String nombreImpuesto = calculo.obtenerNombreImpuesto();
        System.out.println("Producto: " + calculo.getProducto());
        System.out.println("Cantidad: " + calculo.getCantidad());
        System.out.println("Precio unitario: " + calculo.getPrecio());
        System.out.println("El " + nombreImpuesto + " calculado es: " + impuesto);
        System.out.println("Total con impuesto: " + (calculo.getPrecio() * calculo.getCantidad() + impuesto));
        System.out.println("-------------------------------------------");
    }
}

public class Tienda {
    public static void main(String[] args) {
        String producto = "Celular";
        int cantidad = 10;
        int precio = 250;

        Factura factura = new Factura();

        Calculo calculoIva = new CalculoImpuesto(producto, cantidad, precio);
        factura.procesarImpuesto(calculoIva);

        Calculo calculoReteIva = new CalculoImpuestoRelativa(producto, cantidad, precio);
        factura.procesarImpuesto(calculoReteIva);

        Calculo calculoSaludable = new CalculoImpuestoSaludable(producto, cantidad, precio);
        factura.procesarImpuesto(calculoSaludable);
    }
}
