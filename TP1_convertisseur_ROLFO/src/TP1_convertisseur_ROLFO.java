/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TP1_convertisseur_ROLFO {
    
    public static double CelciusVersKelvin (double tCelcius) {
     return tCelcius + 273.15; // à completer
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bonjour, saisissez une valeur :\n");
        double valeur = sc.nextDouble();
        System.out.print("""
                         Saisissez la conversion que vous souhaiter effectuer :
                         1)De Kelvin Vers Celcius
                         2)De Farenheit Vers Celcius
                         3)De Celcius Vers Farenheit
                         4)De Kelvin Vers Farenheit
                         5)De Farenheit Vers Kelvin
                         """);
        int conv = sc.nextInt();
        if (conv < 1 || conv > 5) {
                System.out.println("Choisir un nombre entre 1 et 5.");
        } else {
                double resultat = 0;
            String UD = "";
            String UA = "";

                
                switch (conv) {
                    case 1 -> {resultat = valeur - 273.15;UD=" Kelvin";UA=" Celsius";}
                    case 2 -> {resultat = (valeur - 32) / 1.8;UD=" Farenhei";UA=" Celsius";}
                    case 3 -> {resultat = (valeur * 9 / 5) + 32;UD=" Celcius";UA=" Farenheit";}
                    case 4 -> {resultat = (valeur - 273.15) * 9 / 5 + 32;UD=" Kelvin";UA=" Farenheit";}
                    case 5 -> {resultat = (valeur - 32) * 5 / 9 + 273.15;UD=" Farenhei";UA=" Kelvin";}
                }
                System.out.println(valeur + UD + " est egal a " + resultat + UA);
            }
    }  
}
