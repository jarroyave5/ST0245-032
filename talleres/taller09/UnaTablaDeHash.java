import java.util.HashMap;
import java.lang.Math;
/**
* La clase UnaTablaDeHash, es un plantilla para crear nuestra propia estructura hash
* Dentro de sus caracter�sticas esta que tiene un string como llave (key) y un entero
* como valor (value)
* @author Juan Andr�s Arroyave
* @version 1
*/
public class UnaTablaDeHash
{
   /*
   * Utilizamos array por simplicidad sin embargo el uso de este no permite manejar coliciones
   * de manera eficiente, por lo cual esta primera versi�n de hash no implementa colisiones, esta
   * caracter�stica se implementar� posteriormente.
   */
   private int[] tabla;


   /**
   * Este m�todo define el array utilizado con 10 posiciones de manera que tenemos un l�mite de 10 elementos
   * 
   */
   public UnaTablaDeHash(){
      tabla = new int[10];
   }

   /**
   * k es la llave del elemento que servir� como referencia al buscar
   * Este m�todo se utiliza para darle una posicion dentro de la tabla, donde el %10 asegura que solo
   * se utilicen digitos de 0 a 10.
   */
   private int funcionHash(String k){
       int acum=0;
       for(int i=0;i<k.length();i++) {
           
           
           acum+=((int)k.charAt(i))*i*(int)Math.pow(2,31-i);
           
        }
        return acum%tabla.length;
   }

   /**
   * @param k es la llave del elemento que servir� como referencia al buscar
   * Este m�todo se utiliza para obtener el elmento con la clave k, se enlaza con funcionHash
   */
   public int get(String k){
       int aux=funcionHash(k);
       
       return aux;
   }

   /**
   * @param k es la llave del elemento que servir� como referencia al buscar posteriormente
   * @param v es el valor asociado a la llave k
   * Este m�todo se utiliza para agregar un nuevo elemento
   */
   public void put(String k, int v){
       HashMap<String,Integer> save= new HashMap<>();
       
       
       save.put(k, v);
       
       
   }
   
   
   
   
}