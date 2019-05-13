import javax.swing.*;
import java.awt.*;

public class TestFiguras extends JFrame{
     public TestFiguras(){
          setSize(400,400);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          setLocationRelativeTo(null);
          setVisible(true);
     }

     public static void main(String a[]){
         new TestFiguras();
     }

     public void paint(Graphics g){
          g.drawOval(40, 40, 60, 60); //Dibuja un circulo
          g.drawRect(80, 30, 200, 200); // Dibuja un cuadrado
          g.drawRect(200, 100, 100, 200); // Dibuja un rectángulo
     }
}
