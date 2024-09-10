package taller8;

public class Sistema {
    private IServicioEmail servicioEmail;

    public Sistema(IServicioEmail servicioEmail) {
        this.servicioEmail = servicioEmail;
    }

    public void enviarEmail(Email email) {
        this.servicioEmail.enviarEmail(email);
    }
}