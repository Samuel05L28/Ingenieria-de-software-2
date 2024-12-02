//Aplicar el patron Factory

interface ServicioEnvio {
    void enviarPaquete(String paquete);
}

class ServicioEnvioRegular implements ServicioEnvio {
    @Override
    public void enviarPaquete(String paquete) {
        System.out.println("Enviando paquete de forma regular: " + paquete);
    }
}


class ServicioEnvioExpress implements ServicioEnvio {
    @Override
    public void enviarPaquete(String paquete) {
        System.out.println("Enviando paquete de forma express: " + paquete);
    }
}


interface ServicioEnvioFactory {
    ServicioEnvio crearServicioEnvio();
}


class ServicioEnvioRegularFactory implements ServicioEnvioFactory {
    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new ServicioEnvioRegular();
    }
}


class ServicioEnvioExpressFactory implements ServicioEnvioFactory {
    @Override
    public ServicioEnvio crearServicioEnvio() {
        return new ServicioEnvioExpress();
    }
}


public class Primera_Pregunta {
    public static void main(String[] args) {

        ServicioEnvioFactory factoryRegular = new ServicioEnvioRegularFactory();
        ServicioEnvio envioRegular = factoryRegular.crearServicioEnvio();
        envioRegular.enviarPaquete("Paquete carros");

        ServicioEnvioFactory factoryExpress = new ServicioEnvioExpressFactory();
        ServicioEnvio envioExpress = factoryExpress.crearServicioEnvio();
        envioExpress.enviarPaquete("Paquete celulares");
    }
}
