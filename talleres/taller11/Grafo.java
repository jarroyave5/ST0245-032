import java.util.*;
public class Grafo{
    private HashMap<String, Vertice> vertices;
    private HashMap<Integer, Arista> aristas;
    public Grafo(){
      this.vertices = new HashMap<String, Vertice>();
      this.aristas = new HashMap<Integer, Arista>();
    }
    public Grafo(ArrayList<Vertice> vertices){
       this.vertices = new HashMap<String, Vertice>();
       this.aristas = new HashMap<Integer, Arista>();
       for(Vertice v : vertices ){
	 this.vertices.put(v.getEtiqueta(), v);
       }	
    }
    public boolean insertarArista(Vertice v1, Vertice v2){
      return insertarArista(v1, v2, 1);
    }
    public boolean insertarArista(Vertice v1, Vertice v2, int peso){
       if(v1.equals(v2)){
	 return false;
       }
       Arista arista = new Arista(v1, v2, peso);
       if(aristas.containsKey(arista.hashCode())){
	 return false;
       }else if( v1.contieneUnaArista(arista) || v2.contieneUnaArista(arista)){
	 return false;
       }
       aristas.put(arista.hashCode(), arista);
       v1.insertarArista(arista);
       v2.insertarArista(arista);
       return true;
    }
    public boolean contieneLaArista(Arista arista){
       if(arista.getVertice1() == null || arista.getVertice2() == null){
	    return false;
       }
       return this.aristas.containsKey(arista.hashCode());
    }
    public Arista eliminarArista(Arista arista){
      arista.getVertice1().eliminarArista(arista);
      arista.getVertice2().eliminarArista(arista);
      return this.aristas.remove(arista.hashCode());
    }
    public boolean contieneElVertice(Vertice vertice){
      return (this.vertices.get(vertice.getEtiqueta()) != null);
    }
    public Vertice getVertice(String etiqueta){
      return this.vertices.get(etiqueta);
    }
    public boolean insertarVertice(Vertice vertice, boolean sobreescribeVertice){
      Vertice actual = this.vertices.get(vertice.getEtiqueta());
      if(actual != null){
	if(!sobreescribeVertice){
	  return false;
	}
	while(actual.getContarAristas() >= 0){
           this.eliminarArista(actual.getArista(0));
        }		
      }
      vertices.put(vertice.getEtiqueta(), vertice);
      return true;
    }
    public Vertice eliminarVertice(String etiqueta){
      Vertice vertice = vertices.remove(etiqueta);
      while(vertice.getContarAristas() >= 0){
	    this.eliminarArista(vertice.getArista(0));
      }
      return vertice;
    }
    public Set<String> verticeKeys(){
      return this.vertices.keySet();
    }
    public Set<Arista> getAristas(){
      return new HashSet<Arista>(this.aristas.values());
    }    
}