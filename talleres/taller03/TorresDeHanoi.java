/**
 * Hannoi recursivo
 * 
 * @author Juan Andrés Arroyave y Gustavo Lopez
 * @version 1
 */
public class TorresDeHanoi
{
  
    
    public static void torresDeHanoi(int n) {
        torresDeHanoiAux(n, 1, 2, 3);
    }

 
    private static void torresDeHanoiAux(int n, int origen, int intermedio, int destino) {
        if(n==1){
            System.out.println("Disk "+n+" from "+origen+" to "+destino);
        }else{
            torresDeHanoiAux(n-1, origen, destino, intermedio);
            System.out.println("Disk  "+n+ "from "+origen+"to  "+destino);
            torresDeHanoiAux(n-1, intermedio, origen, destino);
        }
    }
}