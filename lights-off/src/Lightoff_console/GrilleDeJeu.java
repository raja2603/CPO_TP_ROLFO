/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lightoff_console;
import java.util.Random;

/**
 *
 * @author enzoa
 */
public class GrilleDeJeu {

    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /** Constructeur : crée une grille p_nbLignes x p_nbColonnes éteinte. */
    public GrilleDeJeu(int p_nbLignes, int p_nbColonnes) {
        this.nbLignes = p_nbLignes;
        this.nbColonnes = p_nbColonnes;
        this.matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /** Éteint toutes les cellules de la grille. */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindreCellule();
            }
        }
    }

    /** Active (inverse) toutes les cellules d'une ligne donnée. */
    public void activerLigneDeCellules(int idLigne) {
        if (idLigne < 0 || idLigne >= nbLignes) return;
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].activerCellule();
        }
    }

    /** Active (inverse) toutes les cellules d'une colonne donnée. */
    public void activerColonneDeCellules(int idColonne) {
        if (idColonne < 0 || idColonne >= nbColonnes) return;
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].activerCellule();
        }
    }

    /** Active la diagonale descendante (0,0) → (n-1,n-1). */
    public void activerDiagonaleDescendante() {
        int n = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < n; i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    /** Active la diagonale montante (n-1,0) → (0,n-1). */
    public void activerDiagonaleMontante() {
        int n = Math.min(nbLignes, nbColonnes);
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            matriceCellules[i][j].activerCellule();
        }
    }

    /**
     * Active aléatoirement soit une ligne, soit une colonne, soit une diagonale.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(4); // 0: ligne, 1: colonne, 2: diag desc, 3: diag mont

        switch (choix) {
            case 0:
                int ligne = rand.nextInt(nbLignes);
                activerLigneDeCellules(ligne);
                break;
            case 1:
                int colonne = rand.nextInt(nbColonnes);
                activerColonneDeCellules(colonne);
                break;
            case 2:
                activerDiagonaleDescendante();
                break;
            case 3:
                activerDiagonaleMontante();
                break;
        }
    }

    /**
     * Mélange la matrice à partir d'un plateau éteint, en effectuant nbTours
     * activations aléatoires.
     */
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules();
        for (int i = 0; i < nbTours; i++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /** Retourne true si toutes les cellules sont éteintes. */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (!matriceCellules[i][j].estEteint()) {
                    return false;
                }
            }
        }
        return true;
    }

    /** Affichage texte de la grille avec indices. */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Ligne d'en-tête des colonnes
        sb.append("   ");
        for (int j = 0; j < nbColonnes; j++) {
            sb.append("| ").append(j).append(" ");
        }
        sb.append("|\n");

        // Séparateur
        sb.append("---");
        for (int j = 0; j < nbColonnes; j++) {
            sb.append("----");
        }
        sb.append("-\n");

        // Lignes de la grille
        for (int i = 0; i < nbLignes; i++) {
            sb.append(" ").append(i).append(" ");
            for (int j = 0; j < nbColonnes; j++) {
                sb.append("| ").append(matriceCellules[i][j].toString()).append(" ");
            }
            sb.append("|\n");
            sb.append("---");
            for (int j = 0; j < nbColonnes; j++) {
                sb.append("----");
            }
            sb.append("-\n");
        }

        return sb.toString();
    }
    public CelluleLumineuse getCellule(int i, int j) {
        return matriceCellules[i][j];
    }
}
