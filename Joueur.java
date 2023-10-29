package fr.gns.app;

	class Joueur implements Comparable<Joueur> {
		private int numero ;
		private String nom ;
		private String pays ;
		private int nbVictoires = 0 ;
	
	public Joueur( int numero , String nom , String pays , int nbVictoires ){
		super() ;
		this.numero = numero ;
		this.nom = nom ;
		this.pays = pays ;
		this.nbVictoires = nbVictoires ;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getNbVictoires() {
		return nbVictoires;
	}
	public void setNbVictoires(int nbVictoires) {
		this.nbVictoires = nbVictoires;
	}
	
	public String toString() {
		return "Joueur [numero=" + numero + ", nom=" + nom + ", pays=" + pays + ", nbVictoires=" + nbVictoires + "]";
	}
	
	 public boolean equals(Joueur autreJoueur) {
	        if (this == autreJoueur) {
	            return true; 
	        }

	        if (autreJoueur == null) {
	            return false; 
	        }

	        return numero == autreJoueur.numero;
	  }
	 
	 public int compareTo(Joueur autreJoueur) {
		    if (this.getNbVictoires() > autreJoueur.getNbVictoires()) {
		        return 1;
		    } else if (this.getNbVictoires() == autreJoueur.getNbVictoires()) {
		        return 0;
		    } else {
		        return -1;
		    }
	}
	 
	 
}
