import java.util.HashMap;
/**
 * Dar solucion taller numero 9
 * Se recomienda hacer una clase o metodo main que instancie esta clase de manera que sirva como test
 * y desarrolle las actividades y cuestiones presentadas en el taller.
 * En esta clase se hará uso total de la clase HashMap:
 * @author Juan Andrés Arroyave Sánchez
 */
public class Taller9{
    
    /** 
    * @param value es el valor asociado a la llave key
    * El metodo agregara un nuevo valor a empresas con los atributos key y value.
    */
    public static void agregar(HashMap empresas,String key, String value){
        empresas.put(key,value);
    }
    
    /** 
    * 
    *  empresas es el hashmap ya creado donde se guardaran los valores
    * El metodo buscara el valor asociado a la llave key
    * @return true, si lo encuentra, false de lo contrario.
    */
    public static boolean buscar(HashMap empresas,String key){
       
        if(empresas.size()==0) return false;
       
        else if(empresas.size()>0) {
            int i=0;
            while(i<empresas.size()) {
             if(empresas.get(i).equals(key)) return true;   
             
                i++;
            }
            
        }
        return false;
    }

    /** 
    * El metodo nos dira si hay una llave asociado al valor value.
    * @return true, si lo encuentra, false de lo contrario.
    */
    public static boolean contieneValue(HashMap empresas,String value){
        if(!empresas.containsValue(value)) return false;
    
        return true;
    } 
}