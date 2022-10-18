package personnages;

public class Musee {
	private Trophee[] trophee = new Trophee[200] ;
	private int nbrTrophee = 0 ;
	
	public void donnerTrophees(Gaulois gauloi, Equipement equipement) {
		trophee[nbrTrophee] = new Trophee(gauloi,equipement);
		nbrTrophee += 1;
	}
}
