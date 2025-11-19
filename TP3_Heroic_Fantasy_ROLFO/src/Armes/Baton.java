/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author enzoa
 */
public class Baton extends Arme {
    int age;

    public Baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        // Limitation de l'âge à 99
        if (age >= 100) {
            this.age = 99;
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return super.toString() + " | Âge: " + age;
    }
}
