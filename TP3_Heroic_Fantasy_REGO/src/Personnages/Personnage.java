package Personnages;

import java.util.ArrayList;
import Armes.Arme;
import tp3_.etreVivant;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author regotiphaine
 */
public abstract class Personnage implements etreVivant {

    // Attributs protégés de la classe Personnage
    protected String nom; // Le nom du personnage
    protected int niveauDeVie; // Les points de vie du personnage
    protected ArrayList<Arme> inventaire = new ArrayList<>(); // Liste d'objets de type Arme pour l'inventaire
    protected Arme armeEnMain = null; // L'arme équipée en main
    protected static int nombrePersonnages = 0; // Nombre total de personnages créés
    protected static int nombreGuerriers = 0; // Nombre de guerriers créés
    protected static int nombreMagiciens = 0; // Nombre de magiciens créés

    // Constructeur de la classe Personnage
    public Personnage(String nom, int niveauDeVie) {
        this.nom = nom;
        this.niveauDeVie = niveauDeVie;
        nombrePersonnages++;
    }

    // Méthode statique pour obtenir le nombre total de personnages
    public static int getNombrePersonnages() {
        return nombrePersonnages;
    }

    // Méthode statique pour obtenir le nombre de guerriers
    public static int getNombreGuerriers() {
        return nombreGuerriers;
    }

    // Méthode statique pour obtenir le nombre de magiciens
    public static int getNombreMagiciens() {
        return nombreMagiciens;
    }

    // Méthode pour obtenir le niveau de vie du personnage
    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    // Méthode pour obtenir le nom du personnage
    public String getNom() {
        return nom;
    }

    // Méthode pour ajouter une arme à l'inventaire du personnage
    public void ajouterArme(Arme arme) {
        if (inventaire.size() < 5) {
            inventaire.add(arme);
        } else {
            System.out.println("Inventaire plein");
        }
    }

    // Méthode pour équiper une arme du personnage
    public void equiperArme(String nomArme) {
        for (Arme arme : inventaire) {
            if (arme.getNom().equals(nomArme)) {
                armeEnMain = arme;
                System.out.println(nom + " équipe " + arme.getNom());
                return;
            }
        }
        System.out.println(nom + " ne possède pas " + nomArme);
    }

    // Méthode pour compter le nombre d'armes de type spécifié dans l'inventaire
    public int nombreArmesDePredilection(String typeArme) {
        int count = 0;
        for (Arme arme : inventaire) {
            if (arme.getType().equals(typeArme)) {
                count++;
            }
        }
        return count;
    }

    // Méthode pour afficher les détails du personnage
  
    public String toString() {
        String resultat = "Nom: " + nom + ", Niveau de vie: " + niveauDeVie;
        if (armeEnMain != null) {
            resultat += ", Arme en main: " + armeEnMain.getNom();
        }
        return resultat;
    }

    // Méthode pour simuler la fatigue du personnage
    
    public void seFatiguer() {
        if (niveauDeVie > 10) {
            niveauDeVie -= 10;
        } else {
            niveauDeVie = 0;
        }
    }

    // Méthode pour vérifier si le personnage est vivant (a des points de vie)
    @Override
    public boolean estVivant() {
        return niveauDeVie > 0;
    }

    // Méthode pour simuler une attaque sur le personnage
    @Override
    public void estAttaque(int points) {
        niveauDeVie -= points;
        if (niveauDeVie < 0) {
            niveauDeVie = 0;
        }
    }
}