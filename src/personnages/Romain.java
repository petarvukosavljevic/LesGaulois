package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipment[] equipements;
	private int nbEquipements = 0;
	
	public Romain(String nom, int force) {
		super();
		assert (force > 0);
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipment[2];
		
	
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	public String prendreParole() {
		
		return "Le Romain " + nom + " : ";
	}
	
	public void recevoirCoup(int forceCoup) {
		assert (force > 0);
		int debutForce = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aie!!!!");
		} else {
			parler("J'abandonne...");
		}
		assert (force < debutForce);
	}
	
	public void sEquiper(Equipment equipement) {
		switch(nbEquipements) {
			case 2: {
				System.out.println("Le soldat " + nom + " est deja bien protege!");
				break;
			}
			case 1: {
				if (equipements[0] == equipement) {
					System.out.println("Le soldat " + nom + " possede deja un " + 
							equipement + " !");
					break;
				} else {
					equipements(equipement);
					break;
				}
			}
			default : {
				equipements(equipement);
				break;
			}
		}
	}
	
	
	private void equipements(Equipment equipements) {
//		equipements[nbEquipements] = equipements;
		nbEquipements++;
		System.out.println("Le soldat " + nom + " s'equipe d'un " + equipements + ".");
		
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus" , 6);
		minus.prendreParole();
		minus.parler("gaulois!!!");
		minus.recevoirCoup(3);
	}
}
