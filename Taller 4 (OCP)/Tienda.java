import java.util.List;

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

class CalculoImpuestoSaludable2 extends Calculo {
    private final double SALUD = 0.15;

    public CalculoImpuestoSaludable2(String producto, int cantidad, int precio) {
        super(producto, cantidad, precio);
    }

    @Override
    public double calcularImpuesto() {
        return getPrecio() * getCantidad() * SALUD;
    }

    @Override
    public String obtenerNombreImpuesto() {
        return "Impuesto Saludable 2 (5%)";
    }
}

class Factura {
    private List<Calculo> calculos;

    public Factura(List<Calculo> calculos) {
        this.calculos = calculos;
    }

    public void procesarImpuestos() {
        for (Calculo calculo : calculos) {
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
}

public class Tienda {
    public static void main(String[] args) {
        String producto = "Celular";
        int cantidad = 10;
        int precio = 250;


        Calculo calculoIva = new CalculoImpuesto(producto, cantidad, precio);
        Calculo calculoReteIva = new CalculoImpuestoRelativa(producto, cantidad, precio);
        Calculo calculoSaludable = new CalculoImpuestoSaludable(producto, cantidad, precio);
        Calculo calculoSaludable2 = new CalculoImpuestoSaludable2(producto, cantidad, precio);


        List<Calculo> calculos = List.of(calculoIva, calculoReteIva, calculoSaludable,calculoSaludable2);

  
        Factura factura = new Factura(calculos);

        
        factura.procesarImpuestos();
    }
}
