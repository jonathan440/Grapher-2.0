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
		for(int i = 0; i < expression.length();i++) {
			if(expression.charAt(i) == '+') {
				System.out.println("Noeud Binaire");
				System.out.println("Racine :" + expression.charAt(i));
				System.out.println("Fg : " + expression.charAt(i -1));
				System.out.println("Fd : " + expression.charAt(i + 1));
				
				
			}
			
			if(expression.charAt(i)== '-') {
				System.out.println("Noeud Binaire");
			}
			
			if(expression.charAt(i) == '*') {
				System.out.println("Noeud Binaire");
			}
			if(expression.charAt(i) == '/') {
				System.out.println("Noeud Binaire");
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String expression = lectureClavier();
		
		System.out.println("Expression saisie : "+ expression);
		
		parsing(expression);
		
		
	}

	



	
}
