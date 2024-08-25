interface Envio {
    double calcularCosto(double peso, double distancia);
}

class EnvioEstandar implements Envio {
    public double calcularCosto(double peso, double distancia) {
        return peso * 0.5 + distancia * 0.5;
    }
}

class EnvioExpress implements Envio {
    public double calcularCosto(double peso, double distancia) {
        return peso * 0.8 + distancia * 0.2;
    }
}

class EnvioInternacional implements Envio {
    public double calcularCosto(double peso, double distancia) {
        return peso * 0.7 + distancia * 0.9 + 4000;
    }
}

class main2 {
    public static void main(String[] args) {
        Envio envioEstandar = new EnvioEstandar();
        Envio envioExpress = new EnvioExpress();
        Envio envioInternacional = new EnvioInternacional();

        System.out.println("Costo de envio estandar: " + envioEstandar.calcularCosto(10, 20));
        System.out.println("Costo de envio express: " + envioExpress.calcularCosto(32, 10));
        System.out.println("Costo de envio internacional: " + envioInternacional.calcularCosto(15, 200));
    }
}
