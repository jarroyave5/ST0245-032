/**
 * Clase encargada de crear la abeja con sus coordenadas.
 *
 * @author Juan Iguaran
 * @author Gustavo Lopez
 * @author Juan Andre Arroyave
 * @version (2019)
 */
public class Abeja{
  private double Latitud;
  private double Longitud;
  private double HNivelMar;
  
  /**
   * construtor de la clase abeja que recibe 3 parámetros tipo double: Latitud, Longitud y HNivelMar
   */
  public Abeja(double Latitud, double Longitud, double HNivelMar){
    this.Latitud = Latitud;
    this.Longitud = Longitud;
    this.HNivelMar = HNivelMar;
  }
  
  /**
   * Método que retorna la latitud de la abeja
   */
  public double getLatitud(){
    return Latitud;  
  }
  
  /**
   * Método que retorna la longuitud de la abeja
   */
  public double getLongitud(){
    return Longitud;  
  }
  
  /**
   * Método que retorna la altura sobre el nivel del mar de la abeja
   */
  public double getHNivelMar(){
    return HNivelMar;  
  }
  
  /**
   * @pre double
   * @post la latitud de la clase será la latitud del método
   */
  public void setLatitud(double Latitud){
    this.Latitud = Latitud;  
  }
  
  /**
   * @pre double
   * @post la longuitud de la clase será la longuitud del método
   */
  public void setLongitud(double Longitud){
    this.Longitud = Longitud;  
  }
  
  /**
   * @pre double
   * @post la msn de la clase será la msn del método
   */
  public void setHNivelMar(double HNivelMar){
    this.HNivelMar = HNivelMar;  
  }
}
