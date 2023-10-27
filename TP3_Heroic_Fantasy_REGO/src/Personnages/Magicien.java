
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;
import Armes.Baton;
/**
 *
 * @author regotiphaine
 */

public class Magicien extends Personnage {

    private final boolean estSorcier; // Un magicien peut être un sorcier ou non

    // Constructeur de la classe Magicien
    public Magicien(String nom, int niveauDeVie, boolean estSorcier) {
        super(nom, niveauDeVie); // Appelle le constructeur de la classe parente (Personnage)
        this.estSorcier = estSorcier; // Initialise l'attribut estSorcier
        nombreMagiciens++; // Incrémente le nombre de magiciens créés
    }

    // Méthode pour attaquer un personnage cible
    public void attaquer(Personnage cible) {
        int degats = armeEnMain.getNiveauAttaque(); // Obtient les points de dégâts de l'arme en main
        
        // Si l'arme en main est un bâton, multiplie les dégâts par l'âge du bâton
        if (armeEnMain instanceof Baton) {
            degats *= ((Baton) armeEnMain).getAge();
        }
        
        // Si le magicien est un sorcier, réduit les dégâts de moitié
        if (estSorcier) {
            degats /= 2;
        }
        
        // Attaque la cible avec les dégâts calculés
        cible.estAttaque(degats);
        seFatiguer(); // Le magicien se fatigue après l'attaque
    }
}
