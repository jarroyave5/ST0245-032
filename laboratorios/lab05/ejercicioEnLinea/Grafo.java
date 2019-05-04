import java.util.*;
/**
 * Clase Grafo 
 * @author Juan Iguaran
 */
public class Grafo {

    public int[][] g = {{2, 1, 0, 1, 0},
                        {1, 2, 1, 0, 0},
                        {0, 1, 2, 1, 0},
                        {1, 0, 1, 2, 1},
                        {0, 0, 0, 1, 2}};
    private boolean[] visitiadoAnchura = new boolean[5];
    private boolean[] visitiadoProfunidad = new boolean[5];

    public Grafo() {
    }

    public int[][] getG() {
        return g;
    }
    
            public ArrayList<Integer> recorridoProfunidad(int nodoI) {
                 ArrayList<Integer> recorridos = new ArrayList<Integer>();
                if(nodoI >= 5){
                    System.out.println("Error");
                }
                else{
//Lista donde guardo los nodos recorridos
        visitiadoProfunidad[nodoI] = true;//El nodo inicial ya está visitado
//Cola de visitas de los nodos adyacentes
        ArrayList<Integer> cola = new ArrayList<Integer>();
        recorridos.add(nodoI);//Listo el nodo como ya recorrido
        cola.add(nodoI);//Se agrega el nodo a la cola de visitas
        while (!cola.isEmpty()) {//Hasta que visite todos los nodos
            int j = cola.remove(0);//Se saca el primer nodo de la cola
    //Se busca en la matriz que representa el grafo los nodos adyacentes
            for (int i = 0; i < g.length; i++) {
//Si es un nodo adyacente y no está visitado entonces
                if (g[j][i] == 1 && !visitiadoProfunidad[i]) {
                    System.out.println("No color");
                    cola.add(i);//Se agrega a la cola de visita
//Se recorren los hijos del nodo actual de visita y se agrega el recorrido al la lista
                    recorridos.addAll(recorridoProfunidad(i));
                    visitiadoProfunidad[i] = true;//Se marca como visitado
                }
                else if(!visitiadoProfunidad[i]){
                    System.out.println("Si color");
                }
            }
        }//Se devuelve el recorrido del grafo en profundidad
    }
    return recorridos;
 }
}
