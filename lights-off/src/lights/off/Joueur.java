/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights.off;

/**
 *
 * @author enzoa
 */
public class Joueur {
    private final String nom;
    private int nbCoups;

    public Joueur(String nom) {
        this.nom = nom;
        this.nbCoups = 0;
    }

    public String getNom() {
        return nom;
    }

    public int getNbCoups() {
        return nbCoups;
    }

    public void incrementerNbCoups() {
        nbCoups++;
    }

    public void reinitialiserNbCoups() {
        nbCoups = 0;
    }
}
