/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_.addition;

import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TP0_Addition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrer le nombre :");
        int nb; // nombre d'entiers à additionner
        nb = sc.nextInt();
        int result; // resultat
        int ind; //indice
        // initialisation
        result=0;
        // addition des nb premiers entiers
        ind=1;
        while (ind< nb) {
            result=result+ind;
            ind++;
        }
        // affichage du resultat
        System.out.println("la somme des "+ nb + "entiers est:"+result); }
    }
