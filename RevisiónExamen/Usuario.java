import java.util.ArrayList;
public class Usuario
{
    //Almacena el nombre del usuario
    private String nombre;
    //Almacena la cantidad de grasas ingeridas en gramos
    private float grasas;
    //Almnacena la cantidad de carbohidratos ingeridos en gramos
    private float carbohidratos;
    //Almacena la cantidad de proteinas ingeridas en gramos
    private float proteinas;
    //Almacena la cantidad de calorias ingeridas
    private float calorias;
    //Almacena el numero de calorias que tiene el alimento mas calorico hasta el momento
    private float caloriasAlimentoMasCalorico;
    //Almacena el alimento con mas calorias ingerido hasta el momento
    private Alimento alimentoMasCalorico;
    //Almacena todos los alimentos comidos hasta el momento 
    private ArrayList<Alimento> alimentosComidos;

    /**
     * Constructor de la clase Usuario
     */
    public Usuario(String nombre)
    {
        this.nombre=nombre;
        proteinas = 0;
        carbohidratos = 0;
        grasas = 0;
        calorias = 0;
        alimentoMasCalorico = null;
        alimentosComidos = new ArrayList<Alimento>();
    }

    /**
     * Registra la ingesta de una cierta cantidad de alimento
     */
    public void comer(Alimento alimento,float cantidad)
    {
        proteinas += (alimento.getProteinas() * (cantidad / 100));
        carbohidratos += (alimento.getCarbohidratos() * (cantidad / 100));
        grasas += (alimento.getGrasas()* (cantidad / 100));
        calorias += alimento.getCalorias() * (cantidad / 100);
        alimentosComidos.add(alimento);
        // Actualizamos el alimento mas calorico ingerido hasta el
        // momento si procede
        if(alimentoMasCalorico == null)
        {
            alimentoMasCalorico = alimento;
        }
        if (alimento.getCalorias() > alimentoMasCalorico.getCalorias())
        {
            alimentoMasCalorico = alimento;
        }
    }

    /**
     * Muestra el estado actual del usuario: nombre y proteinas, carbohidratos
     * grasas y calorias ingeridas.
     */
    public void muestraDatos()
    {
        String porcentajeProteinas = "";
        float sumaMacros = proteinas + carbohidratos + grasas;
        if(proteinas != 0)
        {
            porcentajeProteinas = "(" + (proteinas * 100 / (proteinas + carbohidratos + grasas)) + ")";
        }

        String porcentajeCarbohidratos = "";
        if (carbohidratos!=0)
        {   
            porcentajeCarbohidratos= "(" + ((carbohidratos*100)/(proteinas + carbohidratos + grasas)) + ")";
        }

        String porcentajeGrasa = "";
        if (grasas != 0)
        {
            porcentajeGrasa = "(" + (grasas * 100 / (proteinas + carbohidratos + grasas)) +")";
        }

        System.out.println("Nombre: " + nombre);
        System.out.println("Proteinas: " + proteinas + " " + porcentajeProteinas);
        System.out.println("Carbohidratos: " + carbohidratos + " " + porcentajeCarbohidratos);
        System.out.println("Grasas: " + grasas + " " + porcentajeGrasa);
        System.out.println("Calorias ingeridas: " + calorias );
    }

    /**
     * Compara las calorias ingeridas de este usuario con
     * las de otro usuario y muestra por pantalla el resultado de dicha
     * comparacion
     */
    public void comparaCon (Usuario otroUsuario)
    {
        float caloriasOtroUusario = otroUsuario.getCalorias();   
        if (caloriasOtroUusario > calorias)
        {
            System.out.println(otroUsuario.getNombre() + "ha consumido mas calorias que " + nombre);
        }
        else if(caloriasOtroUusario  < calorias)
        {
            System.out.println(nombre + "ha consumido mas calorias que " + otroUsuario.getNombre());
        }
        else
        {
            System.out.println(otroUsuario.getNombre() +" y " + nombre + " han consumido las mismas calorias");
        }
    }

    /**
     *Metodo que devuelve la cantidad de calorias ingeridas por el usuario
     */
    public float getCalorias()
    {
        return calorias;
    }

    /**
     * Devuelve el nombre del usuario
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Imprime el alimento mas calorico tomado hasta el momento
     */
    public void printAlimentoMasCalorico()
    {
        if (alimentoMasCalorico!=null)
         {
             System.out.println(alimentoMasCalorico.getNombre());
         }
         else
         {
             System.out.println("El usuario no ha comido nada todavía");
         }
    }
    /**
     * Imprime todos los datos del alimento comido por el usuario en la posicion indicada por el parametro:si el usuario indica el 1 se refiere al primer alimento comido el 2 el segundo etc
     */
    public void alimentoListados(int posicion)
    {
        int indice = posicion - 1;
        if((0<=indice) && (indice< alimentosComidos.size()))
        {
            alimentosComidos.get(posicion - 1).muestraDatos();
        }
    }
}


