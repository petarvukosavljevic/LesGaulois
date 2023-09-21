package personnages;

public class Druide {
	private String nom;
	private int effectPotionMin;
	private int effectPotionMax;

	public Druide(String nom, int effectPotionMin, int effectPotionMax) {
		super();
		this.nom = nom;
		this.effectPotionMin = effectPotionMin;
		this.effectPotionMax = effectPotionMax;
		parler("Bonjour, je suis le druide" + nom + " et ma potion peut aller d'une force " + effectPotionMin + "à"
				+ effectPotionMax + ".");

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

	private String prendreParole() {

		return "Le druide " + nom + " : ";
	}
}
