package GUI;

import java.awt.*;
import java.awt.event.*;
//import java.awt.geom.Line2D;
import java.awt.geom.Line2D;

import javax.swing.*;


public class Grille extends JPanel{
	
	private static final long serialVersionUID = 1L;
    public JTextField xcoord, ycoord;

	public Grille() {
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(500, 500));
		this.add(xcoord = new JTextField(10));
		this.add(ycoord = new JTextField(10));
		
		addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent me) {
				int x = me.getX();
				int y = me.getY();
				xcoord.setText("x = " + (x-500)/2);
		        ycoord.setText("y = " + (-y+350)/2);		
		   }
		});
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		double max=10;
        double min=0;

        Graphics2D g2=(Graphics2D)g;
        setBackground(Color.WHITE);
        g2.translate(getWidth()/2,getHeight()/2);
        g2.scale(3.0, 3.0);
        g2.draw(new Line2D.Double(-4*100,0,4*100,0));
        g2.draw(new Line2D.Double(0,min*100,0,-max*100));
   
	}
}