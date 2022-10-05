package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("asterix", 1);
		Romain minus = new Romain("minus", 3);
		asterix.parler("bonjour a tous");
		minus.parler("Un Gau ..... UN GauGau");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		


	}

}
