package com.bmazoin.monopoly;

public class Carte {
	protected int numCarte;
	protected String nomCarte;
	protected boolean bonus;
	
	public Carte(int numCarte, String nomCarte) {
		this.numCarte = numCarte;
		this.nomCarte = nomCarte;
		bonus = true;
	}

}