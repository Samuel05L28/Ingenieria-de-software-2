package taller6_1;

public class PaqueteGrande extends Paquete implements IPaquete {
    private double volumen;
    private String medioTransporte;

    public PaqueteGrande(double peso, String dimension, double volumen, String medioTransporte) {
        super(peso, dimension);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    @Override
    public void calcularCosto() {
        double costoBase = 10.0;
        double costoPorPeso = getPeso() * 3.0;
        double costoPorVolumen = volumen * 5.0;
        double costoPorTransporte;

        switch (medioTransporte.toLowerCase()) {
            case "terrestre":
                costoPorTransporte = 50.0;
                break;
            case "aéreo":
                costoPorTransporte = 100.0;
                break;
            case "marítimo":
                costoPorTransporte = 80.0;
                break;
            default:
                costoPorTransporte = 60.0;
        }

        double costoTotal = costoBase + costoPorPeso + costoPorVolumen + costoPorTransporte;
        System.out.println("El costo de envío del paquete grande es: $" + costoTotal);
    }

    
}

