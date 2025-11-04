/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_rolfo;

/**
 *
 * @author enzoa
 */
public class TP2_Bieres_ROLFO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",
        7.0 ,"Dubuisson") ;
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6
        ,"Abbaye de Leffe") ;
        BouteilleBiere Biere2 = new BouteilleBiere("Despe", 5.9
        ,"Desperados") ;
        BouteilleBiere Biere3 = new BouteilleBiere("Guinness", 4.2
        ,"Guinness") ;
        
        uneBiere.Decapsuler();
        Biere2.Decapsuler();
        
        System.out.println(uneBiere) ;
        System.out.println(autreBiere) ;
        System.out.println(Biere2) ;
        System.out.println(Biere3) ;
    }
    
}
