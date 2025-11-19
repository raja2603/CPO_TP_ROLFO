/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author enzoa
 */
public class Guerrier extends Personnage {
    private boolean cheval;

    public Guerrier(String nom, int niveauVie, boolean cheval) {
        super(nom, niveauVie);
        this.cheval = cheval;
    }

    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    public boolean isCheval() {
        return cheval;
    }

    @Override
    public String toString() {
        return super.toString() + ", A cheval : " + cheval;
    }
}
