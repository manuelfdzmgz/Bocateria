
/**
 * Representa un cliente de correo electrónico
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MailClient
{
    //Hace referencia al servidor asociado al cliente
    private MailServer server;
    //Almacena la direccion de correo del usuario que usa el cliente
    private String user;
    //Almacena el ultimo email recibido
    private MailItem lastMail;
    private int numberSentEmails;
    private int numberCharsLongestEmail;
    private String addressLongestEmail;

    /**
     * Constructor de la clase MailClient
     */
    public MailClient(MailServer newServer, String myUser)
    {
        server = newServer;
        user = myUser;
        lastMail = null;
        numberSentEmails = 0;
        numberCharsLongestEmail = 0;
        addressLongestEmail = null;
    }

    /**
     * Obtiene del servidor el siguiente correo del usuario
     * y lo devuelve. En caso de no haber correo devuelve null.
     */
    public MailItem getNextMailItem()
    {        
        MailItem email = server.getNextMailItem(user);
        if (email != null)
        {
            
            if (isSpam(email))
            {
                // Cosas que hacer si es spam
                email = null;
            }
            else
            {
                // Cosas que hacer si no es spam
                lastMail = email;              
            }

        }

        return email;
    }

    /**
     * Obtiene del servidor el siguiente correo del usuario
     * y lo imprime por pantalla. Si no había correos en el
     * servidor informa por pantalla de ello.
     */
    public void printNextMailItem()
    {
        MailItem email = server.getNextMailItem(user);
        if (email == null) 
        {
            System.out.println("No había mensajes en el servidor");
        }
        else 
        {

            if (isSpam(email))
            {
                // Cosas que hacer si es spam
                System.out.println("Se ha recibido un email de spam");
            }
            else
            {
                // Cosas que hacer si no es spam
                email.print();
                lastMail = email;    
                int numberOfChars = email.getMessage();
                int numberOfChars = message.length();
                if (numberCharsLongestEmail< numberOfChars)
                {
                    //el mensaje recibido es mas largo que el que teniamos almacenado
                    numberCharsLongestEmail =numberOfChars;
                }
            }

        }
    }
    /**
     * Envia un correo a la direccion indicada con el contenido
     * pasado por parametro
     */
    public void sendMailItem(String address, String message)
    {
        MailItem emailToSend = new MailItem(user, address, message);
        server.post(emailToSend);
        numberSentEmails= numberSentEmails +1;
    }

    /**
     * Metodo que imprime por pantalla los mensajes que tiene
     * el usuario que esta utilizando el cliente
     */
    public void sloopMail()
    {
        System.out.println("Numero de emails en el servidor: " + 
            server.howManyMailItems(user));
    }

    /**
     * Metodo que descarga un email y lo responde automaticamente
     * con un mensaje predefinido
     */
    public void getNextMailWithAutorespond()
    {
        MailItem email = server.getNextMailItem(user);
        if (email != null)
        {
            String newTo = email.getFrom();
            String newMessage = "Estoy de vacaciones.\n" + email.getMessage();
            MailItem autorespond = new MailItem(user, newTo, newMessage);
            server.post(autorespond);            
        }
    }

    /**
     * Imprime por pantalla el último mensaje recibido
     */
    public void printLastMail()
    {
        if (lastMail != null)
        {
            lastMail.print();
        }
        else
        {
            System.out.println("No se ha recibo aun ningún mensaje");
        }
    }

    /**
     * Analiza un email dado y devuelve si es spam o no
     */
    private boolean isSpam(MailItem email)
    {
        boolean isEmailWithSpam = false;
        String message = email.getMessage();
        if(message.contains("oferta")||message.contains("viagra") && !message.contains("proyect"))
        {
            //es spam
            isEmailWithSpam = true;
        }
        return isEmailWithSpam;
    }
    public void showStats()
    {
        System.out.println("numero de emails recibidos" + numberSentEmails);
    }

}
