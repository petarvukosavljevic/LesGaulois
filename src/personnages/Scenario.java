package personnages;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.prendreParole();
		asterix.parler("Bonjour � tous");
		minus.prendreParole();
		minus.parler("UN GAU...UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
	}

}
