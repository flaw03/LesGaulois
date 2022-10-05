package personnages;


public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	   public Gaulois(String nom, int force) {
	     this.nom = nom;
	     this.force = force;
	   }
	   public String getNom() {
	     return nom;
	   }
	   public void parler(String texte) {
	     System.out.println(prendreParole() + "« " + texte + " »");
	   }
	   private String prendreParole() {
	     return "Le gaulois " + nom + " : ";
	   }
	   public void frapper(Romain romain) {
	     System.out.println(nom + " envoie un grand coup dans la mâchoire de "
	           + romain.getNom());
	     romain.recevoirCoup((force/3)*effetPotion);
	   }

	   public String toString() {
		return "Gaulois [nom = " + nom + ", force = " + force
			  + ", effetPotion = " + effetPotion + "]";
   		}

		public void boirePotion(int forcePotion){
			effetPotion = forcePotion;
			parler("Merci Druide, je sens que ma force est " + effetPotion +" fois décuplée.");

		}
   	
	   public static void main(String[] args) {
	     Gaulois asterix = new Gaulois("astérix", 1);
	     System.out.println(asterix);
		asterix.parler("feur");
		Romain epaule = new Romain("epaule", 0);
		asterix.frapper(epaule);
		System.out.println(asterix);
		asterix.boirePotion(5);
	   } 
	}



