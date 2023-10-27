package Armes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author regotiphaine
 */
public class Epee extends Arme {
    private final int finesse; //finesse de l'épée

    public Epee(String nom, int niveauAttaque, int finesse) {
        super(nom, niveauAttaque);
        this.finesse = finesse;
    }

    public int getFinesse() {
        return finesse;
    }
}