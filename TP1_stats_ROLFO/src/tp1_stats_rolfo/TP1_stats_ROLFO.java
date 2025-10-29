/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_rolfo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TP1_stats_ROLFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        int[] faces = new int[6];

        System.out.print("Combien de lancers de de voulez-vous simuler ? ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6);
            faces[tirage]++;
        }

        System.out.println("\nResultats des lancers :");
        for (int i = 0; i < 6; i++) {
            double pourcentage = (faces[i] * 100.0) / m;
            System.out.println("Face " + (i + 1) + " : " + faces[i] + " fois (" + pourcentage + "%)");
        }

        sc.close();
    }
    
}
