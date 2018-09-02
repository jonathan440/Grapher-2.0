package gui;

import javax.swing.JFrame;

public class GraphView extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	//Variables
	public PositionPanel positionpanel;
	public EvalPanel evalpanel;
	
	public GraphView() {
		
		setTitle("Grapher");
		setSize(800, 800);
		
		//Position Panel
		PositionPanel positionpanel;
		this.getContentPane().add(positionpanel = new PositionPanel(), "North");
		positionpanel.afficheCoord(0, 0);
		positionpanel.afficheFunc(0);
		
		//Eval Panel
		EvalPanel evalpanel;
		this.getContentPane().add(evalpanel = new EvalPanel(), "South");
		evalpanel.afficheEval();
		evalpanel.afficheText();
		evalpanel.afficheTracer();
		
		setVisible(true);
		
		
	}
}
