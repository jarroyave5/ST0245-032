import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
 * Write a description of class InsertionSort here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InsertionSort
{
   public static int []a;
   public static int[] InsertionSort(int[] Lista){
        for(int i = 1; i < Lista.length; i++){
            int Temporal = Lista[i];  
            int j = i-1;
            while((j > -1) && ( Lista[j] > Temporal)){
                Lista[j+1] = Lista[j];  
                j--;  
            }
            Lista[j+1] = Temporal;  
        }
        return Lista;
   }
    public static void main(String[] args){
     int n = 1000000;
     a = new int[n];
     for(int i = 0; i < n; i+=50000){
       a[i] = ((int)(Math.random() * 1000) + 1);   
     }
     for(int i=0;i <= a.length; i += 50000) {
       long start=System.nanoTime();   
       InsertionSort(a);
       long end= System.nanoTime();
       System.out.println("Tiempo en la posicion " + i + " es: " + (end-start));
       System.out.println("");
     }
   }
}
