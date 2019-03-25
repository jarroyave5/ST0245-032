import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * Write a description of class Alumno here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Alumno
{
   private String PrimerNombre;
   private String PrimerApellido;
   private String SegundoApellido;
   private String NombreCompleto;
   private long Código;
   LinkedList<Materia> Materias = new LinkedList();   
   double Nota;
   public void Alumno(String PrimerNombre, String PrimerApellido, String SegundoApellido, long Código){
     this.PrimerNombre = PrimerNombre;
     this.PrimerApellido = PrimerApellido;
     this.SegundoApellido = SegundoApellido;
     this.Código = Código;
     NombreCompleto = PrimerApellido+"_"+SegundoApellido+"_"+PrimerNombre;
   }
   public void AñadirMateria(Materia M){
     Materias.add(M);
   }
   public String getPrimerNombre(){
    return PrimerNombre; 
   }
   public void setPrimerNombre(String PrimerNombre){
     this.PrimerNombre = PrimerNombre; 
   }
   public String getPrimerApellido(){
    return PrimerApellido; 
   }
   public void setPrimerApellido(String PrimerApellido){
     this.PrimerApellido = PrimerApellido; 
   }
   public String getSegundoApellido(){
    return SegundoApellido; 
   }
   public void setSegundoApellido(String SegundoApellido){
     this.PrimerNombre = PrimerNombre; 
   }
   public String getNombreCompleto(){
    return PrimerNombre; 
   }
   public void setNombreCompleto(){
     NombreCompleto = PrimerApellido+"_"+SegundoApellido+"_"+PrimerNombre;
   }
   public long getCódigo(){
     return Código; 
   }
   public void setCódigo(long Código){
     this.Código = Código;
   }
   public double getNota(){
     return Nota; 
   }
   public void setNota(double Nota){
     this.Nota = Nota; 
   }
   public LinkedList<Materia> getMaterias(){
     return Materias;
   }
   public void NotasFinales(){
    for(int i = 0; i < Materias.size(); i++){
      System.out.println("La materia es: "+Materias.get(i));
      Scanner Lector = new Scanner(System.in);
      System.out.println("¿Cual fue la nota del estudiante en esta materia?");
      double Nota = Lector.nextDouble();
      Materias.get(i).setNota(Nota);
    }
   }
}
