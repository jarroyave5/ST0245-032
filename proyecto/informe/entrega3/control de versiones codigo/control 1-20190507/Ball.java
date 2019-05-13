import java.awt.Graphics2D;
import java.awt.Rectangle;
public class Ball {
	private Game game;

	public Ball(Game game) {
		this.game= game;
	}


	public void paint(Graphics2D g) {
		g.fillOval(0, 0, 100, 100);
	}
	
	private boolean collision() {
		return game.ball2.getBounds().intersects(getBounds());
	}
	
	public Rectangle getBounds() {
		return new Rectangle(0, 0, 100, 100);
	}
}
