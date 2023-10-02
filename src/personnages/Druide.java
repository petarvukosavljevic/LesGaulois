package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effectPotionMin;
	private int effectPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effectPotionMin, int effectPotionMax) {
		super();
		this.nom = nom;
		this.effectPotionMin = effectPotionMin;
		this.effectPotionMax = effectPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effectPotionMin + " � "
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

	public void preparerPotion() {
		Random random = new Random();
		forcePotion = random.nextInt(effectPotionMin, effectPotionMax + 1);
		if (forcePotion > 7) {
			System.out.println(" J'ai pr�par� une super potion de force " + forcePotion);
		} else {
			System.out.println(
					"Je n'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion + ".");
		}
	}

	public void booster(Gaulois gaulois) {
		nom = gaulois.getNom();
		if (nom != "Obelix") {
			System.out.println("Non, Obelix!... Tu n'aurais pas de potion magique ! ");
		}
		else {
			gaulois.boirePotion(forcePotion);
		}
	}

	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
}
