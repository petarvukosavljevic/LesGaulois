package personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipement = 0;
	private String texte;
	
	public Romain(String nom, int force) {
		super();
		assert (force > 0);
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
		
	
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
	
//	public void recevoirCoup(int forceCoup) {
//		assert (force > 0);
//		int debutForce = force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("Aie!!!!");
//		} else {
//			parler("J'abandonne...");
//		}
//		assert (force < debutForce);
//	}
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		// if (force > 0) {
		// parler("Aïe");
		// } else {
		// equipementEjecte = ejecterEquipement();
		// parler("J'abandonne...");
		// }
		if (force == 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}
	
	
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		return forceCoup;
	}
	
	
		private Equipement[] ejecterEquipement() {
			Equipement[] equipementEjecte = new Equipement[nbEquipement];
			System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
			//TODO
			int nbEquipementEjecte = 0;
			for (int i = 0; i < nbEquipement; i++) {
				if (equipements[i] != null) {
					equipementEjecte[nbEquipementEjecte] = equipements[i];
					nbEquipementEjecte++;
					equipements[i] = null;
				}
			}
			return equipementEjecte;
		}


	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement) {
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
	
	
	private void equipements(Equipement equipement) {
		equipements[nbEquipement] = equipement;
		nbEquipement++;
		System.out.println("Le soldat " + nom + " s'equipe d'un " + equipement + ".");
		
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus" , 6);
		minus.prendreParole();
		minus.parler("gaulois!!!");
//		minus.recevoirCoup(3);
	}
}
