/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_rolfo;

/**
 *
 * @author enzoa
 */
public class TP2_relation_1_ROLFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        voiture uneClio = new voiture("Clio", "Renault", 5);
        voiture uneAutreClio = new voiture("Clio", "Renault", 5);
        voiture une2008 = new voiture("2008", "Peugeot", 6);
        voiture uneMicra = new voiture("Micra", "Nissan", 4);

        personne bob = new personne("Bobby", "Sixkiller");
        personne reno = new personne("Reno", "Raines");

        System.out.println("Liste des voitures disponibles :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        // Relation : Bob possède une Clio
        bob.liste_voitures[0] = uneClio;
        bob.nbVoitures = 1;
        uneClio.proprietaire = bob;

        System.out.println("\nLa premiere voiture de Bob est : " + bob.liste_voitures[0]);

        // Ajout d'une seconde voiture à Bob
        bob.ajouter_voiture(une2008);

        // Ajout de deux voitures à Reno
        reno.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(uneMicra);

        System.out.println("\n--- Situation finale ---");
        System.out.println(bob);
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println("  - " + bob.liste_voitures[i]);
        }

        System.out.println(reno);
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println("  - " + reno.liste_voitures[i]);
        }

        // Test d'une voiture déjà possédée
        System.out.println("\nTentative d'ajout d'une voiture deja possedee :");
        reno.ajouter_voiture(uneClio);
    }
}
