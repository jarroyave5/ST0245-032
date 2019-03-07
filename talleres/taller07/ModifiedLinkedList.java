import java.lang.IndexOutOfBoundsException;
 // Usar esto cuando se salga el índice
// Una lista simplemente enlazada
public class ModifiedLinkedList {
private Nodo first;
private int size;
 private Nodo temp;
public ModifiedLinkedList()
{
    size = 0;
    first = null;   
}
    /**
     * Returns the node at the specified position in this list.
     * @param index - index of the node to return
     * @return the node at the specified position in this list
     * @throws IndexOutOfBoundsException
     */
    private Nodo getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Nodo temp = this.first;
            for (int i = 0; i < index; i++) {//Indica el número de índices presentes que se introdujo.
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException("There is not data.");
        }
    }
    
    /**
     * Returns the element at the specified position in this list.
     * @param index - index of the element to return
     * @return the element at the specified position in this list
         * @throws IndexOutOfBoundsException
     */
    public int get(int index) throws IndexOutOfBoundsException {
        temp = this.getNode(index);
        return temp.data;
    }

// Retorna el tamaño actual de la lista
public int size()
{
    return this.size;
}

// Inserta un dato en la posición index
public Nodo insert(int data, int index)
{
    Nodo aux= getNode(index-1); //O(1)
    
    while(aux.next!=null ) { //O(N)
        
        aux=aux.next;
    
        size+=1;
    
        break;
    }
    
    Nodo auxNode= aux;
    
    return auxNode;
}

// Borra el dato en la posición index
public void remove(int index)
{
   if (index == 0){
     first = null; // Ya que en una lista enlazada el siguiente objeto que sigue del último es null.
   }
   else{
        Nodo anterior = getNode(index-1); //Toma desde el anterior para eliminarlo
        anterior.next = anterior.next.next; //Como el siguiente se va a eliminar entonces el que sigue del siguente será nulo.
     }
}

private boolean containsAux(int ElDato, Nodo nodo){
     if (nodo == null) // Condicion de parada
        return false;
     else
        if (nodo.data == ElDato) // Otra condicion de parada
          return true;
        else  // Caso inductivo T(n) = T(n-1) + C = O(n)
          return containsAux(ElDato, nodo.next); 
  }
// Verifica si está un dato en la lista
public boolean contains(int data){
   // Si el dato está a partir del primero
     return containsAux(data, first); 
}
  
     public static boolean isNotNull( Nodo data) {
        
        if(data==null) {
            
            return false;
        }
        
        return true;
    }


}


    
    
    
    
    
    