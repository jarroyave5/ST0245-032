import java.util.HashMap;
import java.util.Hashtable;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * Write a description of class Punto1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto1
{



    public static void asociar() {
        
        HashMap <String,Integer> asociar= new HashMap<>();
        
        Scanner sn= new Scanner(System.in);
        System.out.println("Introduce a name : " );
        String c=sn.next();
        int names=0;
        while(!(c.equalsIgnoreCase("stop"))) {
            
             c= sn.next();
             asociar.get(c);
            names++;
            
            String [] positions = new String[names];
            int k;
            
            for(k=0;k<positions.length;k++) {
                
                positions[k]=c;
                
                if(positions[k].startsWith("a")) {
                    System.out.println("The first letter of yourn name is 12");
                }
                
                
                if(positions[k].startsWith("g")) {
                    
                    System.out.println("The first letter of yourn name is 15");
                }
                
                
                if(positions[k].startsWith("j")) {
                    
                    System.out.println("The first letter of yourn name is 17");
                }
                
                if(positions[k].startsWith("s")) {
                    
                    System.out.println("The first letter of yourn name is 20");
                }
                
                
                if(positions[k].startsWith("e")) {
                    
                    System.out.println("The first letter of yourn name is 21");
                }
            }
            
            
        }
        
        
    }
 
    
    

}
