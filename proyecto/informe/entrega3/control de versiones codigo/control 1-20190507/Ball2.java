import java.awt.Graphics2D;
import java.awt.Rectangle;
public class Ball2 {
	private Game game;

	public Ball2(Game game) {
		this.game= game;
	}


	public void paint(Graphics2D g) {
		g.fillOval(100, 0, 100, 100);
	}
	
	public Rectangle getBounds() {
		return new Rectangle(100, 0, 100, 100);
	}
}
