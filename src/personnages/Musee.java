package personnages;


public class Musee {
	private Trophee[] trophee = new Trophee[200] ;
	private int nbrTrophee = 0 ;
	
	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {
		trophee[nbrTrophee] = new Trophee(gaulois,equipement);
		nbrTrophee += 1;
	}
	
	public String extraireInstructionsCaml() {
		String texte = "";
		for (int i = 0; i < nbrTrophee ;i++) {
			texte += trophee[i].donnerNom() + trophee[i].getEquipement();
		}
		return texte;	
	}
}



