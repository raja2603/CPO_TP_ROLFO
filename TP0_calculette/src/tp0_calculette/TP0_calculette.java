/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the operator:\n" +"1) add\n" +
        "2) substract\n" +"3) multiply\n" +"4) divide\n" +"5) modulo");
        int operateur = sc.nextInt();
        
        System.out.print("Please enter the first number: ");
        int operande1 = sc.nextInt();
        
        System.out.print("Please enter the second number: ");
        int operande2 = sc.nextInt();
        if operateur <1{
                System.out.print("choisir un nombre entre 1 et 5");
        }else operateur = 1;{
                int x = operande1 + operande2;
        else operateur = 2;
                int x = operande1 - operande2; 
        else operateur = 3;
                int x = operande1 * operande2;
        else operateur = 4;
                int x = operande1 / operande2;
        else operateur = 5;
                int x = operande1 % operande2;
        System.out.print("The result is :"x);
        sc.close();
    }
    
}
