import java.util.*;
/**
 * Write a description of class sqx here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class neveras
{
    Stack<String> pila = new Stack<String>();
    Stack<String> pila2 = new Stack<String>();
    String str = "";
    int codigo;
public void insertarNevera (String codigo){
    pila.push(codigo);
}

public void Tienda(String tienda){
    
    pila2.push(tienda);
    
}

public void mostrarPedido() {
    while(!pila.empty() && !pila2.empty()){
        System.out.println(pila2.pop() + ": nevera " + pila.pop());
    }
}
              
}
