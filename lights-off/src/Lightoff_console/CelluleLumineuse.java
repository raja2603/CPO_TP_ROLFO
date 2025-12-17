/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lightoff_console;

/**
 *
 * @author enzoa
 */
public class CelluleLumineuse {

    /** true = allumée, false = éteinte */
    private boolean etat;

    /** Constructeur par défaut : cellule éteinte. */
    public CelluleLumineuse() {
        this.etat = false;
    }

    /** Inverse l'état de la cellule. */
    public void activerCellule() {
        this.etat = !this.etat;
    }

    /** Met la cellule à l'état éteint. */
    public void eteindreCellule() {
        this.etat = false;
    }

    /** Retourne true si la cellule est éteinte. */
    public boolean estEteint() {
        return !this.etat;
    }

    /** Retourne l'état brut (true = allumée, false = éteinte). */
    public boolean getEtat() {
        return this.etat;
    }

    /** Représentation texte : X si allumée, O si éteinte. */
    @Override
    public String toString() {
        return this.etat ? "X" : "O";
    }
}
