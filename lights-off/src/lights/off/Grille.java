/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights.off;
import java.util.Random;

/**
 *
 * @author enzoa
 */
public class Grille {
    private CelluleLumineuse[][] cellules;
    public static final int TAILLE = 5;

    public Grille() {
        cellules = new CelluleLumineuse[TAILLE][TAILLE];
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                cellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    public void allumerAleatoirement(int nbCellules) {
        Random r = new Random();
        for (int k = 0; k < nbCellules; k++) {
            int i = r.nextInt(TAILLE);
            int j = r.nextInt(TAILLE);
            cellules[i][j].allumer();
        }
    }

    public void togglerCelluleEtVoisines(int ligne, int colonne) {
        changerSiValide(ligne, colonne);         // la cellule
        changerSiValide(ligne - 1, colonne);     // haut
        changerSiValide(ligne + 1, colonne);     // bas
        changerSiValide(ligne, colonne - 1);     // gauche
        changerSiValide(ligne, colonne + 1);     // droite
    }

    private void changerSiValide(int i, int j) {
        if (i >= 0 && i < TAILLE && j >= 0 && j < TAILLE) {
            cellules[i][j].changerEtat();
        }
    }

    public boolean estToutEteint() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                if (cellules[i][j].estAllumee()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void afficher() {
        for (int i = 0; i < TAILLE; i++) {
            for (int j = 0; j < TAILLE; j++) {
                System.out.print(cellules[i][j] + " ");
            }
            System.out.println();
        }
    }
}
