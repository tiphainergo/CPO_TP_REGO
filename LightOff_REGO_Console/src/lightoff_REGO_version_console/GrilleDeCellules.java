/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_REGO_version_console;

import java.util.Random;

/**
 *
 * @author regotiphaine
 */
public class GrilleDeCellules {

    private final CelluleLumineuse[][] matriceCellules; // La matrice de cellules lumineuses
    private final int nbLignes; // Nombre de lignes dans la grille
    private final int nbColonnes; // Nombre de colonnes dans la grille

    // Constructeur pour créer une nouvelle grille de cellules lumineuses avec le nombre spécifié de lignes et de colonnes
    public GrilleDeCellules(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        // Initialisation de la matrice avec des cellules éteintes
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    // Méthode pour éteindre toutes les cellules dans la grille
    public void eteindreToutesLesCellules() {
        for (CelluleLumineuse[] ligne : matriceCellules) {
            for (CelluleLumineuse cellule : ligne) {
                cellule.eteindre();
            }
        }
    }

    // Méthode pour activer de manière aléatoire une ligne, une colonne ou une diagonale de cellules dans la grille
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(4); // Choix entre 0 et 3

        if (choix == 0) {
            // Activation d'une ligne aléatoire
            int ligne = random.nextInt(nbLignes);
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligne][j].allumer();
            }
        } else if (choix == 1) {
            // Activation d'une colonne aléatoire
            int colonne = random.nextInt(nbColonnes);
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonne].allumer();
            }
        } else if (choix == 2) {
            // Activation de la diagonale descendante
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][i].allumer();
            }
        } else {
            // Activation de la diagonale montante
            for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                matriceCellules[i][nbColonnes - i - 1].allumer();
            }
        }
    }

    // Méthode pour mélanger la matrice de cellules aléatoirement pendant un certain nombre de tours
    public void melangerMatriceAleatoirement(int nbTours) {
        eteindreToutesLesCellules(); // On éteint toutes les cellules avant de les mélanger à nouveau
        Random random = new Random();

        // Réalisation du nombre de tours spécifié
        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    // Méthode pour activer toutes les cellules d'une ligne spécifique
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].allumer();
        }
    }

    // Méthode pour activer toutes les cellules d'une colonne spécifique
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].allumer();
        }
    }

    // Méthode pour activer la diagonale descendante de cellules
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].allumer();
        }
    }

    // Méthode pour activer la diagonale montante de cellules
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - i - 1].allumer();
        }
    }

    // Méthode pour vérifier si toutes les cellules de la grille sont éteintes
    public boolean cellulesToutesEteintes() {
        for (CelluleLumineuse[] ligne : matriceCellules) {
            for (CelluleLumineuse cellule : ligne) {
                if (cellule.estAllumee()) {
                    return false;
                }
            }
        }
        return true; // Toutes les cellules sont éteintes
    }

    // Redéfinition de la méthode toString() pour afficher l'état de la grille
    @Override
    public String toString() {
        StringBuilder gridString = new StringBuilder();

        // Construction de la représentation visuelle de la grille
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                gridString.append(matriceCellules[i][j].estAllumee() ? " X " : " O ");
            }
            gridString.append("\n"); // Nouvelle ligne après chaque ligne de cellules
        }

        return gridString.toString(); // Retourne la représentation de la grille
    }
}
