/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.*;
/**
 *
 * @author enzoa
 */
public class Guerrier extends Personnage {
    private boolean cheval;
    private static int nbGuerriers = 0;
    
    public Guerrier(String nom, int niveauVie, boolean cheval) {
        super(nom, niveauVie);
        this.cheval = cheval;
        nbGuerriers++;
    }
    
    public static int getNbGuerriers() {
        return nbGuerriers;
    }
    
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }

    public boolean isCheval() {
        return cheval;
    }

    @Override
public int getNbArmesPredilection() {
    int count = 0;
    for (Arme arme : inventaire) {
        if (arme instanceof Epee) {
            count++;
        }
    }
    return count;
}
@Override
protected void finalize() throws Throwable {
    nbGuerriers--;
    super.finalize();
}
}
