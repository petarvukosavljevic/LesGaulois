package personnages;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophee;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		Trophee trophee = new Trophee(gaulois, equipement);
		trophees[nbTrophee] = trophee;
		nbTrophee++;
	}
	
//	public void extraireInstructionsOCaml(Musee musee) {
//		System.out.println("let musee = [");
//		for (int i = 0; i < nbTrophee; i++) {
//			System.out.println("     " + );
//		}
//	}
	
}
