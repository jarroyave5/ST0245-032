import java.util.ArrayList;
public class Vertice
{ 
    private ArrayList<Arista> Aristas;
    private String etiqueta;
    public Vertice (String etiqueta)
    {
      this.etiqueta = etiqueta;
      this.Aristas = new ArrayList<Arista>();
    }
    public void insertarArista(Arista arista)
    {
      if( !this.Aristas.contains(arista)){
	    this.Aristas.add(arista);
      }
    }
    public boolean contieneUnaArista(Arista arista){
      return this.Aristas.contains(arista);
    }
    public Arista getArista(int indice){
      return this.Aristas.get(indice);
    }
    public Arista eliminarArista(int indice){
      return this.Aristas.remove(indice);
    }
    public void eliminarArista(Arista arista){
      this.Aristas.remove(arista);
    }
    public int getContarAristas(){
      return this.Aristas.size();
    }
    public String getEtiqueta(){
      return this.etiqueta;
    }
    public boolean equals(Object V2){
      if( !(V2 instanceof Vertice)){
	    return false;
      }
      Vertice v = (Vertice) V2;
      return this.etiqueta.equals(v.etiqueta);
    }
    public String toString(){
      return "Vertice: " + this.etiqueta;
    }
    public int hashCode(){
	return this.getEtiqueta().hashCode();
    }
    public ArrayList<Arista> getAristas()
    {
	return new ArrayList<Arista>(this.Aristas);
    }
}