package fr.gns.app;

public class ComparateurNbVictoires {

	public static void main(String[] args) {
		Joueur jr1 = new Joueur(28, "Parker1", "France", 11);
		Joueur jr2 = new Joueur(28, "Parker2", "France", 5);
		Joueur jr3 = new Joueur(28, "Parker3", "France", 258);
		Joueur jr4 = new Joueur(28, "Parker4", "France", 27);
		Joueur jr5 = new Joueur(28, "Parker5", "France", 9);
		
		System.out.println("Premier joueur : " + jr1);
		System.out.println("Deuxieme joueur : " + jr2);
		System.out.println("Troisieme joueur : " + jr3);
		System.out.println("Quatrieme joueur : " + jr4);
		System.out.println("Cinquieme joueur : " + jr5);
		
		Joueur joueurAvecMoinsDeVictoires = null;

        // Traiter les joueurs un par un et mettre à jour le joueur avec le moins de victoires
		   joueurAvecMoinsDeVictoires = comparerJoueur(joueurAvecMoinsDeVictoires, jr1);
	     joueurAvecMoinsDeVictoires = comparerJoueur(joueurAvecMoinsDeVictoires, jr2);
	     joueurAvecMoinsDeVictoires = comparerJoueur(joueurAvecMoinsDeVictoires, jr3);
	     joueurAvecMoinsDeVictoires = comparerJoueur(joueurAvecMoinsDeVictoires, jr4);
	     joueurAvecMoinsDeVictoires = comparerJoueur(joueurAvecMoinsDeVictoires, jr5);
        
	   System.out.println( "Joueur avec le moins de victoires : " + joueurAvecMoinsDeVictoires.getNom() + " avec " + joueurAvecMoinsDeVictoires.getNbVictoires() + " victoires" );
	   
	    }
         
	   //implementation de comparerJoueur
	public static Joueur comparerJoueur(Joueur joueurActuel, Joueur nouveauJoueur) {
        if (joueurActuel == null || nouveauJoueur.getNbVictoires() < joueurActuel.getNbVictoires()) {
            return nouveauJoueur;
        }
        return joueurActuel;
	}
	
}
