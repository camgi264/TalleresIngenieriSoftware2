package SOLID;

public class Main {
    public static void main(String[] args) {
        IServicioEmail gmail = new EmailGmailImpl();
        IServicioEmail yahoo = new EmailYahooImpl();
        IServicioEmail outlook = new EmailOutlookImpl();

        Email emailGmail = new EmailGmail("Gmail", "Hola", "Tarea de matematicas", "File");
        Sistema sistema = new Sistema(gmail);
        sistema.enviarEmail(emailGmail);

        Email emailYahoo = new EmailYahoo("YAHOO", "Hola", "Tarea de inglés", "Zip");
        sistema = new Sistema(yahoo);
        sistema.enviarEmail(emailYahoo);

        Email emailOutlook = new EmailOutlook("OUTLOOK", "Hola", "Tarea de Backend");
        sistema = new Sistema(outlook);
        sistema.enviarEmail(emailOutlook);
    }

    
}
