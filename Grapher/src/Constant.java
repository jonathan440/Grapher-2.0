public class Constant implements Noeud {
	public double value;

	public Constant(double value) {
		this.value = value;
	}
	
	
	
	@Override
	public double execute() {
		return value;
	}
}
