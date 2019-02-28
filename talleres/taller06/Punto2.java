import java.util.ArrayList;
import java.util.Scanner;

/*
 * @author Juan Andrés Arroyave y Gustavo López 
 * @version 26/02/2019
 */
public class Punto2
{
    ArrayList <Integer> ListaDeAlmacenamiento=new ArrayList<>(); //Variable global que servirá para guardar los datos en ella misma.
    public  void AñadirElementos () {     
        
        Scanner sn= new Scanner(System.in); //Este scanner servirá para leer el número de elementos que la persona quiera.
        int num;  //Variable entera que luego servirá para guardar todos los valores en el ArrayList.
        
        System.out.println("Introduce los números que quieras. \n si quieres parar introduce -1"); 
        num=sn.nextInt();
        while(num!=-1) {
        ListaDeAlmacenamiento.add(0,num);
        System.out.println("Siga...");
        num=sn.nextInt();
        
        
        }
        
        for(int i=0;i<ListaDeAlmacenamiento.size();i++) {
            
            System.out.print( "[" + ListaDeAlmacenamiento.get(i) + "]");
            
            
        }
        
        System.out.println("El primer elemento del ArrayList es : " + ListaDeAlmacenamiento.get(0));
        System.out.println("El último elemento del ArrayList es :" + ListaDeAlmacenamiento.get(ListaDeAlmacenamiento.size()-1));
}

    public static void main(String[] args) {
        
        Punto2 prueba = new Punto2();
        
        
        prueba.AñadirElementos();
    }
}