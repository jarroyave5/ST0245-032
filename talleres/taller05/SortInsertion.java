import java.util.concurrent.TimeUnit;
 /**
 * Este programa ordena una lista de números de menor a mayor
 * @author Juan Andrés Arroyave y Gustavo López
 * @version 19/02/2019
 */
public class SortInsertion
{
    
    public static void main(String[] args) {
        
        for(int i=1;i<=20;i++) {
         
                int [] def=new int [i];
         
                for(int j=1;j<i;j++){
                def[j]=j;
                
               }
               
               long inicio=System.currentTimeMillis();
               SortInsertion(def);
               long fin=System.currentTimeMillis();
               System.out.println(fin-inicio);
               
        }
     
      }
    
    
    public static int [] SortInsertion (int [] n) {
        
        for(int i=0;i<n.length;i++) { //N+1 iteraciones +n incrementos + constante
            
         int elMenor=i;   
         
            for(int j=elMenor+1;j<n.length;j++) { // (N+1 iteraciones+ n incrementos)*n 
                try {
                    
                    TimeUnit.SECONDS.sleep(1);
                }
                
                catch(Exception e) {
                    
                    
                }
                if(n[j]<n[elMenor]) {
                    
                 elMenor=n[j];   //Constante 
                }
                
                
            }
            int aux=n[i]; //C1
            n[i]=n[elMenor]; //C2
            n[elMenor]=aux; //C3
            
            
        }
        
    
        return n;
    }
    
}