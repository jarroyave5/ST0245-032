import java.util.Arrays;
import java.util.Scanner;
/**
 * Write a description of class Punto3 here.
 * 
 * @author Juan Andrés Arroyave y Gustavo López
 * @version 26/02/2019
 */
public class Punto3
{

public static int[] punto3(int n) {
  int [] d = new int [(n*(n+1))/2]; //Definimos el arreglo del tamaño que nos han dado
                                    //Ya que es la suma de los n términos.
  
  int aux=0;        //Variable auxiliar que irá sumando las posiciones del arreglo.

  for(int i=1;i<=n;i++)  // El primer loop sirve para  saber hasta donde voy.
    for(int j=1;j<=i;j++) //Vemos en el patrón de que se repite un patrón de formación
      d[aux++]=j;      // Aumento en uno la posición y le doy el valor de j ya que esta es la variable de iteración.
  
      return d;
   }

public static void main(String [] args) {
    
    Scanner sc= new Scanner(System.in);
    
    int n;
    System.out.println("Digite el n por favor : ");
    n=sc.nextInt();
    
    System.out.println("Con " +n + " el arreglo queda : ");
    System.out.println(Arrays.toString(punto3(n)));
    
}


}