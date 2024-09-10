package taller8;

public class EmailGmailImpl implements IServicioEmail{

    @Override
    public void enviarEmail(Email email) {
        EmailGmail gmail = (EmailGmail) email;
        System.out.println(gmail.getTo());
        System.out.println(gmail.getBody());
        System.out.println(gmail.getSubject());
        System.out.println(gmail.getImg());
        System.err.println("ENVIANDO CORREO POR GMAIL");
    }
    
}