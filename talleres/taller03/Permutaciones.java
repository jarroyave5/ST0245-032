/*
 * Autores: Juan Andrés Arroyave y Gustavo López
 * 
 * Descripción: Permutaciones de una cadena de caracteres en Java, sin ciclos
 */


public class Permutaciones {

public static  void Permutaciones(String Cadena){
      Aux("", Cadena);
   }
   private static void Aux(String InicialVacio, String FinalVacio){
      int x = FinalVacio.length();
      if(x == 0){
        System.out.println(InicialVacio);  
      }
      else{
        for(int i = 0; i < x; i++){
          Aux(InicialVacio + FinalVacio.charAt(i), FinalVacio.substring(0, i) + FinalVacio.substring(i+1, x));
        }
      }
   }
}