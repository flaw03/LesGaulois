package histoire;

import personnages.*;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois Obélix = new Gaulois("Obélix", 10);
		Romain minus = new Romain("minus", 6);
		Romain milexcus = new Romain("Milexcus",8);
		Druide panoramix = new Druide("Panoramix",5,10);
		
		panoramix.parler("Je vais préparer une petite potion ...");
		panoramix.preparerPotion();
		panoramix.booster(Obélix);
		Obélix.parler("Par Bélénos, ce n'est pas juste");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		milexcus.sEquiper(Equipement.CASQUE);
		
		minus.parler("Un Gau ..... UN GauGau");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		
		milexcus.parler("Un Gau ..... UN GauGau");
		asterix.frapper(milexcus);




		


	}

}
