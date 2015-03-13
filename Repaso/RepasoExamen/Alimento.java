
/**
 * Simula la clase alimento que son los objetos comida que ingiere el usuario
 * 
 * @author (Manuel Fernández Miguélez) 
 * @version (09/03/2015)
 */
public class Alimento
{
    private String nombre;
    private float proteinas;
    private float carbohidratos;
    private float grasas;

    /**
     * Constructor con parametros de la clase alimento
     * @param nombre el nombre del alimento
     * @param proteinas el numero de proteinas por cada 100 gramos que contiene el alimento
     * @param carbohidratos el numero de carbohidratos que contiene el alimento por cada 100 gramos
     * @param grasas el numero de grasas por cada 100 gramos de alimento
     */
    public Alimento(String nombre,float proteinas, float carbohidratos,float grasas)
    {
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
    }

    /**
     * Muestra por pantalla el nombre del alimento la cantidad de proteinas
     * carbohidratos y grasas por cada 100 gramos y la cantidad de calorias 
     * asi como el componente mayoritario.
     * 
     */
    public void muestraDatos()
    {
        String componenteMayoritario;
        componenteMayoritario= " ";
        if (proteinas>= carbohidratos && carbohidratos>= proteinas)
        {
            if( proteinas> carbohidratos)
            {
                if(proteinas> grasas)
                {
                    componenteMayoritario = "proteinas";
                }
            }

            else if (proteinas == carbohidratos)
            {
                componenteMayoritario = " proteinas y carbohidratos";
                if (proteinas == grasas)
                {
                    componenteMayoritario = " proteinas, grasas, carbohidratos";
                }
            }
            if (carbohidratos >= proteinas)   
            {
                if( carbohidratos >proteinas)
                {
                    if (carbohidratos > grasas)
                    {
                        componenteMayoritario = "carbohidratos";
                    }  
                }
                else if (carbohidratos == proteinas)
                {
                    componenteMayoritario = " proteinas y carbohidratos";
                    if (carbohidratos == grasas)
                    {
                        componenteMayoritario = " proteinas, grasas, carbohidratos";
                    }
                }
            }
                    }

        else
        {
            if (grasas >= proteinas)
            {
                if( grasas >proteinas)
                {
                    if (grasas > carbohidratos)
                    {
                        componenteMayoritario = "grasas";
                    }  
                }
                else if (grasas == proteinas)
                {
                    componenteMayoritario = " grasas y proteinas";
                    if (grasas == carbohidratos)
                    {
                        componenteMayoritario = " proteinas, grasas, carbohidratos";
                    }
                }
            }
            if (grasas>= carbohidratos)
            {
                if (grasas> carbohidratos)
                {
                    if(grasas> proteinas)
                    {
                        componenteMayoritario = " grasas";
                    }
                }
                else if (grasas == carbohidratos)
                {
                    componenteMayoritario = "grasas y carbohidratos";
                    if (grasas== proteinas)
                    {
                        componenteMayoritario = "proteinas, grasas, carbohidratos";
                    }
                }

            }
        }

        System.out.println("Nombre:" + " " + nombre);
        System.out.println("Proteinas por cada 100 gramos:" + " " + proteinas);
        System.out.println("Carbohidratos por cada 100 gramos:" + " " + carbohidratos);
        System.out.println("Grasas por cada 100 gamos:" + " " + grasas);
        System.out.println("Calorias:" + " " +( (proteinas*4)+ (grasas*9)));
        System.out.println("Componente/s mayoritario/s:" + componenteMayoritario );
    }

    /**
     * Metodo getter que devuelve el nombre de el objeto alimento
     * @return devuelve el nombre del alimento
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * Método getter que devuelve las proteinas
     * @return devuelve el numero float de proteinas
     */
    public float getProteinas()
    {
        return proteinas;
    }

    /**
     * Método getter que devuelve los carbohidratos
     * @return devuelve el numero float de  carbohidratos
     */
    public float getCarbohidratos()
    {
        return carbohidratos;
    }

    /**
     * Método getter que devuelve las grasas
     * @return devuelve el numero float de grasas
     */
    public float getGrasas()
    {
        return grasas;
    }

    /**
     * Método getter que devuelve las calorias
     * @return devuelve el numero float de calorias
     */
    public float getCalorias()
    {
        return ( (proteinas*4)+ (grasas*9) + (carbohidratos*4));
    }

    /**
     * Método getter que devuelve el total de macronutrientes
     * @return devuelve el numero float de  total de macronutrientes
     */
    public float getTotalMacronutrientes()
    {
        return proteinas+grasas+carbohidratos;
    }
}
