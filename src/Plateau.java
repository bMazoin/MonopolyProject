package com.bmazoin.monopoly;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Plateau { 
	
	private static JFrame fenetre;
	private static JLabel imagePlateau;
	private static JPanel boutons;
	private static JPanel plateau;
	private static JButton btnQuitter;
	private static JButton btnCharger;
	private static JButton btnNouvellePartie;
	private static JButton btnFinDuTour;
	private static JButton btnAjouterJoueur;
	private static JButton btnVoirInfos;
	private static JButton btnSauvegarderPartie;
	static String txt = "Joueurs : ";

	
	public static void newGame() {
		JFrame fntrNvJeu = new JFrame("NOUVELLE PARTIE");
		fntrNvJeu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		fntrNvJeu.setPreferredSize(new Dimension(1200,400));
		fntrNvJeu.setAlwaysOnTop(true);
		JPanel btnNvJeu = new JPanel();
		JLabel txtNvJeu = new JLabel(txt);
		btnNvJeu.setLayout(new GridLayout(2,3));
		JButton addPlayer = new JButton("Ajouter Joueurs");
		addPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = JOptionPane.showInputDialog(fntrNvJeu, "Nom du joueur : ");
				name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
				Jeu.addPlayer(new Joueur(name));
				if(Jeu.joueurs.size() == 1) txt += name;
				else txt += ", " + name;
				txtNvJeu.setText(txt);
			}
		});
		
		btnNvJeu.add(addPlayer);
		fntrNvJeu.setLayout(new BorderLayout());
		fntrNvJeu.getContentPane().add(btnNvJeu, BorderLayout.CENTER);
		fntrNvJeu.getContentPane().add(txtNvJeu, BorderLayout.NORTH);
		fntrNvJeu.add(btnNvJeu);
		fntrNvJeu.pack();
		fntrNvJeu.setVisible(true);
	}
	
	public Plateau() {
		fenetre = new JFrame("MONOPOLY");
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		fenetre.setAlwaysOnTop(true);
		
		plateau = new JPanel();
		boutons = new JPanel();
		plateau.setLayout(new GridLayout(1,1));
		imagePlateau = new JLabel(new ImageIcon("images/plateau.png"));
		plateau.add(imagePlateau);
		
		boutons.setLayout(new GridLayout(6,2));
		
		btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resp = JOptionPane.showConfirmDialog(fenetre, "Do you want to exit ?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
				if(resp==0) System.exit(0);
			}
		});
		boutons.add(btnQuitter);
		
		btnNouvellePartie = new JButton("Nouvelle Partie");
		btnNouvellePartie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				newGame();
			}
		});
		boutons.add(btnNouvellePartie);
		
		btnFinDuTour = new JButton("Fin du tour");
		boutons.add(btnFinDuTour);
		
		btnAjouterJoueur = new JButton("Ajouter Joueur");
		boutons.add(btnAjouterJoueur);
		
		btnVoirInfos = new JButton("Voir Infos");
		btnVoirInfos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				JOptionPane.showMessageDialog(fenetre, "Joueurs\n" + "--\n" + "Solde\n");
			}
			
		});
		boutons.add(btnVoirInfos);
		
		btnCharger = new JButton("Charger Partie");
		boutons.add(btnCharger);
		
		btnSauvegarderPartie = new JButton("Sauvegarder Partie");
		boutons.add(btnSauvegarderPartie);
		
		fenetre.setLayout(new BorderLayout());
		fenetre.getContentPane().add(plateau, BorderLayout.CENTER);
		fenetre.getContentPane().add(boutons, BorderLayout.EAST);
		fenetre.pack();
		fenetre.setVisible(true);
	}
}
