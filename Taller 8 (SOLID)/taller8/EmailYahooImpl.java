package taller8;

public class EmailYahooImpl implements IServicioEmail{

    @Override
    public void enviarEmail(Email email) {
        EmailYahoo yahoo = (EmailYahoo) email;
        System.out.println(yahoo.getTo());
        System.out.println(yahoo.getBody());
        System.out.println(yahoo.getSubject());
        System.err.println("ENVIANDO CORREO POR YAHOO");
    }
    
}
