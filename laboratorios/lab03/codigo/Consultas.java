import java.util.Collections;
import java.util.LinkedList;
/**
 * Write a description of class Punto1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Consultas
{
   LinkedList<Materia> Materias = new LinkedList();
   LinkedList<Alumno> Aux = new LinkedList();
   LinkedList<Materia> Aux2 = new LinkedList();
   LinkedList<Materia> Aux3 = new LinkedList();
   LinkedList<String> ResultadoConsulta1 = new LinkedList();
   LinkedList<String> ResultadoConsulta2 = new LinkedList();
   LinkedList<Alumno> Alumnos1 = new LinkedList();
   LinkedList<Alumno> Alumnos2 = new LinkedList();   
   public LinkedList<String> Consulta1(String NombreMateria, String Semestre){
     for(int i = 0; i < Materias.size(); i++){
       if(Materias.get(i).getNombreMateria() == NombreMateria && Materias.get(i).getSemestre() == Semestre){
         Aux = Materias.get(i).getAlumnos();
       }
     }
     for(int i = 0; i < Aux.size(); i++){
       String A = Aux.get(i).getNombreCompleto();
       double B = Aux.get(i).getNota();
       String C = String.valueOf(B);
       String Final = "Alumno: "+ A + " Nota: "+ C;
       ResultadoConsulta1.add(Final);
     }
     return ResultadoConsulta1;
   }
   public LinkedList<String> Consulta2(long Código, String Semestre){
     for(int i = 0; i < Alumnos1.size(); i++){
       if(Alumnos1.get(i). getCódigo() == Código){
         Aux2 = Alumnos1.get(i).getMaterias();
         Alumnos2.add(Alumnos1.get(i));
       }
     }
     for(int i = 0; i < Aux2.size(); i++){
       if(Aux2.get(i).getSemestre() == Semestre){
         Aux3.add(Aux2.get(i));
       }
     }
     for(int i = 0; i < Aux3.size(); i++){
       String A = Aux3.get(i).getNombreMateria();
       double B = Aux3.get(i).getNota();
       String C = String.valueOf(B);
       String Final = "Materia: "+ A + " Nota: "+ C;
       ResultadoConsulta2.add(Final);
     }
     return ResultadoConsulta2;
   }
}
