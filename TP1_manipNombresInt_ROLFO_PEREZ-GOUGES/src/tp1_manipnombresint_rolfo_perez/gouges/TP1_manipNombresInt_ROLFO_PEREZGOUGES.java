/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_rolfo_perez.gouges;

import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TP1_manipNombresInt_ROLFO_PEREZGOUGES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Scanner sc = new Scanner(System.in);

        // Saisie de 2 entiers
        System.out.print("Entrez le premier entier : ");
        int nombre1 = sc.nextInt();

        System.out.print("Entrez le deuxième entier : ");
        int nombre2 = sc.nextInt();

        System.out.println("\nVous avez saisi : " + nombre1 + " et " + nombre2);

        // Calculs
        int somme = nombre1 + nombre2;
        int difference = nombre1 - nombre2;
        int produit = nombre1 * nombre2;

        System.out.println("La somme des deux nombres est : " + somme);
        System.out.println("La différence (premier - deuxième) est : " + difference);
        System.out.println("Le produit des deux nombres est : " + produit);

        if (nombre2 != 0) {
            int quotient = nombre1 / nombre2;
            int reste = nombre1 % nombre2;
            System.out.println("Le quotient entier de " + nombre1 + " / " + nombre2 + " est : " + quotient);
            System.out.println("Le reste de la division euclidienne est : " + reste);
        } else {
            System.out.println("La division par zéro est impossible !");
        }
    }
}
