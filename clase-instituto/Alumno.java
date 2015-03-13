import java.util.ArrayList;

public class Alumno
{
	private String nombre;
	private int edad;
	private int nclase;
	private ArrayList<Integer> notas;
	
	private static int numero_de_clase = 1;		
	private static final int NOTA_APROBADO = 5;
	
	public Alumno(String nombre, int edad)
	{
		this.nombre = nombre;
		this.edad = edad;
		nclase  = numero_de_clase;
		numero_de_clase++;
		notas = new ArrayList<Integer>();
	}
	
	public void addNota(int nota)
	{
		notas.add(nota);		
	}
	
	
	public int media()
	{		
		int nota = 0;
		for(int i = 0; i < notas.size(); i++)
		{
			nota = nota + notas.get(i);
		}
		int media = nota / notas.size();
		return media;
	}
	public String toString()
	{
	    return nclase + " " + nombre + " " + edad + " " + media();
	}
	public boolean estaAprobado()
	{
	    return (media()>=NOTA_APROBADO);
	}


}
