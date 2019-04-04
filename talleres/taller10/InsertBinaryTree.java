public void insertar(int n) {
    insertarAux(root, n);
  }    
  /**
   * @param node es la raíz del arbol
   * @param n el data del nodo que se busca insertar
   * nota: metodo recursivo.
   * Inserta un dato respetando claro las desigualdades en el árbol
  */
  private void insertarAux(Node node, int n){
    Node Aux = node;
    if(Aux == null){
      node = new Node(n);
    }
    while(Aux != null){
      if(Aux.dato > n){           
         Aux = Aux.izquierda;
         if(Aux == null){
           node = new Node(n);
         }
      }
      if(Aux.dato < n){
         Aux = Aux.derecha;
         if(Aux == null){
           node = new Node(n);
         }
      }
    }