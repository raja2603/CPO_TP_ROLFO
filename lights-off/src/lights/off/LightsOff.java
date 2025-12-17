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
        GrilleDeJeu g = new GrilleDeJeu(5, 5);
        g.melangerMatriceAleatoirement(10);
        System.out.println(g);

        Partie p = new Partie(5, 5); // ou autre taille
        p.initialiserPartie();
        p.lancerPartie();
    }
}
