/**
 * Autor: Juan Iguaran
 * Fecha: Abril 9
 */
public class GrafoMatrixAdyacencia {
private final int tamaño;

private int matriz[][];


public GrafoMatrixAdyacencia(int vertices) {
tamaño = vertices;
matriz = new int[tamaño][tamaño];
for (int i = 0; i < getTamaño(); i++) {
for (int j = 0; j < getTamaño(); j++) {
matriz[i][j] = 0;
}
}
}

public int getTamaño() {
return tamaño;
}


public void addArc(int v1, int v2, int dist) {
if (v1 >= tamaño|| v2 >= tamaño) {
System.out.println(
"Vertices inválidos, fuera de rango " + "nRango de vertices: 0 - " + (getTamaño() - 1));
} {
matriz[v1][v2] = dist;
}
}

public void imprimirMatriz() {
 for(int i=0; i< tamaño; i++){
            for(int j=0; j< tamaño; j++){
                System.out.print( matriz[i][j] + "  " );        
            }
            System.out.println();
        }  
}

public int Successors(int v) {
int auxiliar = 0;
boolean estavacia = true;

while (auxiliar < tamaño && estavacia) {
if (matriz[v][auxiliar] != 0) {
estavacia = false;
} else {
auxiliar = auxiliar + 1;
}
}

if (auxiliar == tamaño)
System.out.println("La lista de Adyacencia esta vacía");
return auxiliar;
}

public int Weight(int v, int ady) {
while (ady < tamaño && matriz[v][ady] == 0) {
ady = ady + 1;
}
if (ady == tamaño)
return -1;
return ady;
}

}
