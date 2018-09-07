package GUI;

import javax.swing.JFrame;
import java.awt.*;

public class GraphView extends JFrame{
	
	private static final long serialVersionUID = 1L;

	//private static final LayoutManager JPanel = null;
	
	//Variables
	public PositionPanel positionpanel;
	public EvalPanel evalpanel;
	public ActionPanel actionpanel;
	public Grille grille;
	
	
	public GraphView() {
		
		//Eval Panel
		EvalPanel evalpanel;
		this.getContentPane().add(evalpanel = new EvalPanel(), "South");
		evalpanel.afficheEval();
		//evalpanel.afficheText();
		evalpanel.afficheTracer();
		
		//Action Panel
		ActionPanel actionpanel;
		this.getContentPane().add(actionpanel = new ActionPanel(), "West");
		actionpanel.affichexmin();
		actionpanel.affichexmax();
		actionpanel.afficheymin();
		actionpanel.afficheymax();
		actionpanel.afficheZoomp();
		actionpanel.afficheZoomn();
		actionpanel.afficherefresh();
		
		//Grille
		//Grille grille;
		this.getContentPane().add(grille = new Grille(), "Center" );
		
		setTitle("Grapher");
		setPreferredSize(new Dimension(800, 800));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      	pack();
		setVisible(true);
	}
}