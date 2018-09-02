
public class Multiplication extends NoeudBinaire {
	public Multiplication(Noeud fg, Noeud fd) {
		super(fg,fd);
	}
	
	public String toString() {
		return "(" + fg + "*" + fd + ")";
	}

	@Override
	public double execute() {
		return getFg().execute() * getFd().execute();
	}
	
	
}
