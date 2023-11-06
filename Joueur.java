package fr.gns.app;

import java.util.Objects;

public class Joueur {
	private int numero ;
	private String nom ;
	private String pays ;
	private int nbVictoires = 0 ; // Nombre de victoires remportées
	public Joueur( int numero , String nom , String pays ){
	super() ;
	this.numero = numero ;
	this.nom = nom ;
	this.pays = pays ;
	}
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
	@Override
	public boolean equals(Object obj) {
		if (this.getNumero() == numero)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Joueur other = (Joueur) obj;
		return nbVictoires == other.nbVictoires && Objects.equals(nom, other.nom) && numero == other.numero
				&& Objects.equals(pays, other.pays);
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
	@Override
	public String toString() {
		return "numero = " + numero + ", nom = " + nom + ", pays = " + pays + ", nbVictoires = " + nbVictoires + "\n";
	}
	
}
