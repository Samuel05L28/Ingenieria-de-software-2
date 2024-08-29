interface Envio {
    double calcularCosto(double peso, double distancia);
}

class EnvioEstandar implements Envio {
    private static final double COSTO_PESO = 0.5;
    private static final double COSTO_DISTANCIA = 0.5;

    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * COSTO_PESO + distancia * COSTO_DISTANCIA;
    }
}

class EnvioExpress implements Envio {
    private static final double COSTO_PESO = 0.8;
    private static final double COSTO_DISTANCIA = 0.2;

    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * COSTO_PESO + distancia * COSTO_DISTANCIA;
    }
}

class EnvioInternacional implements Envio {
    private static final double COSTO_PESO = 0.7;
    private static final double COSTO_DISTANCIA = 0.9;
    private static final double TARIFA_ADICIONAL = 4000;

    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * COSTO_PESO + distancia * COSTO_DISTANCIA + TARIFA_ADICIONAL;
    }
}


class GestorDeEnvios {
    public double calcularCostoEnvio(Envio envio, double peso, double distancia) {
        return envio.calcularCosto(peso, distancia);
    }
}

public class main2 {
    public static void main(String[] args) {

        Envio envioEstandar = new EnvioEstandar();
        Envio envioExpress = new EnvioExpress();
        Envio envioInternacional = new EnvioInternacional();

        GestorDeEnvios gestorDeEnvios = new GestorDeEnvios();

        System.out.println("Costo de envío estándar: " + gestorDeEnvios.calcularCostoEnvio(envioEstandar, 10, 20));
        System.out.println("Costo de envío express: " + gestorDeEnvios.calcularCostoEnvio(envioExpress, 32, 10));
        System.out.println("Costo de envío internacional: " + gestorDeEnvios.calcularCostoEnvio(envioInternacional, 15, 200));
    }
}
