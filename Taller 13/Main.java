interface ICanalNotificacion{
    void enviarNotificacion(Notificacion notificaion);
    
}

class Notificacion{
    private String titulo;
    private String cuerpo;

    public Notificacion(String titulo, String cuerpo) {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCuerpo() {
        return cuerpo;
    }
    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }
}

class Notificador{
    private ICanalNotificacion canal;
    public Notificador(ICanalNotificacion canal){
        this.canal = canal;
    }
    public void setCanal(ICanalNotificacion nuevoCanal) {
        this.canal = nuevoCanal;
    }
    public void enviarNotificacion(Notificacion notificaion){
        canal.enviarNotificacion(notificaion);
    }

}

class CanalCorreoElectronico implements ICanalNotificacion{

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("Correo Enviado: " + notificacion.getTitulo() + " - " + notificacion.getCuerpo());
    
    }
}

class CanalSMS implements ICanalNotificacion{

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("SMS Enviado: " + notificacion.getTitulo() + " - " + notificacion.getCuerpo());
        
    }
}

class CanalWhatsApp implements ICanalNotificacion{

    @Override
    public void enviarNotificacion(Notificacion notificacion) {
        System.out.println("WhatsApp Enviado: " + notificacion.getTitulo() + " - " + notificacion.getCuerpo());
        
    }

}
public class Main{
    
    public static void main(String[] args) {
        ICanalNotificacion canalcorreo = new CanalCorreoElectronico();
        ICanalNotificacion canalsms = new CanalSMS();
        ICanalNotificacion canalwhatsapp = new CanalWhatsApp();

        Notificador notificador = new Notificador(canalcorreo);

        Notificacion notificacion = new Notificacion("nueva notificaion", "Buenas tardes");

        notificador.enviarNotificacion(notificacion);
        

        // Cambiar el canal a SMS y enviar la notificación
        notificador.setCanal(canalsms);
        notificador.enviarNotificacion(notificacion);

        // Cambiar el canal a WhatsApp y enviar la notificación
        notificador.setCanal(canalwhatsapp);
        notificador.enviarNotificacion(notificacion);
        
    }
}


