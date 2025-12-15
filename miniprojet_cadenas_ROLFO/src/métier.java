/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author enzoa
 */
public class métier {
    
public class Cadenas {

    private final int tailleCode = 4;
    private final int maxTentatives = 5;

    private int[] codeSecret;
    private int[] proposition;
    private int nbTentatives;
    private boolean gagne;
    private boolean fini;

    public Cadenas() {
        genererCode();
    }

    // Génère un nouveau code et réinitialise la partie
    public void genererCode() {
        codeSecret = new int[tailleCode];
        Random r = new Random();      // génération pseudo-aléatoire [web:57]
        for (int i = 0; i < tailleCode; i++) {
            codeSecret[i] = r.nextInt(10);   // chiffres 0..9
        }
        proposition = new int[tailleCode];
        nbTentatives = 0;
        gagne = false;
        fini = false;
    }

    // Enregistre une nouvelle proposition
    public void setProposition(int[] prop) {
        if (prop == null || prop.length != tailleCode) {
            throw new IllegalArgumentException("Proposition invalide");
        }
        this.proposition = prop.clone();
    }

    // Compare proposition et code secret
    public Resultat testerProposition() {
        if (fini) {
            return new Resultat(0, 0, 0, nbTentatives, gagne, true);
        }

        nbTentatives++;

        int nbExact = 0;
        int nbHaut = 0;
        int nbBas = 0;

        for (int i = 0; i < tailleCode; i++) {
            if (proposition[i] == codeSecret[i]) {
                nbExact++;
            } else if (proposition[i] > codeSecret[i]) {
                nbHaut++;
            } else {
                nbBas++;
            }
        }

        if (nbExact == tailleCode) {
            gagne = true;
            fini = true;
        } else if (nbTentatives >= maxTentatives) {
            fini = true;
        }

        return new Resultat(nbExact, nbHaut, nbBas, nbTentatives, gagne, fini);
    }

    public boolean estGagne() {
        return gagne;
    }

    public boolean estFini() {
        return fini;
    }

    public int getNbTentatives() {
        return nbTentatives;
    }

    public int getMaxTentatives() {
        return maxTentatives;
    }

    public int getTailleCode() {
        return tailleCode;
    }
}

}
