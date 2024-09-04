package taller6_1;

public class PaquetePequeño extends Paquete implements IPaquete {

    private double valorDeclarado;

    public PaquetePequeño(double peso, String dimension, double valorDeclarado) {
        super(peso, dimension);
        this.valorDeclarado = valorDeclarado;
    }

    public double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public void calcularCosto() {
        double costoBase = 5.0;  
        double costoPorPeso = getPeso() * 2.0;  
        double costoPorValor = valorDeclarado * 0.01;
        double costoTotal = costoBase + costoPorPeso + costoPorValor;
        
        System.out.println("El costo de envío del paquete pequeño es: $" + costoTotal);
    }
}