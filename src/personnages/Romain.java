package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		assert force <0 ;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		String parole = prendreParole();
		System.out.println(parole + " \" " + texte + " \" ");
		
	}

	private String prendreParole() {
		return "Le romain " + nom + " :";

	}
	
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0 ) {
			parler("Aie");
		} else {
			parler("J'abandonne ... ");
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("minus",-5);
		minus.parler("quoi");
	}
}
