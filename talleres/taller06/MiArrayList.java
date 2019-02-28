import java.util.Arrays;
public class MiArrayList
/*
 * Punto 1 Taller 6 Estructuras de Datos y Algorítmos 1.
 * Autores: Juan Andrés Arroyave y Gustavo López,
 * Fecha : 27/02/2019
*/
 {
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private int elements[];
   
    public MiArrayList() {
        size = 0;
        elements = new int[DEFAULT_CAPACITY];
    }
    /**
    * Tiene la intención de retornar la longitud del objeto
    * @return longitud del objeto
    *
    * El size esta influenciado por las funciones add y del
    */
    public int size() {
        return  this.size;
    }
    
    
        public void add(int e) {
            
            if(size==elements.length) {
             IncreaseSize();   
            }
            
            elements[size]=e;
            size++;
            
    }
    
  
    public int get(int i) throws ArrayIndexOutOfBoundsException {
        if (i < 0 || i >= size){
           new ArrayIndexOutOfBoundsException("perdon usuario, pero i " + i + "y el tamaño del arreglo es " + size);
        }
        return elements[i];        
    }
    public void add(int index, int e){
        if(index <= size){
           elements[index] = e;
           IncreaseSize();
         }
        
         
         for(int i=index;i<size-1;i++) {
             
             elements[i+1]=elements[i];
            }
            elements[index]=e;
            
            size++;
            //Aumentamos el tamaño... 
    }
    
    public void eliminar (int index) throws ArrayIndexOutOfBoundsException
        {
        //Método que sirve para eliminar elementos de una lista.
        
        //Pasa algo: Index no puede ser menor a 0 o mayor al tamaño del arreglo.
        
        if(index<0 || index> elements.length-1) //then.. 
        {   
         new ArrayIndexOutOfBoundsException
        ("Lo sentimos usuario, pero el indice es" + index +" y el tamaño es :" +elements.length);     
        }
        
        for(int i=index;i<elements.length-1;i++) {
            
           elements[i]=elements[i+1]; 
        }
    
        size--;
    }
    
    public void IncreaseSize () {
        int []auxArray = new int [size*2]; //Esto se hace para que el usuario crea que tiene n elementos,pero en un ArrayList
            for(int i=0;i<size;i++) {    
                auxArray[i]=elements[i];
                
            }
            
            auxArray=elements; //Esto es solo en caso de que nuestro arreglo se vaya a salir de posición 
                               //Esto si se va a salir de posición para que no ocurra un ArrayIndexOutBoundException.
    }
    
}