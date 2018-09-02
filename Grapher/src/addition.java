
public class addition extends NoeudBinaire {
	
	public addition(Noeud fg,Noeud fd) {
		super(fg,fd);
	}
	
	public String toString() {
		return "(" + fg + "+" + fd +")";
	}

	@Override
	public double execute() {
		return getFg().execute() + getFd().execute();
	}
	

}
