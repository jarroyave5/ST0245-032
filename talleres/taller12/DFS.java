import java.util.ArrayList;

/**
 * Clase Grafo 
 * @author Juan Sebastian
 */
public class DFS {

    public int[][] g = {{2, 1, 0, 1, 0},
                        {1, 2, 1, 0, 0},
                        {0, 1, 2, 1, 0},
                        {1, 0, 1, 2, 1},
                        {0, 0, 0, 1, 2}};
    private boolean[] visitiadoAnchura = new boolean[5];
    private boolean[] visitiadoProfunidad = new boolean[5];

    public DFS() {
    }

    public int[][] getG() {
        return g;
    }
    
    public boolean hayCamino(int nodoI, int llegada){
        boolean hay = true;
        ArrayList<Integer> recorridos = new ArrayList<Integer>();
        visitiadoProfunidad[nodoI] = true;
        ArrayList<Integer> cola = new ArrayList<Integer>();
        recorridos.add(nodoI);
        cola.add(nodoI);
        while (!cola.isEmpty()) {
            int j = cola.remove(0);
            for (int i = 0; i < g.length; i++) {
                if (g[j][i] == 1 && !visitiadoProfunidad[i]) {
                    cola.add(i);
                    visitiadoProfunidad[i] = true;
                }
                else if(g[j][i] == 100000000 && g[j][i]== llegada){
                    hay = false;
                }
            }
        }
        return hay;
    
}
}