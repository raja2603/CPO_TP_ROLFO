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
    private boolean allumee;

    public CelluleLumineuse() {
        this.allumee = false; // éteinte au départ
    }

    public boolean estAllumee() {
        return allumee;
    }

    public boolean estEteinte() {
        return !allumee;
    }

    public void allumer() {
        allumee = true;
    }

    public void eteindre() {
        allumee = false;
    }

    public void changerEtat() {
        allumee = !allumee;
    }

    @Override
    public String toString() {
        // utile pour l'affichage en console
        return allumee ? "X" : ".";
    }
}
