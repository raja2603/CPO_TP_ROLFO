/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_rolfo;

/**
 *
 * @author enzoa
 */
public class personne {
    String prenom;
    String nom;
    int nbVoitures;
    voiture[] liste_voitures;
    
    /**
     *
     * @param prenom
     * @param nom
     */
    public personne(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
        this.nbVoitures = 0;
        this.liste_voitures = new voiture[3];
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return prenom + " " + nom + " possede " + nbVoitures + " voitures";
    }
    
    public boolean ajouter_voiture(voiture voiture_a_ajouter) {
        // … a completer
        voiture_a_ajouter.proprietaire = this;
        
        if (voiture_a_ajouter.proprietaire != null) {
            System.out.println("Erreur : la voiture " + voiture_a_ajouter.modele + " appartient deja a "
                    + voiture_a_ajouter.proprietaire.prenom + ".");
            return false;
        }

        if (nbVoitures >= 3) {
            System.out.println("Erreur : " + prenom + " possede deja 3 voitures.");
            return false;
        }

        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;
        return true;
    }
}
