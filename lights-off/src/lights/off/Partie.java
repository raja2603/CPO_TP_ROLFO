/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights.off;
import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class Partie {
    private Grille grille;
    private Joueur joueur;

    public Partie(String nomJoueur) {
        this.grille = new Grille();
        this.joueur = new Joueur(nomJoueur);
    }

    public void initialiserPartie() {
        grille.allumerAleatoirement(7);
    }

    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);
        initialiserPartie();

        System.out.println("Bienvenue " + joueur.getNom() + " dans Lights Out !");
        while (!grille.estToutEteint()) {
            System.out.println("\nEtat actuel de la grille :");
            grille.afficher();
            System.out.println("Nombre de coups : " + joueur.getNbCoups());

            System.out.print("Entrez la ligne (0-" + (Grille.TAILLE - 1) + ") : ");
            int i = sc.nextInt();
            System.out.print("Entrez la colonne (0-" + (Grille.TAILLE - 1) + ") : ");
            int j = sc.nextInt();

            grille.togglerCelluleEtVoisines(i, j);
            joueur.incrementerNbCoups();
        }

        System.out.println("\nBravo, toutes les lumières sont éteintes !");
        System.out.println("Score final de " + joueur.getNom() + " : " + joueur.getNbCoups() + " coups.");
    }
}
