package personnages;

public class Gaulois {
	
	private String nom;
	private int force;
	private int effetPotion = 1 ;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void parler(String texte) {
		String parole = prendreparole();
		System.out.println(parole + texte );
		
	}
	
	private String prendreparole() {
		return "le Gaulois" + nom + ":"; 
		
	}
	public static void main(String[] args) {
		
	}
	
}


