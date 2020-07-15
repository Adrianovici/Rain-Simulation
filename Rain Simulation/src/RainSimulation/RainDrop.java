package RainSimulation;
import java.awt.*;
import java.util.Random;

public class RainDrop {
	private Random random = new Random();
	private int x = random.nextInt(1366);
	private int y = -random.nextInt(1000);
	private int z = random.nextInt(21) + 1;
	
	public void show(Graphics2D g) {
		g.setColor(Color.CYAN);
		g.setStroke(new BasicStroke(z / 8));
		g.drawLine(x, y, x, y + z / 2);
	}
	
	public void move() {
		this.y += z / 3;
		
		if(this.y >= 768) {
			this.y = -random.nextInt(500);
			this.x = random.nextInt(1366);
		}
	}
	
	public RainDrop() {
		// Nothing here
	}
}
