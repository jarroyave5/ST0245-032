import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URL;
/**
 * Write a description of class CrearArchivo here.
 *
 * @author Gustavo Lopez
 * @version 19/11/2018
 */
public class CrearArchivo
{
  public static void LeerArchivo(String archivo/*Nombre del fichero Ejemplo : "Datos2.txt"*/) throws Exception {
 String cadena;
      FileReader f = new FileReader(archivo);
      BufferedReader b = new BufferedReader(f);
      while((cadena = b.readLine())!=null) {
          System.out.println(cadena);
      }
      b.close();
  }
}
