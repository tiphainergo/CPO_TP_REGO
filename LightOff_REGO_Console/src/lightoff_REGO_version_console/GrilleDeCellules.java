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

    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;

    /**
     * Crée une nouvelle grille de cellules lumineuses avec un nombre spécifié
     * de lignes et de colonnes.
     *
     * @param nbLignes1 Le nombre de lignes de la grille.
     * @param nbColonnes1 Le nombre de colonnes de la grille.
     */
    public GrilleDeCellules(int nbLignes1, int nbColonnes1) {
        nbLignes = nbLignes1;
        nbColonnes = nbColonnes1;

        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j] = new CelluleLumineuse();
            }
        }
    }

    /**
     * Permet d'éteindre toutes les cellules
     */
    public void eteindreToutesLesCellules() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindre();
            }
        }
    }

    /**
     * Active de manière aléatoire une ligne, une colonne ou une diagonale de
     * cellules dans la grille. La sélection est basée sur un nombre aléatoire
     * généré.
     */
    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random random = new Random();
        int choix = random.nextInt(10);
        switch (choix) {
            case 0 -> {

                int ligne = random.nextInt(nbLignes);
                for (int j = 0; j < nbColonnes; j++) {
                    matriceCellules[ligne][j].allumer();
                }
            }
            case 1 -> {

                int colonne = random.nextInt(nbColonnes);
                for (int i = 0; i < nbLignes; i++) {
                    matriceCellules[i][colonne].allumer();
                }
            }
            case 2 -> {

                for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                    matriceCellules[i][i].allumer();
                }
            }
            case 3 -> {

                for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                    matriceCellules[i][nbColonnes - i - 1].allumer();
                }
            }

            default -> {

                int direction = random.nextBoolean() ? 1 : -1;
                if (direction == 1) {
                    for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                        matriceCellules[i][i].allumer();
                    }
                } else {
                    for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
                        matriceCellules[i][nbColonnes - i - 1].allumer();
                    }
                }
            }
        }
    }

    /**
     * Génère un plateau de cellules lumineuses de manière aléatoire en un
     * nombre spécifié de tours.
     *
     * @param nbTours Le nombre de tours pour mélanger la matrice de cellules.
     */
    public void melangerMatriceAleatoirement(int nbTours) {

        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[i][j].eteindre();
            }
        }

        for (int tour = 0; tour < nbTours; tour++) {
            activerLigneColonneOuDiagonaleAleatoire();
        }
    }

    /**
     * Active toutes les cellules d'une ligne de la grille spécifique.
     *
     * @param idLigne L'indice de la ligne à activer.
     */
    public void activerLigneDeCellules(int idLigne) {
        for (int j = 0; j < nbColonnes; j++) {
            matriceCellules[idLigne][j].allumer();
        }
    }

    /**
     * Active toutes les cellules d'une colonne de la grille spécifique.
     *
     * @param idColonne L'indice de la colonne à activer.
     */
    public void activerColonneDeCellules(int idColonne) {
        for (int i = 0; i < nbLignes; i++) {
            matriceCellules[i][idColonne].allumer();
        }
    }

    /**
     * Active la diagonale descendante de cellules dans la grille.
     */
    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].allumer();
        }
    }

    /**
     * Active la diagonale montante de cellules dans la grille.
     */
    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - i - 1].allumer();
        }
    }

    /**
     ** Vérifie si toutes les cellules de la grille sont éteintes.
     *
     * @return true si toutes les cellules sont éteintes, sinon false.
     */
    public boolean cellulesToutesEteintes() {
        for (int i = 0; i < nbLignes; i++) {
            for (int j = 0; j < nbColonnes; j++) {
                if (matriceCellules[i][j].etat()) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Redéfinit la méthode toString() pour afficher l'état de la grille sous
     * forme d'une représentation visuelle organisée.
     *
     * @return Une chaîne de caractères représentant l'état de la grille.
     */
    @Override
    public String toString() {
        StringBuilder gridString = new StringBuilder();

        int ligneLabelLength = Integer.toString(nbLignes - 1).length();
        int colonneLabelLength = Integer.toString(nbColonnes - 1).length();

        gridString.append(" ".repeat(ligneLabelLength + 1));
        for (int colonne = 0; colonne < nbColonnes; colonne++) {
            gridString.append(String.format(" %" + (colonneLabelLength + 1) + "d", colonne));
        }
        gridString.append("\n");

        for (int ligne = 0; ligne < nbLignes; ligne++) {
            gridString.append(String.format("%" + ligneLabelLength + "d |", ligne));
            for (int colonne = 0; colonne < nbColonnes; colonne++) {
                gridString.append(matriceCellules[ligne][colonne].etat() ? " X " : " O ");
            }
            gridString.append("\n");
        }

        return gridString.toString();
    }
}
