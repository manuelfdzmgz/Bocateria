public class Frase{

    String Frases = "EMario,Alonso,Cid,71427450J,987256689";
    String[] arrayFrases =Frases.split(",");

    public void metodo()
    {
        for (int i = 0; i < arrayFrases.length; i++) {
            System.out.println(arrayFrases[i]);
        }
    } 
}