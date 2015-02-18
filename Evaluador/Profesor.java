
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Profesor
{
    private ArrayList<Evaluador> evaluadores;
    private ArrayList<String> propuestas;

    public Profesor()
    {
        evaluadores = new ArrayList<>();
        propuestas = new ArrayList<>();
    }

    public void registrarEvaluador(String nombre)
    {
        Evaluador nuevoEvaluador = new Evaluador(nombre);   
        evaluadores.add(nuevoEvaluador);
    }

    public void registrarPropuesta(String nombre)
    {
        propuestas.add(nombre);
    }

    public void repartir()
    {
        int cantidadEvaluadores = evaluadores.size();
        int cantidadPropuestas = propuestas.size();
        int minimoPropuestas = 3;

        int contador = 0;

        //Collections.shuffle(propuestas);
        while (contador < (minimoPropuestas * cantidadEvaluadores)) {
            if (contador < cantidadPropuestas) {
                // Si estamos considerando una propuesta aun
                // sin asignar se la asignamos al evaluador que toque           
                Evaluador persona = evaluadores.get(contador % cantidadEvaluadores);
                String propuesta = propuestas.get(contador);
                persona.asignarPropuesta(propuesta);
            }
            else {
                // Ya no hay propuestas sin asignar, por lo que
                // elegimos una al azar y se la damos al evaluador que toque
                Random aleatorio = new Random();
                int indicePropuestaAleatoria = aleatorio.nextInt(cantidadPropuestas);
                String propuesta = propuestas.get(indicePropuestaAleatoria);
                Evaluador persona = evaluadores.get(contador % cantidadEvaluadores);
                persona.asignarPropuesta(propuesta);        
            }       

            contador++;
        }

        // Si aun quedan propuestas sin asignar entonces las recorremos
        // todas y las asignamos a los evaluadores segun vaya tocando

        while (contador < cantidadPropuestas) {
            String propuesta = propuestas.get(contador);
            Evaluador persona = evaluadores.get(contador % cantidadEvaluadores);
            persona.asignarPropuesta(propuesta);
            contador++;

        }
    }

    public void mostrarReparto()
    {
        for (Evaluador evaluador : evaluadores)
        {
            evaluador.mostrarPropuestas();

        }
    }

    public void emparejar()
    {
        int cantidadEvaluadores = evaluadores.size();
        int cantidadPropuestas = propuestas.size();
        int contador = 0;
        int indicePropuesta=0;
        int indiceEvaluador=0;
        Collections.shuffle(propuestas);
        if (cantidadPropuestas%2==0)
        {
            while(contador<cantidadPropuestas)
            {
                System.out.println(propuestas.get(indicePropuesta) + "y");
                indicePropuesta++;
                System.out.println(propuestas.get(indicePropuesta));
                contador=contador+2;
            }
        }
        else
        {

            System.out.println("El numero de propuestas es impar");
        }

    }

    public void emparejarDeDosEnDos()
    {
        if (propuestas.size() % 2 == 0 ) {
			// Numero de propuestas es par
			ArrayList<String> copia = new ArrayList<String>();
			copia = (ArrayList)propuestas.clone();
			Random rnd = new Random();
			String propuesta1;
			String propuesta2;
			while (copia.size() > 0)
			{	
				propuesta1 = copia.remove(rnd.nextInt(copia.size()));
				propuesta2 = copia.remove(rnd.nextInt(copia.size()));
				System.out.println("Emparejamiento: " + propuesta1 + " y " + propuesta2);
			}
		}

            
        
        else {
            // Numero de propuestas es impar
            System.out.println("El numero de propuestas es impar");
        }
        
    }
}

