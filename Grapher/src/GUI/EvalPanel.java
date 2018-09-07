package GUI;


import java.awt.*;
import javax.swing.*;


public class EvalPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	public JLabel eval;
	public JTextField function; 
	public JButton tracer;
	
	public EvalPanel(){
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(0,60));
		this.setLayout(new GridLayout(1,3));
		this.add(eval = new JLabel());
		this.add(function = new JTextField());
		this.add(tracer = new JButton());
		
	}
	
	public void afficheEval() {
		eval.setText("Entrer votre fonction f(x) : ");
	}
	
	public void afficheTracer() {
		tracer.setText("Tracer");
	}

}