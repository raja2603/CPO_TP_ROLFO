/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_rolfo;

import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TP2_convertisseurObjet_ROLFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Convertisseur conv = new Convertisseur();
        
        System.out.println("saisir une valeur a convertir");
        double valeur = sc.nextDouble();
        
        System.out.println("""
                           choix de convertion: 
                           1)CelciusVersKelvin 
                           2)KelvinVersCelcius 
                           3)FarenheitVersCelcius
                           4)CelciusVersFarenheit
                           5)KelvinVersFarenheit
                           6)FarenheitVersKelvin
                           """);
                
        int choix = sc.nextInt();
        double resultat = 0;
        
        switch(choix){
            case 1 -> resultat = conv.CelciusVersKelvin(valeur);
            case 2 -> resultat = conv.KelvinVersCelcius(valeur);
            case 3 -> resultat = conv.FarenheitVersCelcius(valeur);
            case 4 -> resultat = conv.CelciusVersFarenheit(valeur);
            case 5 -> resultat = conv.KelvinVersFarenheit(valeur);
            case 6 -> resultat = conv.FarenheitVersKelvin(valeur);
            default -> System.out.println("choix pas bon");
    }
        System.out.println("le resultat est "+resultat);   
        sc.close();
    }
    
}
