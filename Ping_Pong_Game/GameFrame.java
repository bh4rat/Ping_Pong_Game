import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	GamePannel panel;
	
	GameFrame(){
		panel = new GamePannel();
		this.add(panel);
		this.setTitle("**** PING PONG ****");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
