package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		super();
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void ajouterHabitant(Gaulois gaulois) {
		if (nbVillageois < villageois.length) {
			villageois[nbVillageois] = gaulois;
			nbVillageois += 1;
		} else {
			System.out.println("Village est plein!");
		}
	}

	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans vilalge du chef " +  chef.getNom() + "vivent les legendaires gaulois");
		int i = 0;
		while (villageois[i] != null) {
			System.out.println("- " + villageois[i].getNom());
			i++;
		}
	}

	public String getNom() {
		return nom;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibels",  30);
//		Gaulois gaulois = village.trouverHabitant(30);
//		On obtient en error parce que la longeur 30 va jusqu'a 29 parce que on commence de 0

		Chef abraracourcix = new Chef("Abraracourcix", 6, village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		village.ajouterHabitant(asterix);
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		Le code r'envoi null car il n'y a pas de villageois sur indice 1
//		Le premier est sur 0
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

	}

}
