import java.util.concurrent.TimeUnit;
/**
 * Write a description of class TablasDeMultiplicar here.
 * 
 * @author Juan Andrés Arroyave y Gustavo López
 * @version 19/02/2019
 */
public class TablasDeMultiplicar
{   
        private static void TablasDeMultiplicar (int n) {
        
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=n;j++) {
                    try {
                 TimeUnit.MILLISECONDS.sleep(35);
                    
                }
                
                    catch(Exception e) {}
                    
                
                    System.out.println( i + " X " + j +  " = " + (i*j));   
                
                
                }
            
            }
        
        }
      
      
        public static void main(String [] args) {
        
        for(int i=1;i<=20;i++) {
         long start=System.currentTimeMillis();   
            TablasDeMultiplicar(i);
            long end= System.currentTimeMillis();
            
            
            System.out.println("Time" + (end-start));
             System.out.println("");
        }
        
        
        
        
        
        }

 
}