package personnages;


public class Gaulois {
	
	private String nom;
	private int force ;
	private int  nbTrophees; 
	private int effetPotion = 1;
    private Equipement[] trophees = new Equipement[100];
	
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
	   
	   /*
	   private String prendreParole() {
	     return "Le gaulois " + nom + " : ";
	   }
	   */
	   
	   private String prendreParole() {
		   return "Le gaulois " + nom + " : ";
	   }
	   
	   
	   /*
	   public void frapper(Romain romain) {
	     System.out.println(nom + " envoie un grand coup dans la mâchoire de "
	           + romain.getNom());
	     romain.recevoirCoup((force/3)*effetPotion);
	   }
	   */
	   
	   public void frapper(Romain romain) {
		   System.out.println(nom + " envoie un grand coup dans la "
		   		+ "mâchoire de " + romain.getNom());
		   Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		   for (int i = 0; trophees != null && i < trophees.length; i++, nbTrophees++) {
		                  this.trophees[nbTrophees] = trophees[i];
		   }
		 }
	   
	   
	   public String toString() {
		return "Gaulois [nom = " + nom + ", force = " + force
			  + ", effetPotion = " + effetPotion + "]";
   		}
	   
	   
		public void boirePotion(int forcePotion){
			effetPotion = forcePotion;
			parler("Merci Druide, je sens que ma force est " + effetPotion +" fois décuplée.");

		}
		
		
		public void faireUneDonnation(Musee musee) {
			if (nbTrophees >0) {
				parler("  Je donne au musee tous mes trophees :");
				while (nbTrophees>0) {
					musee.donnerTrophees(this, trophees[nbTrophees]);
					System.out.println("-"+trophees[nbTrophees]);
					trophees[nbTrophees-1] = null;
					nbTrophees -=1;
				}
			}
		}
		
   	
	   public static void main(String[] args) {
	    Gaulois asterix = new Gaulois("astérix",20);
	    Musee parcAsterix = new Musee();
	    System.out.println(asterix);
		asterix.boirePotion(10);
		asterix.parler("feur");
		Romain epaule = new Romain("epaule", 5);
		epaule.sEquiper(Equipement.CASQUE);
		epaule.sEquiper(Equipement.BOUCLIER);
		asterix.frapper(epaule);
		asterix.frapper(epaule);
		asterix.frapper(epaule);
		asterix.faireUneDonnation(parcAsterix);
		System.out.println(asterix);
		System.out.println(epaule);
		String faire = "Ma pute";
		System.out.println(faire);
		faire += " pute ";
		System.out.println(faire);

		
	   } 
	}



