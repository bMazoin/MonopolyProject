package com.bmazoin.monopoly;

import java.util.ArrayList;

public class Jeu {
	
	public static ArrayList<Joueur> joueurs;
	
	public static void addPlayer(Joueur j) {
		joueurs.add(j);
	}
	
	public void clearPlayer() {
		joueurs.clear();
	}
	
	public static void main(String [] args) {
		Plateau plateau = new Plateau();
		joueurs = new ArrayList<Joueur>();
	}
}
