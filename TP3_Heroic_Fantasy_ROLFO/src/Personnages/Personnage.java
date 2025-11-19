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

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    public String getNom() {
        return nom;
    }

    private final ArrayList<Arme> inventaire = new ArrayList<>();
    private Arme armeEnMain = null;
    
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
                System.out.println(nom + " a équipé l’arme " + nomArme);
                break;
            }
        }
        if (!trouvee) {
            System.out.println(nom + " ne possède pas l’arme " + nomArme);
        }
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
}
