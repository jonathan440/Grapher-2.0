public abstract class NoeudBinaire implements Noeud{
	
	protected Noeud fg;
	protected Noeud fd;
	
	public NoeudBinaire(Noeud fg, Noeud fd) {
		this.fg = fg;
		this.fd = fd;
		
	}
	
	
	public NoeudBinaire() {
	}
	

	public Noeud getFg() {
		return fg;
	}

	public Noeud getFd() {
		return fd;
	}

	
	
	
}
