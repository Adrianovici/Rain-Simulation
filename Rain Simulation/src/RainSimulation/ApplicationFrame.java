package RainSimulation;
import javax.swing.JFrame;

public class ApplicationFrame extends JFrame {
	private static final long serialVersionUID = 2084253614387256360L;

	public ApplicationFrame() {
		Animations a = new Animations();
		
		this.setTitle("Rain Simulation");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		this.setResizable(false);
		this.setVisible(true);
		
		this.add(a);
	}
}
