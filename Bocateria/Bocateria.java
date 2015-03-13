import java.util.HashMap;
import java.util.ArrayList;
import java.util.*;
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
    private    ArrayList<Cliente> cliente;
    private int numeroDeBocadillos;
    /**
     * Constructor for objects of class Bocateria
     */
    public Bocateria()
    {
        HashMap <Integer,Cliente> clientes= new HashMap<Integer,Cliente>();

    }

    public void llegaNuevoClienteAlaCola(int numeroDeBocadillos,Cliente clientes)
    {
        ArrayList<Cliente> cliente= new ArrayList<Cliente>();
        cliente.add(clientes);
    }

    public void visualizarDatosClientesEnCola()
    {
        Iterator <Cliente> itr= cliente.iterator();
        while (itr.hasNext())
        {
            System.out.println("Cliente " + itr.next() + " ha comido " +  numeroDeBocadillos + "("+ numeroDeBocadillos *PRECIO_BOCADILLO +")");
        }
    }
}
