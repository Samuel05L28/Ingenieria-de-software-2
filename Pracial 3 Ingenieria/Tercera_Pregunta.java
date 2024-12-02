//Aplicar el patron Adapter

class SistemaPagoAntiguo {
    public void iniciarSesion(String id) {
        System.out.println("Iniciando sesion con id: " + id);
    }

    public void verificarEmail(String email) {
        System.out.println("Verificando email: " + email);
    }

    public void autorizarPago() {
        System.out.println("Autorizando  pago...");
    }

    public void ejecutarPago() {
        System.out.println("Ejecutando pago en sistema antiguo");
    }
}

class NuevoSistemaPago {
    private String nombre;
    private String identificacion;
    private String correo;

    public NuevoSistemaPago(String nombre, String identificacion, String correo) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCorreo() {
        return correo;
    }
}

class NuevoSistemaPagoOperacion {
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("Creando sesion: " + nuevoSistemaPago.getNombre());
    }

    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("Validando el correo: " + nuevoSistemaPago.getCorreo());
    }

    public void ValidarAutorizacion() {
        System.out.println("Validando autorizacion");
    }

    public void realizarPago() {
        System.out.println("Realizando el pago");
    }
}

class SistemaPagoAdapter extends NuevoSistemaPagoOperacion {
    private SistemaPagoAntiguo sistemaAntiguo;

    public SistemaPagoAdapter(SistemaPagoAntiguo sistemaAntiguo) {
        this.sistemaAntiguo = sistemaAntiguo;
    }

    @Override
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        sistemaAntiguo.iniciarSesion(nuevoSistemaPago.getIdentificacion());
    }

    @Override
    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        sistemaAntiguo.verificarEmail(nuevoSistemaPago.getCorreo());
    }

    @Override
    public void ValidarAutorizacion() {
        sistemaAntiguo.autorizarPago();
    }

    @Override
    public void realizarPago() {
        sistemaAntiguo.ejecutarPago();
    }
}

public class Tercera_Pregunta {
    public static void main(String[] args) {

        SistemaPagoAntiguo sistemaAntiguo = new SistemaPagoAntiguo();
        NuevoSistemaPagoOperacion adapter = new SistemaPagoAdapter(sistemaAntiguo);
        NuevoSistemaPago nuevoSistemaPago = new NuevoSistemaPago("Samuel", "12345", "samuel@gmail.com");
    
        adapter.crearSesion(nuevoSistemaPago);
        adapter.validarCorreo(nuevoSistemaPago);
        adapter.ValidarAutorizacion();
        adapter.realizarPago();
    }
}
