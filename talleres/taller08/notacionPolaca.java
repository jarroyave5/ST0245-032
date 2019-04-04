import java.util.*;
public class notacionPolaca{
    Stack<String> pila = new Stack<String>();
    int size = 0;
    String sum = "+";
    String rest = "-";
    String mult = "*";
    String div = "/";
    int result = 0;
    String str ="";
    String str2="";
    String a = "";
    String b ="";
    int temp = 0;
    public void insertar(String num){
        pila.push(num);
        size++;
    }
        
     public void imprimir(){
         System.out.println(pila.pop());
         str = pila.pop();
         temp = Integer.parseInt(pila.pop());
         while(!pila.empty()){
            System.out.println(pila.pop());
            char car = pila.pop().charAt(0);
                if(Character.isDigit(car)) {
                    str = pila.pop();
                    result = Integer.parseInt(pila.pop());
            }
                else if(pila.pop() == mult) {
                    result = temp * result;
                    temp = result;
                    System.out.println(result);
                }
                else if(pila.pop() == sum) {
                    result = temp + result;
                    temp = result;
                    System.out.println(result);
                }
                else if(pila.pop() == rest) {
                    result = temp - result;
                    temp = result;
                    System.out.println(result);
                }
                else if(pila.pop() == div) {
                    result = temp / result;
                    temp = result;
                    System.out.println(result);
                }
        }
    }
}