
public class ArrayListInt
{
    //Array utilizado para simular un ArrayList de ints.
    private int[] lista;

    /**
     * Constructor para crear un array tradicional vacio
     */
    public ArrayListInt()
    {   
        lista = new int[0];
    }

    /**
     * Añade un elemento al array.
     * @param elemento el numero a añadir al array.
     */
    public void add(int elemento)
    {
        int[] arrayNuevo = new int[lista.length + 1];
        for (int i=0; i < lista.length; i++)
        {
            arrayNuevo[i] = lista[i];
        } 
        arrayNuevo[arrayNuevo.length-1]= elemento;
        lista = arrayNuevo;
    }

    /**
     * Metodo que añade un elemento a la array en la posición indicada.
     * @param index La posición donde añadir el elemento
     * @param elemento El elemento a añadir
     */
    public void add(int index, int elemento)
    {
        if(lista.length > index && index >= 0)
        {
            int[] arrayNuevo = new int[lista.length + 1];
            for(int i =0;i < index; i++)
            {
                arrayNuevo[i] = lista[i];
            }
            arrayNuevo[index] = elemento;
            for (int i=index+1; i < arrayNuevo.length; i++)
            {
                arrayNuevo[i] = lista[i - 1];
            }
            lista = arrayNuevo;
        } 
    }

    /** 
    - `isEmpty()`: devuelve `true` si la lista no contiene elementos.
    - `remove(int index)`: elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. Si el valor de `index` no es válido, no hace nada y devuelve -1.
    - `size()`: devuelve el núm
     **/

    /**
     * Método que vacía la colección
     */
    public void clear() 
    {
        lista = new int[0];
    }   

    /**
     * Comprueba si un elemento está incluido en el ArrayList
     * @param elemento el elemento a buscar
     * @return true en caso de que el elemento este presente, 
     *     false en otro caso
     */
    public boolean contains(int elemento)
    {
        boolean exist = false;
        int index = 0;
        while(index < lista.length && !exist)
        {
            if(lista[index] == elemento)
            {
                exist = true;
            }
            index++;
        }
        return exist;
    }

    /**
     * Devuelve el elemento existente en la posición indicada.
     * @param index el indice del elemento a devolver 
     * @return el valor del elemento o si el valor de `index` no es válido, 
     * entonces -1.
     */
    public int get(int index)
    {
        int valorDevuelto = -1;
        if(index >= 0 && index < lista.length)
        {
            valorDevuelto = lista[index];           
        }   
        return valorDevuelto;
    }

    /**
     * Reemplaza el elemento en la posición `index` con el valor de `elemento`. 
     * Si el índice no es válido, no hace nada.
     * @param indice la posicion a cambiar
     * @param elemento el valor del elemento a fijar
     */
    public void set(int index, int elemento)
    {
        if (index >publi= 0 && index < lista.length)
        {
            lista[index] = elemento;
        }

    }

    /**
     * Devuelve el indice en el que aparece la primera ocurrencia del elemento 
     * especificado o -1 en caso de que la colección no contenga el elemento 
     * especificado.
     * @param elemento  el elemento a buscar 
     * @return el index del elemento buscado
     * si no existe el elemento en la coleccion devuelve -1
     * 
     */
    public int indexOf(int elemento)
    {
        int toReturn = -1;
        int cont = 0;
        boolean existe = false;
        while (cont < lista.length && !existe)
        {
            if (lista[cont] == elemento) 
            {
                toReturn = cont;
                existe = true;
            }
            cont++;
        }
        return toReturn;
    }

    /**
     * Comprueba si el ArrayList esta vacio 
     * @return true en caso de que este vacio, false en otro caso
     */
    public boolean isEmpty()
    {
        return (lista.length == 0);
    }
}






