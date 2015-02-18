
/**
 * La clase Cubata simula las copas que bebe una persona en un bar
 */
public class Cubata
{
    private String nombre;
    private  float cantidadAlcohol;
    private float precioCopa;
    public Cubata(String nombre, float cantidadAlcohol, float precioCopa)
    {
        this.nombre= nombre;
        this.cantidadAlcohol= cantidadAlcohol;  
        this.precioCopa=precioCopa;
    }
    public String getNombre()
    {
        return  nombre;
    }
    public float getCantidadDeAlcohol()
    {
        return cantidadAlcohol;
    }
    public float getPrecioCopa()
    {
        return precioCopa;
    }
    public void imprimirFactura()
    {
        System.out.println("####"+"La copa que usted ha pedido es "+ " " + nombre);
        System.out.println("####"+"La cantidad de alcohol que tiene su copa es" +" "+ cantidadAlcohol);
        System.out.println("####"+"El precio de la copa pedido es " +" "+ precioCopa);
    } 
}
