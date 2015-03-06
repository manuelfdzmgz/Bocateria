import  java.util. Arrays;
public class Test
{
    public Test()
    {
        System.out.println("[TEST]: Los metodos que no requieren parametros se prueban directamente.");
        System.out.println("[TEST]: Cuando hace falta añadir numeros a la arraylist añadimos los numeros del 1 al 10, incluidos.");
        testSize();
        System.out.println("[TEST]: En el metodo add() comprobamos el sumatorio del 1 al 10.");
        testAdd();
        System.out.println("[TEST]: En el metodo add() con indice comprobamos modificando el numero en la \n\tquinta posición por el numero 20 y el tamaño de la colección.");
        testAddConIndice(5, 20);
        testClear();
        System.out.println("[TEST]: En el metodo contains() comprobamos el valor 5.");
        testContains(5);
        System.out.println("[TEST]: En el metodo get() comprobamos el valor en la posición 1.");
        testGet(1);
        System.out.println("[TEST]: En el metodo set() cambiamos el valor en la posición 0 a 20.");
        testSet(0, 20);
        System.out.println("[TEST]: En el metodo indexOf() comprobamos el valor 1.");
        testIndexOf(1);
        testIsEmpty();
    }

    public int testSize()
    {
        //ArrayListInt array = new ArrayListInt();
        //if (array.size() == 0)
        //{
        //    System.out.println("\tOK. El metodo size() devuelve " + array.size() + ". Deberia devolver 0.");
       // }
        //else
       // {
        //    System.out.println("\tError. El metodo size() devuelve " + array.size() + ". Deberia devolver 0.");
       // }
        return 0;
    }

    public void testAdd()
    {
        ArrayListInt array = new ArrayListInt();
        // Añadimos numeros a la array
        for (int i = 1; i <= 10; i++)
        {
            array.add(i);
        }
        // sumamos el valor de los numeros añadidos
        int sumatorio = 0;
        for (int e = 0; e < 10; e++)
        {
            sumatorio = sumatorio + array.get(e);
        }
        if (sumatorio == 55)
        {
            System.out.println("\tOK. El sumatorio de los numeros da " + sumatorio + ". Deberia dar 55.");
        }
        else
        {
            System.out.println("\tError. El sumatorio de los numeros da " + sumatorio + ". Deberia dar 55.");
        }
    }

    public void testAddConIndice(int posicion, int num)

    {
        ArrayListInt array = new ArrayListInt();
        // Añadimos numeros a la array
        for (int i = 1; i <= 10; i++)
        {
            array.add(i);
        }
        // Ahora añadimos un numero a la posicion 
        array.add(posicion, num);
        int length = array.size();
        if ((array.get(posicion) == num) && (length == 11))
        {
            System.out.println("\tOK. El metodo testAddConIndice() añade en la posicion "+ posicion + " el numero " + array.get(posicion) + ". Deberia añadir " + num 
                                + ".\n El tamaño de la colección es de " + length + ". Deberia ser de 11.");
        }
        else
        {
            System.out.println("\tError.El metodo testAddConIndice() añade en la posicion "+ posicion + " el numero " + array.get(posicion) + ". Deberia añadir " + num
                                + ".\n El tamaño de la colección es de " + length + ". Deberia ser de 11.");
        }
    }

    public void testClear()

    {
        ArrayListInt array = new ArrayListInt();
        // Añadimos numeros a la array
        for (int i = 1; i <= 10; i++)
        {
            array.add(i);
        }
        // Borramos la coleccion y vemos el tamaño que tiene
        array.clear();
        if (array.size() == 0)
        {
            System.out.println("\tOK. El metodo clear() deja una lista con tamaño " + array.size() + ". Deberia ser 0.");
        }
        else
        {
            System.out.println("\tError. El metodo clear() deja una lista con tamaño " + array.size() + ". Deberia ser 0.");
        }
    }

    public void testContains(int num)

