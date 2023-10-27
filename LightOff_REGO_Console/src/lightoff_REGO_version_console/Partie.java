/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_REGO_version_console;

import java.util.Scanner;

/**
 *
 * @author regotiphaine
 */

public class Partie {
    private final GrilleDeCellules grille; // La grille de cellules lumineuses
    private int nbCoups; // Le nombre de coups joués par le joueur

    /**
     * Constructeur de la classe Partie.
     * @param nbLignes Le nombre de lignes de la grille
     * @param nbColonnes Le nombre de colonnes de la grille
     */
    public Partie(int nbLignes, int nbColonnes) {
        grille = new GrilleDeCellules(nbLignes, nbColonnes); // Initialisation de la grille
        nbCoups = 0; // Initialisation du nombre de coups
    }

    /**
     * Méthode pour initialiser la partie en mélangeant aléatoirement la grille.
     */
    public void initialiserPartie() {
        grille.melangerMatriceAleatoirement(500); // Mélanger la grille de cellules
    }

    /**
     * Méthode pour lancer la partie.
     */
    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in); // Scanner pour la saisie utilisateur

        System.out.println("Bienvenue dans LightOff !");
        initialiserPartie(); // Initialiser la partie en mélangeant la grille

        // Tant que toutes les cellules ne sont pas éteintes
        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Nombre de coups joués : " + nbCoups);
            System.out.println(grille); // Afficher l'état actuel de la grille
            System.out.println("Activer soit une ligne (1) soit une colonne (2) soit la diagonale montante (3) soit la diagonale descendante (4)");
            int coup = scanner.nextInt(); // Lire le choix de l'utilisateur

            // Activer la ligne, la colonne ou la diagonale en fonction du choix de l'utilisateur
            switch (coup) {
                case 1:
                    System.out.println("Quelle ligne ?");
                    int ligne = scanner.nextInt();
                    grille.activerLigneDeCellules(ligne);
                    break;
                case 2:
                    System.out.println("Quelle colonne ?");
                    int colonne = scanner.nextInt();
                    grille.activerColonneDeCellules(colonne);
                    break;
                case 3:
                    grille.activerDiagonaleMontante();
                    break;
                case 4:
                    grille.activerDiagonaleDescendante();
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir entre 1, 2, 3 ou 4.");
                    break;
            }

            nbCoups++; // Incrémenter le nombre de coups joués
        }

        // Afficher le résultat de la partie
        System.out.println("Bravo ! Vous avez éteint toutes les cellules en " + nbCoups + " coups.");
    }

    /**
     * Méthode principale (point d'entrée du programme).
     * @param args Les arguments de la ligne de commande (non utilisés ici)
     */
    public static void main(String[] args) {
        Partie partie = new Partie(7, 7); // Création d'une nouvelle partie avec une grille de 7x7
        partie.lancerPartie(); // Lancer la partie
    }
}