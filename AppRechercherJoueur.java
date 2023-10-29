package fr.gns.app;
import java.util.ArrayList;

public class AppRechercherJoueur {
	
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
	   
	   //créer la liste des joueurs
	        List<Joueur> joueurs = new ArrayList<>();
	        joueurs.add(jr1);
	        joueurs.add(jr2);
	        joueurs.add(jr3);
	        joueurs.add(jr4);
	        joueurs.add(jr5);
	        
	        System.out.println( "index du jr1 dans cette liste: " + joueurs.indexOf(jr1) );  
	        System.out.println( "index du jr2 dans cette liste: " + joueurs.indexOf(jr2) );   
	        System.out.println( "index du jr3 dans cette liste: " + joueurs.indexOf(jr3) );   
	        System.out.println( "index du jr4 dans cette liste: " + joueurs.indexOf(jr4) );   
	        System.out.println( "index du jr5 dans cette liste: " + joueurs.indexOf(jr5) );   
	}
}
