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
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + "." );
		
		
	}
	
	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "\"" + texte + "\""  );
		
	}

	public void preparerPotion(){
		Random random = new Random();
		forcePotion = random.nextInt(effetPotionMin, effetPotionMax);
		if (forcePotion > 7){
			parler(" J'ai préparé une super potion de force " + forcePotion + ".");
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est\n seulement de force " + forcePotion);
		}
	}

	private String prendreParole() {
		return "Le duide" + nom + ":";
	}

	public void booster(Gaulois leGaulois) {

		if (leGaulois.getNom() == "Obélix"){
			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
		}
		else{
			leGaulois.boirePotion(forcePotion);
		}
		
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("panoramix", 5, 11);
		panoramix.preparerPotion();

	}
}
