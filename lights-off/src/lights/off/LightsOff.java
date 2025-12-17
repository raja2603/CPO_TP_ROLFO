/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lights.off;
import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class LightsOff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre nom : ");
        String nom = sc.nextLine();

        Partie partie = new Partie(nom);
        partie.lancerPartie();    
    }
}
