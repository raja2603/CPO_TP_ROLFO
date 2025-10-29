/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_rolfo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TP1_guessMyNumber_ROLFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random generateurAleat = new Random();
        Scanner sc = new Scanner(System.in);       
        System.out.print("""
                         choix de la difficulte:
                         1)Facile(0 a 50)
                         2)Normal(0 a 100)
                         3)Difficile(0 a 200) avec 10 essais max
                         Votre choix:
                         """);
        int choix = sc.nextInt();
        int max;
        int tentativesMax=Integer.MAX_VALUE;
        switch (choix) {
            case 1 -> max=50;
            case 3 -> {
                max=200;
                tentativesMax=10;
            }
            default -> max=100;
        }
        int nombreSecret = generateurAleat.nextInt(max + 1);
        int proposition = -1;
        int essais = 0;
        while (proposition != nombreSecret && essais < tentativesMax) {
            proposition = sc.nextInt();
            essais++;
            if (proposition < nombreSecret)
                System.out.println("++");
            else if (proposition > nombreSecret)
                System.out.println("--");
        }
        if (proposition == nombreSecret)
            System.out.println("Gagne en "+ essais + " essais.");
        else
            System.out.println("Perdu ct " + nombreSecret + ".");

        sc.close();
    }
    
}
