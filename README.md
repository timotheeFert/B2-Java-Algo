# DM Java – Collections et algorithmes

Question 1.2/ Lors de l'évaluation de cette expression, le résultat retourné est "false" car l'opérateur "==" ne compare pas le contenue mais les références des objets qui sont bien différentes.

Question 1.3/ Lors de l'évaluation de cette expression, le résultat retourné est "false" puisque les 2 joueurs sont différents.

Question 1.6/ Rien n'a changé depuis la question 1.2, le résultat est donc le même.

Question 1.7/ Lors de l'évaluation de cette expression, le résultat retourné est "false" puisque la méthode equals a été surchargé et compare les numero des joueurs qui eux, sont identiques.

Question 1.9/ La methode permet de vérifier quel joueur a le plus de victoire.

Question 2.2/ 

System.out.println( "\nListe triée :\n" ) ; Collections.sort(joueurs, Comparator.comparingInt(Joueur::getNbVictoires)); System.out.println( joueurs ) ; 

	System.out.println( "\nCelui qui a remporté le moins de victoires :\n" );
	System.out.println(joueurs.get(0));

Question 2.3/

public static void sort(List joueurs) {

Collections.sort(joueurs, Comparator.comparingInt(Joueur::getNbVictoires));

}
Question 2.5/

AppTrierParNbVictoires :

public class AppTrierParNbVictoires { ...

 ComparateurNbVictoires comp1 = new ComparateurNbVictoires() ; 
		int comparaison = comp1.compare(joueurs.get(2), joueurs.get(1));
		System.out.println(comparaison);
}
ComparateurNbVictoires :

public int compare(Joueur o1, Joueur o2) { if (o1.getNbVictoires() > o2.getNbVictoires()) { return 1; } else if (o1.getNbVictoires() == o2.getNbVictoires()) { return 0; } else { return -1; } }

Question 3.2/ La méthode Indexof ne fonctionne pas puisqu'elle a besoin de la méthode equals pour fonctionner. Il suffit d'ajouter cette méthode pour que la méthode renvoie l'indice demandé.

question 3.4/ La méthode Indexof ne fonctionne pas car la méthode equals ne marche pas, on la regenère automatiquement et la fonction Indexof foctionne bien.
