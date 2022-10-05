package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int forcePotion = 1;
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

	public void preparerPotion(int effetPotionMax){
		Random()
	}

	private String prendreParole() {
		return "Le duide" + nom + ":";
	}


	
	
}
