
public class Division extends NoeudBinaire{
	
	public Division(Noeud fg, Noeud fd) {
		super(fg,fd);
	}
	
	public String toString() {
		return "(" + fg +  "/" +  fd + ")";
	}

	@Override
	public double execute() {
		if(getFd().execute() != 0) {
			return getFg().execute() / getFd().execute();
		}
		else
			return 0;
		
	}

}
