import java.util.LinkedList;
import java.util.Scanner;
/**
 * Write a description of class BreakPhone here.
 * 
 * @author Juan Andrés Arroyave 
 * @version 24/03/2019
 */
public class BreakPhone
{
    public BreakPhone (){
       
    }
    
    
    
    public static LinkedList ShowOutput (int n,String d) {
        LinkedList<Character> delete=new LinkedList<>();
        Scanner test= new Scanner(System.in);
        String input= test.next();
        n=input.length();
        int iterator=0;
        while(test.hasNext()) {
            input=input.toLowerCase();
            if(input.charAt(iterator)!='[' || input.charAt(iterator)!=']'){
                delete.add(input.charAt(iterator));
                    
            }
            
            if(n<0 || n>100000) {
                
             System.out.println("Sorry,you can´t do that");   
            }
            
            iterator++;
        }
        
        
        
        return delete;
    }
    
    
    public static void main(String[] args) {
       
        
    }
 
}

