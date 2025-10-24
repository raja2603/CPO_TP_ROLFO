// 20/10/2025 //
package tp0_.helloworld;
import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class TP0_HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println( " Bonjour " ) ; 
        System.out.println( " Aurevoir " ) ;
        String prenom;
        Scanner sc ;
        sc = new Scanner (System.in) ;
        System.out.println("Quel est votre prénom ?");
        prenom = sc.nextLine(); 
    }
    
}
