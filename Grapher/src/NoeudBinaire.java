public abstract class NoeudBinaire implements Noeud{
	
	protected Noeud fg;
	protected Noeud fd;
	
	public NoeudBinaire(Noeud fg, Noeud fd) {
		this.fg = fg;
		this.fd = fd;
	}

	public Noeud getFg() {
		return fg;
	}

	public Noeud getFd() {
		return fd;
	}

	public void setFg(Noeud fg) {
		this.fg = fg;
	}

	public void setFd(Noeud fd) {
		this.fd = fd;
	}
	
	
}
