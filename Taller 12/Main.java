interface ICanalNotificacion {
    void enviarCorreo(Notificacion notificacion);
}

class Notificacion {
    private String asunto;
    private String cuerpo;

    public Notificacion(String asunto, String cuerpo) {
        this.asunto = asunto;
        this.cuerpo = cuerpo;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getCuerpo() {
        return cuerpo;
    }
}


class Usuario {
    private String nombre;
    private String identificacion;

    public Usuario(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}

class GeneradorCorreo {
    private ICanalNotificacion canalNotificacion;

    public GeneradorCorreo(ICanalNotificacion canalNotificacion) {
        this.canalNotificacion = canalNotificacion;
    }

    public void generarCorreo(Usuario usuario) {
        String asunto = "Correo para " + usuario.getNombre();
        String cuerpo = "Nombre: " + usuario.getNombre() + "\nIdentificación: " + usuario.getIdentificacion();
        Notificacion notificacion = new Notificacion(asunto, cuerpo);
        canalNotificacion.enviarCorreo(notificacion);
    }
}



class CanalGmail implements ICanalNotificacion {
    @Override
    public void enviarCorreo(Notificacion notificacion) {
        System.out.println("Enviando correo vía Gmail:");
        System.out.println("Asunto: " + notificacion.getAsunto());
        System.out.println("Cuerpo: " + notificacion.getCuerpo());
    }
}


class CanalOutlook implements ICanalNotificacion {
    @Override
    public void enviarCorreo(Notificacion notificacion) {
        System.out.println("Enviando correo vía Outlook:");
        System.out.println("Asunto: " + notificacion.getAsunto());
        System.out.println("Cuerpo: " + notificacion.getCuerpo());
    }
}

public class Main {
    public static void main(String[] args) {

        Usuario usuarioGmail = new Usuario("Samuel", "12345");
        Usuario usuarioOutlook = new Usuario("Carlos", "67890");

        ICanalNotificacion servicioGmail = new CanalGmail();
        GeneradorCorreo generarGmail = new GeneradorCorreo(servicioGmail);
        generarGmail.generarCorreo(usuarioGmail);
    


        ICanalNotificacion servicioOutlook = new CanalOutlook();
        GeneradorCorreo generarOutlook = new GeneradorCorreo(servicioOutlook);
        generarOutlook.generarCorreo(usuarioOutlook);
    }
}
