/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_rolfo;
import Personnages.*;
import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author enzoa
 */
public class TP3_Heroic_Fantasy_ROLFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epee excalibur = new Epee("Excalibur",7,5);
        Epee durandal = new Epee("Durandal", 4, 7);
        
        Baton chene = new Baton("Chene",4,5);
        Baton charme = new Baton("Charme", 5, 6);
        
        ArrayList<Arme> armes = new ArrayList<>();
            armes.add(excalibur);
            armes.add(durandal);
            armes.add(chene);
            armes.add(charme);
            
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
    
        Magicien gandalf = new Magicien("Gandalf", 65, true);     
        Magicien garcimore = new Magicien("Garcimore", 44, false); 

        Guerrier conan = new Guerrier("Conan", 78, false);        
        Guerrier lannister = new Guerrier("Lannister", 45, true); 

        ArrayList<Personnage> personnages = new ArrayList<>();
            personnages.add(gandalf);
            personnages.add(garcimore);
            personnages.add(conan);
            personnages.add(lannister);

        for (Personnage p : personnages) {
            System.out.println(p);
        }
        
        Baton saule = new Baton("Saule", 6, 7);
        Epee joyeuse = new Epee("Joyeuse", 8, 6);

// Ajoute 1 bâton et 2 épées au guerrier Conan
conan.ajouterArme(chene);      // 1 bâton
conan.ajouterArme(excalibur);  // 1ère épée
conan.ajouterArme(durandal);   // 2ème épée
conan.equiperArme("Excalibur"); // Choisir la première épée

// Ajoute 2 bâtons et 1 épée au magicien Gandalf
gandalf.ajouterArme(charme);   // 1er bâton
gandalf.ajouterArme(saule);    // 2ème bâton
gandalf.ajouterArme(joyeuse);  // 1 épée

// Affiche le nombre d'armes préférées du magicien (bâtons)
System.out.println("Nb de bâtons pour " + gandalf.getNom() + " : " + gandalf.getNbArmesPredilection());

// Affiche toutes les caractéristiques des personnages
for (Personnage p : personnages) {
    System.out.println(p);
}
        
        
    }
}
