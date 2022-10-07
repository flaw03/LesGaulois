package histoire;

import personnages.*;

public class scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 8);
		Gaulois Obélix = new Gaulois("Obélix", 10);
		Romain minus = new Romain("minus", 6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		panoramix.booster(Obélix);
		Obélix.parler("Par Bélénos, ce n'est pas juste");
		
		panoramix.booster(asterix);
		asterix.parler("bonjour a tous");
		minus.parler("Un Gau ..... UN GauGau");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);



		


	}

}
