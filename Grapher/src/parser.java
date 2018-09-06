import java.util.Scanner;

public class parser{
	
	public parser() {
		
	}
	public static String lectureClavier() {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		return line;
	}
	
	// gestion des parenthèses 
	
	
		public int goodIndexif(String s) {
			int nb = 0;
			for (int i = 0; i < s.length(); i++ ) {
				if(s.charAt(i) == '(') nb++;
				if(s.charAt(i) == ')' ) {
					nb -- ;
					if(nb == 0) return i;
				}
			}
			return -1;
		}
		
	
	
	public static void parsing(String expression){
		char operators[] = {'/', '*', '-', '+'};
		for(char operator : operators) {
			for(int i = 0; i < expression.length();i++) {
				if(expression.charAt(i) == operator) {
					System.out.println("FG : "+ getPreviousNumber(expression, i));
					System.out.println("FD :"+ getNextNumber(expression, i));
					double fg = getPreviousNumber(expression, i);
					double fd = getNextNumber(expression, i);
					
					if(operator  == '/') {
						Division D = new Division(new Constant(fg), new Constant(fd));
						
					}
					
					if(operator == '*') {
						Multiplication m = new Multiplication(new Constant(fg), new Constant(fd));
					}
					
					if(operator == '+') {
						addition a = new addition(new Constant(fg),new Constant(fd));
						System.out.println(""+ a.execute());
									
					}
					
					if(operator == '-') {
						Soustraction s = new Soustraction(new Constant(fg), new Constant(fd));
					}
				}
			}
		}
		
	}
	
	public Noeud buildArbre(Noeud fg, Noeud fd) {
		NoeudBinaire a = new NoeudBinaire(fg,fd);
		return a;
		
	}
	
	
	private static double getPreviousNumber(String expression, int index) 
	{
		String number = "";
		index--;
		while(index >= 0 && (Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {
			number = expression.charAt(index) + number;
			index--;
		}
		return Double.parseDouble(number);
		
	}
	
	
	private static double getNextNumber(String expression, int index) 
	{
		String number = "";
		index++;
		while(index < expression.length() &&(Character.isDigit(expression.charAt(index)) || expression.charAt(index) == '.')) {
			number = number +  expression.charAt(index);
			index++;
		}
		return Double.parseDouble(number);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String expression = lectureClavier();
		
		System.out.println("Expression saisie : "+ expression);
		parsing(expression);
		
		
	}

	

	

	
}
