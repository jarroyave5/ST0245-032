import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
/**
 * Write a description of class Punto2 here.
 * 
 * @author Juan Andrés Arroyave
 * @version 26/03/2019
 */
public class Punto2
{
    
    public static void Asignacion () {
        
    HashMap<String,String> lista= new HashMap<>();    
        
    
    lista.put("La locura", "Colombia");
    lista.put("Google", "Estados Unidos");
    lista.put("Nokia", "Finlandia");
     lista.put("Sony","Japon");
     
     
     
     if(lista.containsKey("La locura" )) System.out.println("La locura is from " + lista.get("La locura"));
     if(lista.containsKey("Google")) System.out.println("Google is from "+ lista.get("Google"));
     if(lista.containsKey("Nokia")) System.out.println("Nokia is from "+ lista.get("Nokia"));
    }
    
}
