import java.util.HashMap;
import java.util.ArrayList;
/**
 * Write a description of class Bocateria here.
 * 
 * @author (Manuel Fernandez Miguelez) 
 * @version (13/03/2015)
 */
public class Bocateria
{
    // instance variables - replace the example below with your own
    private Cliente primeraPersonaEnCola;
    private int facturacionActual;
    private HashMap<Integer,Cliente> clientes;
    private static final int PRECIO_BOCADILLO = 5; 

    /**
     * Constructor for objects of class Bocateria
     */
    public Bocateria()
    {
        HashMap <Integer,Cliente> clientes= new HashMap<Integer,Cliente>();
    }

    public void llegaNuevoClienteAlaCola(int numeroDeBocadillos,Cliente cliente)
    {
        ArrayList<Cliente> clientes= new ArrayList<Cliente>();
        clientes.add(cliente);
    }
}
