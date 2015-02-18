/**
 * Clase que simula a una persona que pide copas en un bar
 */
public class Bebedor
{   //atributo de la clase Bebedor que almacena el alcohol en Sangre que tien el Bebedor
    private float alcoholEnSangre;
    //Atributo de la clase Bebedor que almacena el nombre del bebedor
    private String nombreBebedor;
    //Atributo de la clase Bebedor que almacena el nivel maximo de alcohol en sangre
    private float nivelMaximoAlcohol;
    //Constructor de la clase Bebedor
    private float dinero;
    public Bebedor(String nombreBebedor, float nivelMaximoAlcohol, float dinero)
    {
        alcoholEnSangre=0;
        this.nombreBebedor=nombreBebedor;
        this.nivelMaximoAlcohol= nivelMaximoAlcohol;
        this.dinero=dinero;
    }

    /*
     * Se retorna el valor maximo que puede alvergar en el cuerpo el bebedor
     */
    public float getMaxAlcohol()
    { 
        return nivelMaximoAlcohol;
    }

    /**
     * Le damos al bebedor una copa para que se la beba
     */
    public void beberCopa(Cubata copa)
    {
        if(alcoholEnSangre>= nivelMaximoAlcohol)
        {   alcoholEnSangre = alcoholEnSangre + copa.getCantidadDeAlcohol();
            if(beberCopa=true)
            {
                System.out.println("Me estoy empezando a poner tonto");
            }
            else
            {
                System.out.println("no quiero mas copas");
            }
        }
        else
        {
            //Acepta la copa
            alcoholEnSangre = alcoholEnSangre + copa.getCantidadDeAlcohol();
        } 
    }
    /**
     * Este metodo simula la accion de un bebedor que pide la factura al camarero
     */
    public void pedirFactura(Cubata copa)
    {   
        float precioCopa= copa.getPrecioCopa();
        if (precioCopa<dinero)
        {
            if(precioCopa<50%dinero)
            {
               System.out.println("Invito a la utltima ronda chabales");
            }
        }
        else
        {
            System.out.println("No me queda dinero joder tendre que ir a casa a que me de dinero la parienta no te puedo pagar la copa señor camarero");
        }
    }
}
