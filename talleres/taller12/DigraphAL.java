import javafx.util.Pair;
import java.util.ArrayList;
import java.util.LinkedList;
import javafx.util.Pair;
import java.lang.Math;

public class DigraphAL extends Digraph
/*
 * This is our workshop of data structure
 *  Juan Andrés Arroyave
 *  Juan Camilo Iguarán
 *  Gustavo Lopez
 * This workshop consist in the implementation of DFS and BFS using data structures.
 */

{
    public ArrayList <LinkedList<Pair<Integer,Integer>>> GraphNode;
    public DigraphAL(int size) {
       super(size);
        GraphNode=new ArrayList();
        
        for(int i=0;i<size + Math.sqrt(1);++i) {
            
            GraphNode.add(new LinkedList<Pair<Integer,Integer>>() );
            
        }
    }
    public void addArc(int source, int destination, int weight){
        GraphNode.get(source).add(new Pair<>(destination,weight));
    }
    public int getWeight(int source, int destination) {
        LinkedList <Pair<Integer,Integer>> aux= GraphNode.get(source);
        int weight=0;
        for(int i=0;i<aux.size();++i) {
            if(aux.get(i).getKey()==destination) {
                weight=aux.get(i).getValue();
            }
        }
        return weight;
    }
    public ArrayList<Integer> getSuccessors(int vertice){
        LinkedList<Pair<Integer,Integer>> aux= GraphNode.get(vertice);
        
        ArrayList<Integer> def = new ArrayList<>();
        
        for(int i=0;i<aux.size();i++) {
            
            def.add(aux.get(i).getKey());
            
        }
        
        return def;
    }
    
    public boolean ThereIsRoute(Digraph g,int origen,int destino,boolean [] exists) {
       //This method tell us if there is a route between two vertex of a graph
       ArrayList<Integer> successors = getSuccessors(origen);
        for (int i=0;i<successors.size();i++) {
        
        for(int k=0;k<successors.size();k++) {
           
           if(successors.get(i)==destino){
           return true;
        }
        }
        
        if(ThereIsRoute(g,successors.get(i),destino,exists)){
            return true;
    }
}
    return false;

}
}