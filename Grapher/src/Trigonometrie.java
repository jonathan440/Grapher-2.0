
public class Trigonometrie extends NoeudUnaire {
	
	Noeud noeud;
	
	public Trigonometrie(Noeud noeud) {
		super(noeud);
	}

	@Override
	public double execute() {
		// TODO Auto-generated method stub
		return getNoeud().execute();
	}
	
	public String toString() {
		return "Trigo("  + noeud +")";
		
	}
	
	//
	
	
	public double cos() {
		double val = Math.cos(noeud.execute());
		return val;
	}
	
	public double sin() {
		double val = Math.sin(noeud.execute());
		return val;
	}
	
	public double log() {
		double val = Math.log(noeud.execute());
		return val;
	}
	
	public double exp() {
		double val = Math.exp(noeud.execute());
		return val;
	}
}
