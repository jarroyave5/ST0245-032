import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class Sistema extends JFrame{

	
    public Sistema() {
        setSize(2000,2000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
          setVisible(true);
    }
    
    @Override
    public void paint(Graphics g) {
        int x = 0;
        for(int i = 1; i<=5; i++) {
                Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.fillOval(x, 0, 100, 100);
		x = x+201;
		
               }
               
        x = 0;       
        for(int i = 1; i<=5; i++) {
                Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.RED);
		g2d.fillOval(x, 200, 100, 100);
		x = x+201;
               }
            }

	public static void main(String a[]){
         new Sistema();
     }
}