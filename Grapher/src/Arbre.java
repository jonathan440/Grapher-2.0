
public class Arbre{
	String racine;
	Noeud fg,fd;
	
	public Arbre() {
		
	}
	
	public Arbre(String racine,Noeud fg,Noeud fd) {
		this.fg = fg;
		this.fd = fd;
		this.racine = racine;
	}

	public String getRacine() {
		return racine;
	}

	public Noeud getFg() {
		return fg;
	}

	public Noeud getFd() {
		return fd;
	}

	public void setRacine(String racine) {
		this.racine = racine;
	}

	public void setFg(Noeud fg) {
		this.fg = fg;
	}

	public void setFd(Noeud fd) {
		this.fd = fd;
	}

	
	
	
}
