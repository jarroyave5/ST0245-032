import java.lang.ArrayIndexOutOfBoundsException;
import java.util.LinkedList;
/**
 * Programa que compara si dos listas Enlazadas son iguales .
 * 
 * @author Juan Andrés Arroyave
 * @version 06/03/2019
 */
public class ListasIguales
{
    LinkedList a= new LinkedList();
    LinkedList b= new LinkedList();
    
    
    
    
    public boolean SonIguales() {
        
     if(a.size()!=b.size()) return false;
     
     else if(a.size()==b.size()) {
         String c="";
         String k= "" ;
         for(int i=0;i<a.size();i++) {
             c+=a.get(i) + " "; 
             c=c.toUpperCase();
             
            }
            
            for(int j=0;j<b.size();j++) {
             
             k+=b.get(j) + " ";
             k=k.toUpperCase();
                
            }
         
            if(c==k) return true;
            
        }
    
        return false;
        //Falta la condición de mirar si el tipo de dato de ambas listas es el mismo.
        
    }
    
    
}

