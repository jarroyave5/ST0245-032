import java.lang.ArrayIndexOutOfBoundsException;
import java.util.LinkedList;
import java.lang.Math;
/**
 * Write a description of class Taller7 here.
 * 
 * @author Juan Andrés Arroyave
 * @version 6/03/2019
 */
public class Taller7
{
    public Taller7() {
        
     
        
    }
    
     //Primer nodo de la lista enlazada.
    int size=0; //Tamaño de la lista enlazada.
    
    public int MaxValueIt(){
     LinkedList<Integer> list=new LinkedList<Integer>();      
     int max=0;   
     
     list.add(0, 312);
     list.add(1, 0);
     list.add(2, 372);
     list.add(3, 32);
     list.add(4, 12);
     list.add(5, 3312);
     list.add(6, 12);
     for(int i=0;i<list.size();i++){ //Manera iterativa(Con ciclos)
     
         if(list.get(i)>max) {
             
             max=list.get(i);
            }
         
        }
        
        return max;
    }
    
        
}

class Node {
    
    int data;
    Node next;
    
    }