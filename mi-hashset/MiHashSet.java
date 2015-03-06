import java.util.*;

public class MiHashSet
{

    private  int[] hashSet;   

    public MiHashSet()
    {
    
    }

    public boolean add(int numero)
    { 
        boolean booleano= true;
        int []nuevoArray = new int[hashSet.length +1];
        int contador=0;
        while (contador<hashSet.length && booleano==true)
        {
            if (hashSet[contador] == numero)
            {
                booleano= false;
            }
            nuevoArray[contador]= hashSet[contador];
            contador++;
        }
        
        if( booleano== true)
        {
            nuevoArray[hashSet.length+1]=numero;
            nuevoArray=hashSet;
        }
        return booleano;
    }
    public void clear()
    {
        hashSet = new int[0];
    }
}
