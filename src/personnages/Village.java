package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageoisMaximum;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.nbVillageoisMaximum = nbVillageoisMaximum;
		villageois = new Gaulois[nbVillageoisMaximum];	
	}
	
	public void setChef(Chef chef) {
		this.chef = chef; 
		
	}

	public void ajouterHabitant(Gaulois legaulois) {
		if (nbVillageois >= nbVillageoisMaximum) {
			System.out.println("Deso mon khey le village est remplie");
		}
		else {
		villageois[nbVillageois] = legaulois;
		nbVillageois +=1;
			}
	}
		
	
	public Gaulois trouverHabitant(int numGaulois) {
		return villageois[numGaulois];
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 30 
		// car le tebleau est depasser
		
	}
	
	public String getNom() {
		return nom;
	}
	

	
	public void afficherVillageois() {
		System.out.println(chef.getNom());
		for (int i = 0;i <  nbVillageois ; i++) {
			System.out.println("- " + villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		Chef Abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(Abraracourcix);
		Gaulois asterix = new Gaulois("asterix", 8);
		village.ajouterHabitant(asterix);
		//Gaulois gaulois = village.trouverHabitant(1);
	    //System.out.println(gaulois); reponse null car a l'indice 1 le tableau n'as pas de variable
		Gaulois obelix = new Gaulois("obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
	}
}
