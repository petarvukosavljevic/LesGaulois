package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees;
	private int effectPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

//	public String prendreParole() {
//
//		return "Le Gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}


//	public void frapper(Romain romain) {
//		System.out.println("" + nom + " envoi un grand coup dans la machoire de " + romain.getNom());
//		romain.recevoirCoup((force / 3)*effectPotion);
//	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophee = romain.recevoirCoup((force / 3) * effectPotion);
		for (int i = 0; trophee != null && i < trophee.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = trophee[i];
		}
	}


	
	public void boirePotion(int forcePotion) {
		effectPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " +  effectPotion + " fois d�cupl�e.");
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.boirePotion(1);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("bonjour");
		asterix.frapper(minus);
	}
}
