package TP3_Heroic_Fantasy_REGO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author regotiphaine
 */
import Personnages.Magicien;
import Personnages.Guerrier;
import Personnages.Personnage;
import Armes.Baton;
import Armes.Arme;
import Armes.Epee;
import java.util.ArrayList;
import tp3_.etreVivant;

public class TP3_Heroic_Fantasy_REGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création des armes
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        Baton chene = new Baton("Chene", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // Création des personnages
        Guerrier lannister = new Guerrier("Lannister", 45, true);
        Guerrier conan = new Guerrier("Conan", 78, false);
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        // Attribution des armes
        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);
        lannister.ajouterArme(excalibur);
        lannister.ajouterArme(durandal);
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(charme);
        garcimore.ajouterArme(chene);
        garcimore.ajouterArme(charme);

        // Équipement des armes
        conan.equiperArme("Excalibur");
        lannister.equiperArme("Durandal");
        gandalf.equiperArme("Chene");
        garcimore.equiperArme("Charme");

        // Affichage des caractéristiques des personnages
        System.out.println(conan);
        System.out.println(lannister);
        System.out.println(gandalf);
        System.out.println(garcimore);

        // Combat entre Gandalf et Conan
        System.out.println("\nAvant le combat :");
        System.out.println(conan);
        System.out.println(gandalf);

        conan.attaquer(gandalf);

        System.out.println("\nAprès le combat :");
        System.out.println(conan);
        System.out.println(gandalf);

        // Vérification de la survie des personnages après le combat
        System.out.println("\nLe guerrier est vivant : " + conan.estVivant());
        System.out.println("Le magicien est vivant : " + gandalf.estVivant());
    }
}
