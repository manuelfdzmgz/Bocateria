/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestJC
{
    private ArrayListInt array;
    
    public TestJC(){
        array = new ArrayListInt();
        
        //Iremos probando metodo por metodo que todo funciona bien
        //Metodo inicial, el tamaño inicial del array.
        System.out.println("\t\tArrayList creado");
        String test1 = null;
        if(array.size() == 0){
            test1 = "OK. El metodo size() devuelve " + array.size() + ". Debería devolver 0";
        }
        else{
            test1 = "ERROR. El metodo size() devuelve " + array.size() + ". Debería devolver 0";
        }
        System.out.println(test1);
        
        //Ahora añadiremos unos cuantos números sin especificar indice:
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(2);
        array.add(3);
        System.out.println("\t\tAñadidos 5 números con el método add()");
        String test2 = null;
        if(array.size()== 5){
            test2 = "OK. El metodo size() devuelve " + array.size() +". Debería devolver 5";
        }
        else{
            test2 = "ERROR. El metodo size() devuelve " + array.size() + ". Debería devolver 5";
        }
        System.out.println(test2);
        
        //Testeamos el metodo add con parametro index
        array.add(2,4);
        System.out.println("\t\tAñadido el número 4 en el indice 2 con metodo add(int index int elemento)");
        String test3 = null;
        if(array.size() == 6){
            test3 = "OK. El metodo size() devuelve " + array.size() + ". Debería devolver 6";
        }
        else{
            test3 = "ERROR. El metodo size() devuelve " + array.size() + ". Debería devolver 6";
        }
        System.out.println(test3);
        
        System.out.println("\t\tComprobamos el metodo get(int index) con el ultimo numero añadido");
        String test4 = null;
        if(array.get(2)==4){
            test4 = "OK. El metodo get(2) devuelve " + array.get(2) + ". Debería devolver 4";
        }
        else{
            test4 = "ERROR. El metodo get(2) devuelve " + array.get(2) + ". Debería devolver 4";
        }
        System.out.println(test4);
        
        
        //Comprobamos el metodo contains
        System.out.println("\t\tComprobamos el metodo contains(int elemento) con el número 4");
        String test5 = null;
        if(array.contains(4)){
            test5 = "OK. El metodo contains(4) devuelve " + array.contains(4) + ". Debería devolver true.";
        }
        else{
            test5 = "ERROR. el metodo contains(4) devuelve " + array.contains(4) + ". Debería devolver true.";
        }
        System.out.println(test5);
        
        //Comprobamos metodo set
        System.out.println("\t\tComprobamos el metodo set(1, 7)");
        array.set(1,7);
        String test6 = null;
        if(array.get(1) == 7){
            test6 = "OK. El metodo get(1) devuelve " + array.get(1) + ". Debería devolver 7.";
        }
        else{
            test6 = "ERROR. El metodo get(1) devuelve " + array.get(1) + ". Debería devolver 7.";
        }
        System.out.println(test6);
        
        //Comprobamos el metodo indexOf(int elemento)
        System.out.println("\t\tComprobamos el elemento indexOf(7)");
        String test7 = null;
        if(array.indexOf(7) == 1){
            test7 = "OK. El metodo indexOf(7) devuelve " + array.indexOf(7) + ". Debería devolver 1.";
        }
        else{
            test7 = "ERROR. El metodo indexOf(7) devuelve " + array.indexOf(7) + ". Debería devolver 1.";
        }
        System.out.println(test7);
        
        //Comprobamos metodo remove()
        System.out.println("\t\tComprobamos el método remove(1)");
        array.remove(1);
        String test8 = null;
        if(array.size()== 5){
            test8 = "OK. El metodo size() devuelve " + array.size() +". Debería devolver 5";
        }
        else{
            test8 = "ERROR. El metodo size() devuelve " + array.size() + ". Debería devolver 5";
        }
        System.out.println(test8);
        String test9 = null;
        if(!array.contains(7)){
            test9 = "OK. El metodo contains(7) devuelve " + array.contains(7) + ". Debería devolver false.";
        }
        else{
            test9 = "ERROR. el metodo contains(7) devuelve " + array.contains(7) + ". Debería devolver false.";
        }
        System.out.println(test9);
        
        //Comprobamos el metodo clear()
        System.out.println("\t\tComprobamos el método clear()");
        array.clear();
        String test10 = null;
        if(array.size()== 0){
            test10 = "OK. El metodo size() devuelve " + array.size() +". Debería devolver 0";
        }
        else{
            test10 = "ERROR. El metodo size() devuelve " + array.size() + ". Debería devolver 0";
        }
        System.out.println(test10);
        
        //Comprobamos metodo isEmpty();
        System.out.println("\t\tComprobamos metodo isEmpty()");
        String test11 = null;
        if(array.isEmpty()){
            test11 = "OK. El metodo isEmpty() devuelve " + array.isEmpty() +". Debería devolver true";
        }
        else{
            test11 = "ERROR. El metodo isEmpty() devuelve " + array.isEmpty() +". Debería devolver true";
            System.out.println(array.size());
        }
        System.out.println(test11);
    }
}
