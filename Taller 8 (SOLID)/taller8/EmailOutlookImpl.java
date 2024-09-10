package taller8;

public class EmailOutlookImpl implements IServicioEmail{

    @Override
    public void enviarEmail(Email email) {
        EmailOutlook outlook = (EmailOutlook) email;
        System.out.println(outlook.getTo());
        System.out.println(outlook.getBody());
        System.out.println(outlook.getSubject());
        System.err.println("ENVIANDO CORREO POR OUTLOOK");
    }
    
}
