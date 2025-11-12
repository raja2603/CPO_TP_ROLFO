/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package tp3_heroic_fantasy_rolfo;

/**
 *
 * @author enzoa
 */
public class Epee extends Arme {
    private int finesse;

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        // Limitation de l'indice de finesse à 99
        if (finesse >= 100) {
            this.finesse = 99;
        } else {
            this.finesse = finesse;
        }
    }

    public int getFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return super.toString() + " | Finesse: " + finesse;
    }
}