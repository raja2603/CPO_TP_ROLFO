package Personnages;
import java.util.ArrayList;
import Armes.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author enzoa
 */
public class Personnage {
    String nom;
    int niveauVie;
    protected static int nbPersonnages = 0;
    
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        nbPersonnages++;
    }
    
    public static int getNbPersonnages() {
        return nbPersonnages;
    }
    
    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    protected  final ArrayList<Arme> inventaire = new ArrayList<>();
    protected  Arme armeEnMain = null;
    
    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
        } else {
            System.out.println("Inventaire plein : impossible d’ajouter " + a.getNom());
        }
    }
    
    public Arme getArmeEnMain() {
        return armeEnMain;
    }
    public void equiperArme(String nomArme) {
        boolean trouvee = false;
        for (Arme a : inventaire) {
            if (a.getNom().equals(nomArme)) {
                armeEnMain = a;
                trouvee = true;
                System.out.println(nom + " a equipe l’arme " + nomArme);
                break;
            }
        }
        if (!trouvee) {
            System.out.println(nom + " ne possede pas l’arme " + nomArme);
        }
    }
    public int getNbArmesPredilection() {
    return 0; // par défaut : aucune
}
    @Override
    public String toString() {
        String res = "Nom : " + nom + ", Niveau de vie : " + niveauVie;
        if (armeEnMain != null) {
            res += ", Arme en main : " + armeEnMain.toString();
        } else {
            res += ", Arme en main : aucune";
        }
        return res;
    }

    /**
     *
     * @throws Throwable
     */
    @Override
    protected void finalize() throws Throwable {
    nbPersonnages--;
    super.finalize();
}
}
