public class BinaryTree
{
  public static Node root;
  public static boolean buscar(int n){      
    return buscarAux(root, n);
  }  
	/**
	* @param node es la raíz del arbol
	* @param n el data del nodo que se busca
	* nota: metodo recursivo.
	* Inserta un dato respetando claro las desigualdades en el árbol
	* @return true si se encuentra el elemento en el árbol, false de lo contrario
	*/ 
  private static boolean buscarAux(Node node, int n) {
     if (node == null){
        return false;
    }
      else {
        if(node.dato == n){
           return true;
        }
        if(node.dato < n){
          buscarAux(node.derecha, n);
        }
        if(node.dato > n){
          buscarAux(node.izquierda, n);
        }
    }
    return false;
  }
  public static void main(String args[]){
    BinaryTree arbol = new BinaryTree();
    Node nodo1 = new Node(1);
    Node nodo2 = new Node(2);
    Node nodo3 = new Node(3);
    nodo1.izquierda = nodo2;
    nodo1.derecha = nodo3;
    arbol.root = nodo1;
    BinaryTree.buscar(3);
  }
}