
import java.util.concurrent.TimeUnit;


public class Taller4
/* Autores Juan Andrés Arroyave (de Fibonacci) y Gustavo López (de SumaArray)
 * 
 * Fecha : 13/02/2019
 * 
 */

{
    public static int x = 0;
    public static int SumaArray(int[] Array){
       if(x== Array.length){
         return 0; 
       }
       x += 1;
       try{
            TimeUnit.SECONDS.sleep(1); //Para obtener el tiempo de ejecución
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
       return Array[x-1] + SumaArray(Array);
    }
    public  int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        try{
            TimeUnit.SECONDS.sleep(1); //Para obtener el tiempo de ejecución
        }catch (Exception e){
            System.out.println("Error: "+e);
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
