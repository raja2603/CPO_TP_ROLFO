/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_rolfo;

/**
 *
 * @author enzoa
 */
public class TP2_manip_ROLFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        
        Tartiflette assiette3 = assiette2;
        
        System.out.println("nb de calories de Assiette 2 : "+ assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "+ assiette3.nbCalories);
        
        assiette2.nbCalories += 100;
        
        System.out.println("\nApres modification : ");
        System.out.println("nb de calories de Assiette 2 : "+ assiette2.nbCalories);
        System.out.println("nb de calories de Assiette 3 : "+ assiette3.nbCalories);
        
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        
        System.out.println("\nApres echange des assiette : ");
        System.out.println("Assiette 1 : "+ assiette1.nbCalories + " calories");
        System.out.println("Assiette 2 : "+ assiette2.nbCalories + " calories");
        
        ///les lignes sont incorrectes
        
        Moussaka[] tabMoussaka = new Moussaka[10];
        for (int i = 0; i < tabMoussaka.length; i++){
            tabMoussaka[i] = new Moussaka(100 + i * 10);
        }
        
        System.out.println("\nTableaau de Moussaka cree : ");
        for (int i = 0; i < tabMoussaka.length; i++){
            System.out.println("Moussaka " + i + " : " + tabMoussaka[i].nbCalories + " calories");
        }
    }
    
}
