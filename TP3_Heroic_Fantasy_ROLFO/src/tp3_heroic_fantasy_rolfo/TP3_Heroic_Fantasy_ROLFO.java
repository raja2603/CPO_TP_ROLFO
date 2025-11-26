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

        conan.ajouterArme(chene);      
        conan.ajouterArme(excalibur);  
        conan.ajouterArme(durandal);   
        conan.equiperArme("Excalibur"); 

        gandalf.ajouterArme(charme);   
        gandalf.ajouterArme(saule);    
        gandalf.ajouterArme(joyeuse);  

        System.out.println("Nb de batons pour " + gandalf.getNom() + " : " + gandalf.getNbArmesPredilection());

        for (Personnage p : personnages) {
            System.out.println(p);
        }
        System.out.println("Nb de batons pour le magicien : " + gandalf.getNbArmesPredilection());
        System.out.println("Nb d'epees pour le guerrier : " + conan.getNbArmesPredilection());
        
        System.out.println("Nombre total de personnages : " + Personnage.getNbPersonnages());
        System.out.println("Nombre de guerriers : " + Guerrier.getNbGuerriers());
        System.out.println("Nombre de magiciens : " + Magicien.getNbMagiciens());
    }
}
