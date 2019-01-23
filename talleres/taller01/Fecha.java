/**
 * La clase Fecha tiene la intención de representar el tipo abstracto fecha.
 * Aunque ya existen librerías encargadas de esta funcion:
 * En este ejercicio podemos tener una compresión más profunda de su funcionamiento interno.
 * 
 * @author Mauricio Toro, Andres Paez
 * @version 1
 */

public class Fecha {
    

    /*
    varibales con atributo final indican que una variable es de tipo 
    constante, es decir, no admitirá cambios después de su declaración y asignación de valor.
    final determina que un atributo no puede ser sobreescrito o redefinido.
    Se le asigna esta característica para evitar que se sobrescriban valores.
    tener en cuenta tipado de las 3 variables!.
    */

    private final byte dia;
    private final byte mes;
    private final int anyo;


    /**
     * Se inicializan las variables globales en el constructor de manera que no posean valores nulos o 0s.
     */
    public Fecha(byte d,byte m,int a) {
        this.dia=d;
        this.mes=m;
        this.anyo=a;
    }

    /**
     * Método para obtener la variable global dia
     */
    public int dia() {
        return dia;
    }

    /**
     * Método para obtener la variable global mes.
     */
    public int mes() {
        return mes;
    }

    /**
     * Método para obtener la variable global anio.
     */
    public int anio() {
        return anyo;
    }

    /**
     * 
    * @param otra representa la fecha con la culase va a comparar.
    *
    * El método comprar se encarga de devolvernos respuesta a tres posibilidades.
    * 1: si la fecha es menor que la otra retorna -1.
    * 2: si la fecha es igual que la otra retorna 0.
    * 3: si la fecha es mayor que la otra retorna 1.
    *
    */

    public byte comparar(Fecha otra) {
        int comp1=this.mes*10000+this.mes*100+this.dia; 
        //Sabemos que las fechas desde el año 1000 hasta el 9999 constan 
        //de 8 números.
        int comp2=otra.anio()*10000+otra.mes()*100+otra.dia();
        
        if(comp1>comp2) return 1;
        if(comp2==comp1) return 0;
        return -1;
        
        
        
    }



     /**
    * toString se encargará de convertir el tipo abstracto fecha en un tipo cadena
    * para su posterior visualización
    *
    * @return una cadena que contiene la fecha
    */
    public String toString() {
        return "La fecha es "+ dia+"/"+ mes+ "/"+ anyo ;
    }
}