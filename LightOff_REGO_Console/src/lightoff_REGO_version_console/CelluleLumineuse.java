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

   
    private boolean etat; // Indique l'état de la cellule (allumée ou éteinte).

    /**
     * Constructeur par défaut qui initialise l'état de la cellule à "éteint" (false).
     */
    public CelluleLumineuse() {
        etat = false;
    }

    /**
     * Méthode pour activer ou éteindre la cellule en inversant son état actuel.
     * Si la cellule est allumée, elle devient éteinte, et vice versa.
     */
    public void allumer() {
        etat = !etat;
    }

    /**
     * Méthode pour éteindre la cellule si elle est allumée. Si la cellule est déjà éteinte,
     * cette méthode n'a aucun effet.
     */
    public void eteindre() {
        if (etat) {
            etat = false;
        }
    }

    /**
     * Méthode pour vérifier si la cellule est actuellement éteinte.
     *
     * @return true si la cellule est éteinte, false si elle est allumée.
     */
    public boolean estEteinte() {
        return !etat;
    }

    /**
     * Méthode pour obtenir l'état actuel de la cellule.
     *
     * @return true si la cellule est allumée, false si elle est éteinte.
     */
    public boolean etat() {
        return etat;
    }

    /**
     * Redéfinition de la méthode toString pour afficher l'état de la cellule de manière lisible.
     * Si la cellule est allumée, elle affiche "X", sinon elle affiche "O".
     *
     * @return "X" si la cellule est allumée, "O" si elle est éteinte.
     */
    @Override
    public String toString() {
        return etat ? "X" : "O";
    }
}