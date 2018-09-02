package eval;


public class NoeudBinaire{
	
	int operateur;
	NoeudBinaire gauche;
	NoeudBinaire droit;
	
	NoeudBinaire(int operateur){
		this.operateur = operateur;
		gauche = null;
		droit = null;
	}
	
	public void setoperateur(int operateur) {
		this.operateur = operateur;
	}
	
	public int getoperateur() {
		return operateur;	
	}
	
	public void setgauche(NoeudBinaire gauche) {
		this.gauche = gauche;
	}
	
	public NoeudBinaire getgauche() {
		return gauche;
	}
	
	public void setdroit(NoeudBinaire droit) {
		this.droit = droit;
	}
	
	public NoeudBinaire getdroit() {
		return droit;
	}
}
