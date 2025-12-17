/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lightoff_console;
import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class Partie {

    private GrilleDeJeu grille;
    private int nbCoups;

    /** Constructeur : crée une grille et met nbCoups à 0. */
    public Partie() {
        // tu peux changer la taille ici (n x n)
        this.grille = new GrilleDeJeu(5, 5);
        this.nbCoups = 0;
    }

    /** Initialise la partie (mélange la grille). */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(10); // 10 tours de mélange par exemple
    }

    /** Boucle principale du jeu en console. */
    public void lancerPartie() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenue dans LightOff !");
        System.out.println("Objectif : éteindre toutes les cellules.");
        System.out.println("À chaque coup, choisissez :");
        System.out.println("  1 - Ligne");
        System.out.println("  2 - Colonne");
        System.out.println("  3 - Diagonale descendante");
        System.out.println("  4 - Diagonale montante");
        System.out.println();

        System.out.println("Grille initiale :");
        System.out.println(grille);

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Nombre de coups joués : " + nbCoups);
            System.out.print("Votre choix (1:ligne, 2:colonne, 3:diag↓, 4:diag↑) : ");
            int choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.print("Numéro de ligne : ");
                    int l = sc.nextInt();
                    grille.activerLigneDeCellules(l);
                    break;
                case 2:
                    System.out.print("Numéro de colonne : ");
                    int c = sc.nextInt();
                    grille.activerColonneDeCellules(c);
                    break;
                case 3:
                    grille.activerDiagonaleDescendante();
                    break;
                case 4:
                    grille.activerDiagonaleMontante();
                    break;
                default:
                    System.out.println("Choix invalide, coup perdu !");
                    break;
            }

            nbCoups++;
            System.out.println("\nÉtat de la grille :");
            System.out.println(grille);
        }

        System.out.println("Bravo ! Toutes les cellules sont éteintes.");
        System.out.println("Vous avez gagné en " + nbCoups + " coups.");
    }
}
