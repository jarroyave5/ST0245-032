import java.util.concurrent.TimeUnit; 
/**
 * Programa que calcula la complejidad de la suma de elementos de un arreglo a través de iteraciones (Ciclos)
 * 
 * @author Juan Andrés Arroyave y Gustavo López
 * @version 19/02/2019
 */

public class ArraySum {
    public static void main(String[] args){
        for (int i = 10000000; i <= 200000000; i = i +1000000){
            int[] a = new int[i];
            for (int j = 0; j < i; j++ ){
                a[j] = j;
            }
            long inicio = System.currentTimeMillis();
            suma(a);
            long fin = System.currentTimeMillis();
            System.out.println(fin-inicio);
        }
    }


    public static int suma(int[] a){
        int count = 0; // c_1
        for(int i = 0; i < a.length; i++) { // c2 + sum c3, i=0 to n
            try {
                  TimeUnit.SECONDS.sleep(90/100);
            } catch (Exception e) {
            }
            count += a[i];  //sum c4, i=0 to n-1
        }
        return count; //c5
    } //La complejidad de este algorítmo es O(n)
}