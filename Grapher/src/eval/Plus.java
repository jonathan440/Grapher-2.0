package eval;


public class Plus extends NoeudBinaire {
	
	public Plus(NoeudBinaire gauche, NoeudBinaire droit) {
		super(gauche, droit);
	}
	
	public String toString() {
		return ("gauche" + "droit");
	}
	

}