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
public class Magicien extends Personnage {
    private boolean confirme;
    private static int nbMagiciens = 0;
    
    public Magicien(String nom, int niveauVie, boolean confirme) {
        super(nom, niveauVie);
        this.confirme = confirme;
        nbMagiciens++;
    }
    
    public static int getNbMagiciens() {
        return nbMagiciens;
    }
    
    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public boolean isConfirme() {
        return confirme;
    }

    /**
     *
     * @return
     */
    @Override
public int getNbArmesPredilection() {
    int count = 0;
    for (Arme arme : inventaire) {
        if (arme instanceof Baton) {
            count++;
        }
    }
    return count;
}
@Override
protected void finalize() throws Throwable {
    nbMagiciens--;
    super.finalize();
}

}
