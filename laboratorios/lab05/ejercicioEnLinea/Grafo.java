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
        visitiadoProfunidad[nodoI] = true;
        ArrayList<Integer> cola = new ArrayList<Integer>();
        recorridos.add(nodoI);
        cola.add(nodoI);
        while (!cola.isEmpty()) {
            int j = cola.remove(0);
            for (int i = 0; i < g.length; i++) {
                if (g[j][i] == 1 && !visitiadoProfunidad[i]) {
                    System.out.println("No color");
                    cola.add(i);
                    recorridos.addAll(recorridoProfunidad(i));
                    visitiadoProfunidad[i] = true;
                }
                else if(!visitiadoProfunidad[i]){
                    System.out.println("Si color");
                }
            }
        }
    }
    return recorridos;
 }
}
