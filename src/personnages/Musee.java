package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		Trophee trophee = new Trophee(gaulois, equipement);
		trophees[nbTrophee] = trophee;
		nbTrophee++;
	}
	
	
}
