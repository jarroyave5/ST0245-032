import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.Math;
/**
 * Clase encargada de crear la abeja con sus coordenadas.
 *
 * @author Juan Iguaran
 * @author Gustavo Lopez
 * @author Juan Andre Arroyave
 * @version (2019)
 */
/**
 * Clase encargada de leer archivo, crear arrayList de tipo abeja y detectar los riesgos de colisión
 */
public class Analizador1
{
private  String archivo;
  ArrayList<Abeja> data = new ArrayList<>();
  
  /**
   * Costructor de la clase analizador
   */
    public Analizador1(String archivo){
        this.archivo=archivo;
    }
    
    /**
     * @pre String archivo = Tiene que ser una cadena " "
     * @post leer archivo de texto y crear arreglo de tipo abeja
     */
    public  ArrayList<Abeja> arrayListDeDatos(String archivo) throws FileNotFoundException, IOException{
        long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long TInicio, TFin, tiempo;           //Para determinar el tiempo
        TInicio = System.currentTimeMillis();
        String cadena=null;
        this.archivo=archivo;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        
        while((cadena =b.readLine())!=null) {
            String[] aiuda=cadena.split(",");
            String lat = aiuda[0];
            String longi=aiuda[1];
            String msn=aiuda[2];
            Abeja fields= new Abeja(Double.parseDouble(lat),Double.parseDouble(longi),Double.parseDouble(msn));        
            data.add(fields);
            
        }   
        //O(n)
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long actualMemUsed= afterUsedMem - beforeUsedMem;
        System.out.println("Se ocupo un total de " + actualMemUsed + " KB");
        TFin = System.currentTimeMillis();
        tiempo = TFin - TInicio;
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
        return data;
    }
    
    /**
     * Método encargado de calcular que abejas están en riesgo  de colisión
     */
    public  void colision(){
 long beforeUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
 long TInicio, TFin, tiempo;           //Para determinar el tiempo
 TInicio = System.currentTimeMillis(); //de ejecución
        int count = 0;
        for(int i = 0; i < data.size();i++){
            double a = data.get(i).getLatitud();
            double b = data.get(i).getLongitud();
            double c = data.get(i).getHNivelMar();
            for(int j = i + 1; j < data.size(); j++){
              double f = data.get(j).getHNivelMar();
              double d = data.get(j).getLatitud();
                double e = data.get(j).getLongitud();
              if(Math.sqrt(  Math.pow((a - d)*111111,2) +
                           Math.pow((b - e)*111111,2) +
                           Math.pow(c - f,2)
                        ) <= 100){ 
                System.out.println("La abeja con coordenadas " + a + ", "  + b + ", "+ c + " esta en posible riesgo de colisión con la abeja de coordenadas: " + d + ", " + e + ", " + f);
                count++;
              }
              
            }
        }
        System.out.println();
        System.out.println("En total hay " + count + " riesgos de colisión");
        //O(n^2*e^3)
        long afterUsedMem=Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
        long actualMemUsed= afterUsedMem - beforeUsedMem;
        System.out.println("Se ocupo un total de " + actualMemUsed + " KB");
        TFin = System.currentTimeMillis();
  tiempo = TFin - TInicio;
  System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);
}

/**
 * Método encargado de ejecitar los metodos de arrayListDeDatos(String archivo) y colision()
 */
public  void main(String []arg) throws IOException{
    arrayListDeDatos(archivo);
    colision();
}
}
