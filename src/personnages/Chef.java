package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effectPotion = 1;
	private Village village;
	
	
	public Chef(String nom, int force, int effectPotion, Village village) {
		super();
		this.nom = nom;
		this.force = force;
		this.effectPotion = effectPotion;
		this.village = village;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

	private String prendreParole() {
		return "Le chef " + nom +  "du village " + village.getNom() + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println("" + nom + "envoi un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}
		
}
