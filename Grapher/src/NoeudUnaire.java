public abstract class NoeudUnaire implements Noeud {
	
	protected Noeud noeud;
	
	public NoeudUnaire() {
		
	}
	
	public NoeudUnaire(Noeud noeud) {
		this.noeud = noeud;
	}

	public Noeud getNoeud() {
		return noeud;
	}

	
	
	
	
}