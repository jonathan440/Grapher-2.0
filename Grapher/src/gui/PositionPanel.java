package gui;

import java.awt.*;
import javax.swing.*;


public class PositionPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	private JLabel func, coord;
	
	public PositionPanel() {
		this.setBackground(Color.gray);
		this.setLayout(new GridLayout(1,2));
		this.add(coord = new JLabel());
		this.add(func = new JLabel());
	}
	
	public void afficheCoord(int x, int y) {
		coord.setText("x = " + x + " y = " + y);
	}
	
	public void afficheFunc(int z) {
		func.setText("f(x) = " + z);
	}

}
