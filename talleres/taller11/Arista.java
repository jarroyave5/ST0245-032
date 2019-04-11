public class Arista
{
    private Vertice V1, V2;
    private int peso;
    public Arista(Vertice V1, Vertice V2){
      this(V1, V2, 1);
    }
    public Arista(Vertice vertice1, Vertice vertice2, int peso){
      if(vertice1.getEtiqueta().compareTo(vertice2.getEtiqueta()) <= 0){
	  this.V1 = vertice1;
          this.V2 = vertice2;
      }else{
          this.V1 = vertice2;
	  this.V2 = vertice1;
      }
      this.peso = peso;		
    }
    public Vertice getVecinoDe(Vertice actual){
      if (actual.equals(this.V1)){
	 return this.V2;
      }else if( actual.equals(this.V2)){
	 return this.V1;
      }else{
	 return null;
      }
    }
    public Vertice getVertice1(){
      return this.V1;
    }
    public Vertice getVertice2(){
      return this.V2;
    }
    public int getPeso(){
      return this.peso;
    }
    public void setPeso(int peso){
      this.peso = peso;
    }
    public int compareTo(Arista arista2){
      return this.peso - arista2.peso;
    }
    public String toString(){
      return "({" + this.V1 + ", " + this.V2  + "}, "+ this.peso  +")";
    }
    public int hashCode(){
      return (V1.getEtiqueta() + V2.getEtiqueta()).hashCode();
    }
    public boolean equals(Arista objeto){
      if(!(objeto instanceof Arista)){
	return false;
      }
      Arista arista2 = (Arista) objeto;
      if(arista2.V1.equals(this.V1) && arista2.V2.equals(this.V2)){
	return true;
      }
      return false;
    }
}
