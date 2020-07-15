package RainSimulation;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Animations extends JPanel implements ActionListener {
	private static final long serialVersionUID = -2284342525787876283L;
	
	int drops = 750;
	RainDrop[] drop = new RainDrop[drops];
	
	Timer timer = new Timer(1, this);
	
	Animations() {
		this.setBackground(Color.DARK_GRAY);
		
		for(int i = 0; i < drops; i ++)
			drop[i] = new RainDrop();
		
		timer.start();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		for(int i = 0; i < drops; i ++) {
			drop[i].move();
			drop[i].show(g2);
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		repaint();
	}
}
