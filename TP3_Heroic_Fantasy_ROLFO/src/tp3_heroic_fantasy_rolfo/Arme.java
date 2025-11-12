/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_rolfo;

/**
 *
 * @author enzoa
 */
public class Arme {
    String nom;
    int niveauAttaque;
    
    public Arme(String nom, int niveauAttaque){
        this.nom = nom;
        if (niveauAttaque > 100){
            this.niveauAttaque = 100;
        }else{
            this.niveauAttaque = niveauAttaque;
        }
    }
    public int getNiveauAttaque(){
        return niveauAttaque;
    }
    public String getNom(){
        return nom;
    }
    @Override
    public String toString(){
        return nom+" (Niveau d'attaque : "+niveauAttaque+")";
    }
}
