package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force" + effetPotionMin + "a" + effetPotionMax + "." );
		
		
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\""  );
		// TODO Auto-generated method stub
		
	}

	private String prendreParole() {
		return "Le duide" + nom + ":";
	}


	
	
}
