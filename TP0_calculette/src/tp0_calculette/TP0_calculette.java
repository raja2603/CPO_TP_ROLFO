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
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("""
                                           Please enter the operator:
                                           1) add
                                           2) substract
                                           3) multiply
                                           4) divide
                                           5) modulo""");
            int operateur = sc.nextInt();
            
            System.out.print("Please enter the first number: ");
            int operande1 = sc.nextInt();
            
            System.out.print("Please enter the second number: ");
            int operande2 = sc.nextInt();
            if (operateur < 1 || operateur > 5) {
                System.out.println("Choisir un nombre entre 1 et 5");
            } else {
                int x = 0;
                
                switch (operateur) {
                    case 1 -> x = operande1 + operande2;
                    case 2 -> x = operande1 - operande2;
                    case 3 -> x = operande1 * operande2;
                    case 4 -> x = operande1 / operande2;
                    case 5 -> x = operande1 % operande2;
                }
                System.out.println("The result is: " + x);
            }
        }
    }
}
       