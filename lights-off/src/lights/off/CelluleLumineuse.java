/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lights.off;

/**
 *
 * @author enzoa
 */
public class CelluleLumineuse {

    /** true si la cellule est allumée, false si elle est éteinte. */
    private boolean etat;

    /**
     * Constructeur par défaut.
     * Initialise la cellule à l'état éteint.
     */
    public CelluleLumineuse() {
        this.etat = false;
    }

    /**
     * Inverse l'état de la cellule.
     * Si elle est allumée, elle s'éteint, et inversement.
     */
    public void activerCellule() {
        etat = !etat;
    }

    /**
     * Éteint la cellule (etat = false).
     */
    public void eteindreCellule() {
        etat = false;
    }

    /**
     * Indique si la cellule est éteinte.
     * @return true si la cellule est éteinte, false sinon.
     */
    public boolean estEteint() {
        return !etat;
    }

    /**
     * Renvoie l'état actuel de la cellule.
     * @return true si allumée, false si éteinte.
     */
    public boolean getEtat() {
        return etat;
    }

    /**
     * Représentation texte de la cellule.
     * @return "X" si allumée, "O" si éteinte.
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}
