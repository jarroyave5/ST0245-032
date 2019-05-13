import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Analizador
{
private String archivo;
    ArrayList<Abeja> data = new ArrayList<>();
    public Analizador(String archivo){
        this.archivo=archivo;
    }
    
    public ArrayList<Abeja> arrayListDeDatos(String archivo) throws FileNotFoundException, IOException{
        String cadena=null;
        
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        
        while((cadena =b.readLine())!=null) {
            String[] aiuda=cadena.split(",");
            String lat=aiuda[0];
            String longi=aiuda[1];
            String msn=aiuda[2];
            
            Abeja fields= new Abeja(Double.parseDouble(lat),Double.parseDouble(longi),Double.parseDouble(msn));
            
            data.add(fields);
            
        }   
        return data;
    }
    
    public void comparar(){
        double resta = 0.0;
        double boca = 0.0;
        int i= 1;
         for(Abeja e:data){
             resta = e.getHNivelMar();
             for(Abeja h: data){
             boca = h.getHNivelMar() - resta;
             System.out.println(boca);
            if(Math.abs(boca) <= 100){
                System.out.println("La abeja " + i + " Esta en peligro de colision con la abeja " + (i-1));
                System.out.println("Estan a una distancia de " + Math.abs(boca));
                System.out.println();
            }
            i++;
        }
        System.out.println();
    }
}
}