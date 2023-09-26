package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effectPotion = 1;

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

	public String prendreParole() {

		return "Le Gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println("" + nom + "envoi un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effectPotion);
	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effectPotion=" + effectPotion + "]";
	}
	
	public void boirPotion(int forcePotion) {
		effectPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " +  effectPotion + " fois décuplée.");
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus", 6);
		asterix.boirPotion(1);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		asterix.prendreParole();
		asterix.parler("bonjour");
		asterix.frapper(minus);
	}
}
