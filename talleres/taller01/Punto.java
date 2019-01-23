/**
 * La clase Punto tiene la intención de representar coordenadas en el espacio y calcular su distancia.
 * 
* @author Mauricio Toro, Andres Paez
 * @version 1
 */
import java.lang.Math;
public class Punto {

    private double x, y;

    public Punto(double x, double y) {
       this.x=x;
       this.y=y;
    }

    /**
     * Método para obtener la variable global x.
     *
     * @return eje coordenado x
     */
    public double x() {
        return x;
    }

    /**
     * Método para obtener la variable global y.
     */
    public double y() {
        return y;
    }

    /**
     * Método para obtener el radio polar, en este caso se puede obtener por medio del teorema de pitágoras.
     
     */
    
    public double radioPolar() {
        //Para hallar el radio polar empleamos la siguiente expresión.
        //Sabemos que x^2+y^2=r^2.Esto se obtiene
        //Sabiendo que el punto x y el punto y más el segmento que forman 
        // Con respecto al origen forman un triángulo rectángulo
        
        return Math.sqrt((x*x)+(y*y));
        
    }


    /**
     *
     Método para obtener el ángulo polar, en este caso se puede obtener por medio de la tangente inversa.
     
      */
    public double anguloPolar() {
       //Para obtener esta relación geométrica.
       //Sabemos que debemos relacionar x con y.
       //Esto forma un triángulo rectángulo 
       //Ahora vemos qué x y y son catetos del triángulo
       //Lo que nos relaciona estos dos lados es la función tangente.
       //Tenemos tanx= co/ca
       //Despejando x obtenemos que :
       // x= (Tan)^-1(y/x)
       
       return Math.atan(y/x);
       
    }

    /**
     * Método para obtener la distacia euclidiana. La distacia
     * euclidiana o euclídea es la distancia "ordinaria" (que se mediría con una regla) entre 
     * dos puntos de un espacio euclídeo, la cual se deduce a partir del teorema de Pitágoras.
     * En otras palabras es halla el radio polar a la diferencia entre los dos puntos.
     
     * Este parámetro hace referencia a otro Punto en el espacio con es cual se desea
     * comparar el Punto desde el cual fue llamado.
     * 
     */
  
    public double distanciaEuclidiana(Punto otro) {
       //Sabemos que la distancia entre dos puntos es :
       //Raíz de (X2-X1)^2+ (y2-y1)^2
       //Sacamos la fórmula.
       
       return Math.sqrt(Math.pow(x-otro.x(), 2)+Math.pow(y-otro.y(), 2)); //Restamos las componentes de x2 y x1 y las elevamos.
 
    }
}