/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_REGO_version_console;

/**
 *
 * @author regotiphaine
 */
public class CelluleLumineuse {

    private boolean estAllumee; // true si allumée, false si éteinte

    /**
     * Constructeur par défaut qui initialise l'état à "éteint" (false).
     */
    public CelluleLumineuse() {
        estAllumee = false;
    }

    /**
     * Méthode pour activer ou éteindre la cellule en inversant son état actuel.
     */
    public void inverserEtat() {
        estAllumee = !estAllumee;
    }

    /**
     * Méthode pour éteindre la cellule si elle est allumée.
     */
    public void eteindre() {
        if (estAllumee) {
            estAllumee = false;
        }
    }

    /**
     * Méthode pour allumer la cellule si elle est éteinte.
     */
    public void allumer() {
        if (!estAllumee) {
            estAllumee = true;
        }
    }

    /**
     * Méthode pour vérifier si la cellule est actuellement allumée.
     * @return true si la cellule est allumée, false si elle est éteinte.
     */
    public boolean estAllumee() {
        return estAllumee;
    }

    /**
     * Redéfinition de la méthode toString pour afficher l'état de la cellule de manière
     * lisible. Si la cellule est allumée, elle affiche "X", et si la cellule est éteinte,
     * elle affiche "O".
     * @return "X" si la cellule est allumée, "O" si elle est éteinte.
     */
    @Override
    public String toString() {
        return estAllumee ? "X" : "O"; 
    }
}
