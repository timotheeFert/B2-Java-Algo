package fr.gns.app;

public class AppComparerJoueurs {
	
	public static void main(String[] args) {
		Joueur jr1 = new Joueur(28, "Parker", "France", 30);
		Joueur jr2 = new Joueur(28, "Parker", "France", 30);
		System.out.println("Premier joueur : " + jr1);
		System.out.println("Second joueur : " + jr2);

		System.out.println(jr1==jr2);
		System.out.println(jr1.equals(jr2));
	}
}

