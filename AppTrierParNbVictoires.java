import java.util.ArrayList;

public class AppTrierParNbVictoires {

	public static void main(String[] args) {
		Joueur jr1 = new Joueur(28, "Parker1", "France", 20);
		Joueur jr2 = new Joueur(28, "Parker2", "France", 16);
		Joueur jr3 = new Joueur(28, "Parker3", "France", 28);
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
	   
	   //créer la liste des joueurs
	        List<Joueur> joueurs = new ArrayList<>();
	        joueurs.add(jr1);
	        joueurs.add(jr2);
	        joueurs.add(jr3);
	        joueurs.add(jr4);
	        joueurs.add(jr5);
	        
	   //trier la liste 
	        Collections.sort( joueurs );
	   //retourner la liste triée
	        for (Joueur joueur : joueurs) {
	            System.out.println(joueur.getNom() + " - Victoires : " + joueur.getNbVictoires());
	        }
	    }
         
	   //comparer les joueurs pour trouver lequel a le moins de victoires
	public static Joueur comparerJoueur(Joueur joueurActuel, Joueur nouveauJoueur) {
        if (joueurActuel == null || nouveauJoueur.getNbVictoires() < joueurActuel.getNbVictoires()) {
            return nouveauJoueur;
        }
        return joueurActuel;
	}
	
}
