package Primer_pregunta.DRY;

public class Main{
    public static void main(String[] args) {
        Orden orden = new Orden();
        
        double impuesto = orden.calcularImpuesto(12);
        double descuento = orden.calcularDescuentoTotal(impuesto, 5);

        System.out.println("Impuesto: " + impuesto);
        System.out.println("Descuento total: "+ descuento);
    }
}