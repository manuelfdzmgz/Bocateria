import java.util.ArrayList;
import java.util.Iterator;
/**
 * Simula la clase usuario que ingiere objetos de la clase alimento
 * 
 * @author (Manuel Fernández) 
 * @version 10/03/2015)
 */
public class Usuario
{
    //El valor del nombre del usuario
    private String nombre;
    //El numero de calorias ingeridas por el usuario
    private float caloriasUsuario;
    //ArrayList de elementos alimento 
    private ArrayList<Alimento> alimentos;
    //alimento mas calorico hasta el momento consumido
    private String alimentoMasCalorico;
    

    /**
     * Constructor for objects of class Usuario
     */
    public Usuario(String nombre)
    {
        this.nombre = nombre;        
        caloriasUsuario=0;
        alimentos = new ArrayList<Alimento>();
    }

    /**
     * Metodo que simula como un usuario come un alimento y muestra por el terminal los datos del 
     * alimento y la cantidad consumidos proteinas carbohidratos calorias asi como el nombre del usuario
     * y del alimento ingerido.
     * 
     * @param  alimento un objeto de la clase alimento
     * @param cantidad cantidad en gramos de alimento
     */
    public  void comer(Alimento alimento, int cantidad)
    {

        System.out.println("Nombre:" + nombre);
        System.out.println("Nombre del alimento:" + alimento.getNombre());
        System.out.println("Gramos en proteinas ingeridos:" + (alimento.getProteinas()*cantidad) + "(" +  (alimento.getCalorias()*cantidad)*(alimento.getTotalMacronutrientes()/100) + ")");
        System.out.println("Gramos de carbohidratos ingeridos:" + (alimento.getCarbohidratos()*cantidad) + "(" + (alimento.getCalorias()*cantidad)*(alimento.getTotalMacronutrientes()/100) + ")");
        System.out.println("Gramos de grasas ingeridos:" + (alimento.getGrasas()*cantidad) + "(" +  (alimento.getCalorias()*cantidad)*(alimento.getTotalMacronutrientes()/100) + ")");
        System.out.println("Calorias ingeridas:" + (alimento.getCalorias()*cantidad));
        alimentos.add(alimento);
    }

    /**
     * Metodo getter que retorna el valor del  nombre del usuario
     * @return devuelve el nombre del usuario 
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Metodo getter que retorna el valor de las calorias ingeridas por el usuario
     * 
     * @return devuelve el valor de las calorias ingeridas por el usuario
     */
    public float getCaloriasUsuario()
    {
        return caloriasUsuario;
    }

    /**
     * Compara quien de dos usuarios ha consumido mas calorias
     */
    public void comparar(Usuario usuario1, Usuario usuario2)
    {
        if (usuario1.getCaloriasUsuario()>usuario2.getCaloriasUsuario())
        {
            System.out.println(usuario1.getNombre() + " ha comido mas que " + usuario2.getNombre());
        }
        else
        {
            System.out.println(usuario2.getNombre() + " ha comido mas que " + usuario1.getNombre());
        }
    }

    /**
     * Muestra por pantalla el alimento mas calorico consumido por el usuario hasta el momento
     */
    public void alimentoMasCalorico()
    {
        float masCalorico=0;
        String nombre = "No has comido nada";
        for (Alimento alimento: alimentos)
        {
            if(alimento.getCalorias() > masCalorico)
            {
                masCalorico = alimento.getCalorias();
                nombre = alimento.getNombre();
            }
        }
        System.out.println("El alimento mas calorico consumido hasta entonces es : " + nombre);
    }

    /**
     * Pide por parametro la posicion en la que quieres saber los datos nutricionales de un alimento ingerido
     * 
     */
    public void datoNutricional(int posicion)
    {
        Alimento comida = alimentos.get(posicion);
        if (posicion>alimentos.size())
        {
            System.out.println("No existe ningun alimento en esa posicion");
        }
        else
        {
            System.out.println("Nombre:" + nombre);
            System.out.println("Nombre del alimento:" + comida.getNombre());
            System.out.println("Gramos en proteinas ingeridos:" + (comida.getProteinas()) + "(" +  (comida.getCalorias())*(comida.getTotalMacronutrientes()/100) + ")");
            System.out.println("Gramos de carbohidratos ingeridos:" + (comida.getCarbohidratos()) + "(" + (comida.getCalorias())*(comida.getTotalMacronutrientes()/100) + ")");
            System.out.println("Gramos de grasas ingeridos:" + (comida.getGrasas()) + "(" +  (comida.getCalorias())*(comida.getTotalMacronutrientes()/100) + ")");
            System.out.println("Calorias ingeridas:" + (comida.getCalorias()));
        }

    }
}
