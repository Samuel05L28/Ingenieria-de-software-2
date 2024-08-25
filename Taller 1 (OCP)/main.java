interface envio {
    double calcularCosto(double peso, double distancia);
}

class envioEstandar implements envio{

    public double calcularCosto(double peso, double distancia){
        return peso * 0.5 + distancia * 0.5;
    }
}

class envioExpress implements envio{

    public double calcularCosto(double peso, double distancia){
        return peso * 0.8 + distancia * 0.2;
    }
}

class envioInternacional implements envio{

    public double calcularCosto(double peso, double distancia){
        return peso * 0.7 + distancia * 0.9 + 4000;
    }
}
class main{
    public static void en(String[] args) {

        envio envioEstandar = new envioEstandar();
        envio envioExpress = new envioExpress();
        envio envioInternacional = new envioInternacional();

        System.err.println("Costo de envio estandar: " + envioEstandar.calcularCosto(10,20));
        System.err.println("Costo de envio estandar: " + envioExpress.calcularCosto(32,10));
        System.err.println("Costo de envio estandar: " + envioInternacional.calcularCosto(15,200));
        
    }
}