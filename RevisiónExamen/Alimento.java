public class Alimento {

    //Almacenamos el nombre del alimento
    private String nombre;
    //Almacenamos los gramos de proteinas por cada 100 gramos de alimento
    private float proteinas;
    //Almacenamos los gramos de carbohidratos por cada 100 gramos de alimento
    private float carbohidratos;
    //Almacenamos los gramos de grasa por cada 100 gramos de alimento
    private float grasas;
    
    /**
      * Constructor de la clase Alimento
      */
    public Alimento(String nombre,float proteinas,float carbohidratos,float grasas)
    {
        this.nombre = nombre;
        this.proteinas = proteinas;
        this.carbohidratos = carbohidratos;
        this.grasas = grasas;
    }
    
    /**
      * Metodo que muestra los datos de un alimento por pantalla
      * incluyendo sus calorias y su macronutriente mayoritario
      */
    public void muestraDatos() 
    {
        System.out.println("Nombre: " + nombre);    
        System.out.println("Proteinas: " + proteinas);
        System.out.println("Carbohidratos: " + carbohidratos);
        System.out.println("Grasas: " + grasas);
        System.out.println("Calorias: " + getCalorias());
        
    }
    
    /**
      * Método que devuelve las calorias que tiene un alimento
      * por cada 100 gramos
      */
    public float getCalorias()
    {
        return  (proteinas * 4) + (grasas * 9) + (carbohidratos * 4);       
    }
    
    
    /**
      * Metodo que devuelve el macronutriente mayoritario en
      * formato String
      */
    public String getComponenteMayoritario()
    {
        String mayoritario = "Proteinas, Carbohidratos y Grasas";
        
        if (proteinas > carbohidratos && proteinas > grasas){
            mayoritario = "Proteinas.";
        }
        else if (carbohidratos > proteinas && carbohidratos > grasas){
             mayoritario = "Carbohidratos";  
        }
        else if (grasas > proteinas && grasas > carbohidratos){
             mayoritario = "Grasas";  
        }
        else if (grasas == proteinas && grasas > carbohidratos){
             mayoritario = "Proteina y grasa";  
        }
        else if (carbohidratos == proteinas && grasas < carbohidratos){
             mayoritario = "Proteina y carbohidratos";  
        }
        else if (carbohidratos == grasas && grasas > proteinas){
             mayoritario = "Carbohidratos y Grasa";  
        }
        
        return mayoritario;
    }
     
    public float getProteinas()
    {
        return proteinas;
    }
    
    public float getCarbohidratos()
    {
        return carbohidratos;
    }
    
    public float getGrasas()
    {
        return grasas;
    }
    public String getNombre()
    {
        return nombre;
    }

}









    
