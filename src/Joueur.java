package com.bmazoin.monopoly;

public class Joueur {
	private int solde;
	private String nomJoueur;
	private int numJoueur;
	
	public Joueur(int solde, String nomJoueur, int numJoueur) {
		this.solde = solde;
		this.nomJoueur = nomJoueur;
		this.numJoueur = numJoueur;
	}
	
	public Joueur(String nomJoueur) {
		this.solde = 0;
		this.nomJoueur = nomJoueur;
		this.numJoueur = 0;
	}

	public int getSolde() {
		return solde;
	}

	public String getNomJoueur() {
		return nomJoueur;
	}

	public int getNumJoueur() {
		return numJoueur;
	}

	public void setSolde(int solde) {
		this.solde = solde;
	}

	public void setNomJoueur(String nomJoueur) {
		this.nomJoueur = nomJoueur;
	}

	public void setNumJoueur(int numJoueur) {
		this.numJoueur = numJoueur;
	}
	
	
}
