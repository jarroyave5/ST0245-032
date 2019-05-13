
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class j
{
private String archivo;
    ArrayList<Abeja> data = new ArrayList<>();
    public j(String archivo){
        this.archivo=archivo;
    }
    
    public ArrayList<Abeja> arrayListDeDatos(String archivo) throws FileNotFoundException, IOException{
        String cadena=null;
        this.archivo = archivo;
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
        //O(n)
    }
    
    public void colision(){
        int count = 0;
        for(int i = 0; i < data.size();i++){
            double a = data.get(i).getLatitud();
            double b = data.get(i).getLongitud();
            double c = data.get(i).getHNivelMar();
            for(int j = i + 1; j < data.size(); j++){
              double f = data.get(j).getHNivelMar();
              double d = data.get(j).getLatitud();
              double e = data.get(j).getLongitud();
              if(Math.sqrt(Math.pow(c-f),2) <= 100){ 
                System.out.println("La abeja con longuitud: " + b + ", " + c + " esta en posible riesgo de colisión con la abeja de coordenadas: " + e + ", " + f);
                count++;
              }
              
            }
        }
        System.out.println();
        System.out.println("En total hay " + count + " riesgos de colisión");
        //O(n) + O(n-1)
}


}