    {
        if ((num >= 1) && (num <= 10))
        {
            ArrayListInt array = new ArrayListInt();
            // Añadimos numeros a la array
            for (int i = 1; i <= 10; i++)
            {
                array.add(i);
            }
            // Buscamos el valor 5 en el array y guardamos el resultado
            boolean contiene = array.contains(num);
            if (contiene)
            {
                System.out.println("\tOK. El metodo contains() devuelve " + contiene + ". Deberia devolver true.");
            }
            else
            {
                System.out.println("\tError. El metodo contains() devuelve " + contiene + ". Deberia devolver true.");
            }
        }
        else
        {
            System.out.println("Introduce un numero entre 1 y 10, incluidos.");
        }
    }

    public void testGet(int index)
    {
        ArrayListInt array = new ArrayListInt();
        // Añadimos numeros a la array
        for (int i = 1; i <= 10; i++)
        {
            array.add(i);
        }
        // Tomamos el valor de la posicion del indice
        int num = array.get(index);
        if (num == (index + 1))
        {
            System.out.println("\tOK. El metodo get() devuelve " + num + ". Deberia devolver " + (index + 1) + ".");
        }
        else
        {
            System.out.println("\tError. El metodo get() devuelve " + num + ". Deberia devolver " + (index + 1) + ".");
        }
    }

    public void testSet(int indice, int num)
    {
        if ((indice >= 0) && (indice < 10))
        {
            ArrayListInt array = new ArrayListInt();
            // Añadimos numeros a la array
            for (int i = 1; i <= 10; i++)
            {
                array.add(i);
            }
            // Seteamos el valor de la posicion al numero, comprobamos si el cambio ocurre
            array.set(indice, num);
            if (array.get(indice) == num)
            {
                System.out.println("\tOK. El metodo set() coloca en la posicion " + indice + " el numero " + array.get(indice) + ". Deberia ser el numero " + num + ".");
            }
            else
            {
                System.out.println("\tError. El metodo set() coloca en la posicion " + indice + " el numero " + array.get(indice) + ". Deberia ser el numero " + num + ".");
            }
        }
        else
        {
            System.out.println("Introduce un indice entre 0 y 9, incluidos.");
        }
    }

    public void testIndexOf(int num)
    {
        if ((num > 0) && (num <= 10))
        {
            ArrayListInt array = new ArrayListInt();
            // Añadimos numeros a la array
            for (int i = 1; i <= 10; i++)
            {
                array.add(i);
            }
            // Tomamos la posicion del indicado
            int indice = array.indexOf(num);
            if (indice == (num - 1))
            {
                System.out.println("\tOK. El metodo indexOf() devuelve " + indice + ". Deberia devolver " + (num - 1) + ".");
            }
            else
            {
                System.out.println("\tError. El metodo indexOf() devuelve " + indice + ". Deberia devolver " + (num -1) + ".");
            }
        }
        else
        {
            System.out.println("Introduce un numero entre 1 y 10, incluidos.");
        }
    }

    public void testIsEmpty()

    {
        ArrayListInt array = new ArrayListInt();
        boolean vacia = array.isEmpty();
        if (vacia)
        {
            System.out.println("\tOK. El metodo isEmpty() devuelve " + vacia + ". Deberia devolver true.");
        }
        else
        {
            System.out.println("\tError. El metodo isEmpty() devuelve " + vacia + ". Deberia devolver true.");
        }
    }

    public void testRemove(int indice)

    {
        if (indice >= 0 && indice < 9)
        {
            ArrayListInt array = new ArrayListInt();
            // Añadimos numeros a la array
            for (int i = 1; i <= 10; i++)
            {
                array.add(i);
            }
            // Borramos numero en la posicion introducida
            int num = array.remove(indice);
            if (num == array.get(indice))
            {
                System.out.println("\tError. El metodo remove() no elimina la posicion " + array.get(indice) + ".");
            }
            else
            {
                System.out.println("\tOK. El metodo remove() elimina " + num + ".");
            }
        }
        else
        {
            System.out.println("Introduce un indice entre 0 y 9 incluidos.");
        }
    }
}
