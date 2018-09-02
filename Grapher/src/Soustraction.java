
public class Soustraction extends NoeudBinaire {
	
	public Soustraction(Noeud fd, Noeud fg) {
		super(fd,fg);
		
	}
	
	public String toString() {
		return "("+ fg + " - " + fd + ")";
	}

	@Override
	public double execute() {
		// TODO Auto-generated method stub
		return getFg().execute() - getFd().execute();
	}

}
