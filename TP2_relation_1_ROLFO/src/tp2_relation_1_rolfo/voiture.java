/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_rolfo;

/**
 *
 * @author enzoa
 */
public class voiture {
    String modele;
    String marque;
    int puissance;
    Personne proprietaire;
    
    public voiture(String modele, String marque, int puissance){
        this.modele = modele;
        this.marque = marque;
        this.puissance = puissance;
        this.proprietaire = null;
    }
    @override
    public String toString(){
        String proprietaireNom = (proprietaire == null)? "aucun proprietaire"
                :proprietaire.prenom + " " + proprietaire.nom
        return modele + "" + marque + "  ( " + puissance + "CV), proprietaire : "+proprietaireNom;
    }
}
