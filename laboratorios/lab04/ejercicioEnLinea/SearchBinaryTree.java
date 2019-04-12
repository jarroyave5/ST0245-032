

//juan iguaran
public class SearchBinaryTree{
    Nodo root;
    
     public void insertar (int data)
      {
          Nodo nodo;
          nodo = new Nodo ();
          nodo.data = data;
          nodo.izq = null;
          nodo.der = null;
          if (root == null)
              root = nodo;
          else
          {
              Nodo anterior = null, reco;
              reco = root;
              while (reco != null)
              {
                  anterior = reco;
                  if (data < reco.data)
                      reco = reco.izq;
                  else
                      reco = reco.der;
              }
              if (data < anterior.data)
                  anterior.izq = nodo;
              else
                  anterior.der = nodo;
          }
      }
      
      public void PreOrden(){
          auxPreOrden(root);
        }
        
        private void auxPreOrden(Nodo nodo){
            if(nodo == null){
                return;
            }
            System.out.println(nodo.data + "");
            auxPreOrden(nodo.izq);
            auxPreOrden(nodo.der);
        }
      
      public void PosOtrden(){
          auxPostOrden(root);
        }
        
       private void auxPostOrden(Nodo nodo){
           if(nodo == null){
               return;
            }
            auxPostOrden(nodo.izq);
            auxPostOrden(nodo.der);
            System.out.println(nodo.data + " ");
        }
    }