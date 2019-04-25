import java.util.ArrayList;
/**
 * Esta clase es una implementación de un digrafo usando matrices de adyacencia
 * 
 * @author Juan Andrés Arroyave Juan Camilo Iguaran and Gustavo Lopez
 * 24/04/2019
 */
public class DigraphAM extends Digraph
{
    public int matriz [][];
    
   public DigraphAM(int size)
   {
       super(size);
       int matriz [][]= new int [size][size];
   }
   
   public int getWeight(int source, int destination)
   {
       
      return matriz[source][destination];
    }
   
   public void addArc(int source, int destination, int weight)
   {
    matriz [source][destination]= weight;
   }
  
   public ArrayList<Integer> getSuccessors(int vertex)
   {
       ArrayList<Integer> succesors= new ArrayList<Integer>();

       for(int i=0;i<matriz.length;i++) {
           if(matriz[vertex][i]!=0) {
           
               succesors.add(i);
               
            }   
        }
        return succesors;
       } 
    }
