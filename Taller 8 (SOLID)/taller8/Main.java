package taller8;

public class Main {
    public static void main(String[] args) {
        IServicioEmail gmail = new EmailGmailImpl();
        IServicioEmail yahoo = new EmailYahooImpl();
        IServicioEmail outlook = new EmailOutlookImpl();

        Email emailGmail = new EmailGmail("Gmail", "Hola", "Buenos Dias", "File");
        Sistema sistema = new Sistema(gmail);
        sistema.enviarEmail(emailGmail);

        Email emailYahoo = new EmailYahoo("YAHOO", "Hola", "Buenas Tardes", "Zip");
        sistema = new Sistema(yahoo);
        sistema.enviarEmail(emailYahoo);

        Email emailOutlook = new EmailOutlook("OUTLOOK", "Hola", "Buenas Noches");
        sistema = new Sistema(outlook);
        sistema.enviarEmail(emailOutlook);
    }
}