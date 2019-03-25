import java.util.Collections;
import java.util.LinkedList;
/**
 * Write a description of class Materia here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Materia
{
   private String NombreMateria;
   private String Semestre;
   private double Nota;
   LinkedList<Alumno> Alumnos = new LinkedList();
   public void Materia(String NombreMateria, String Semestre, Alumno A){
    this.NombreMateria = NombreMateria;
    this.Semestre = Semestre;
    Alumnos.add(A);
   }
   public void DarNotaAlumno(double Nota){
    for(int i = 0; i < Alumnos.size(); i++){
      Alumnos.get(i).setNota(Nota);
    }
   }
    public String getNombreMateria(){
    return NombreMateria; 
   }
    public String getSemestre(){
    return Semestre; 
   }
   public LinkedList<Alumno> getAlumnos(){
     return Alumnos; 
   }
   public void setNota(double Nota){
      this.Nota = Nota;
   }
   public double getNota(){
      return Nota; 
   }
}
