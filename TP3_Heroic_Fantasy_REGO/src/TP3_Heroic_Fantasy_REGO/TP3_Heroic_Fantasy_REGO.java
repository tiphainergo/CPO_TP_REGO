package TP3_Heroic_Fantasy_REGO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author regotiphaine
 */
   import Personnages.Magicien ;
    import Personnages.Guerrier ;
    import Personnages.Personnage ;
    import Armes.Baton ;
    import Armes.Arme ;
    import Armes.Epee ;
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

        // Création d'une liste d'armes
        ArrayList<Arme> armes = new ArrayList<>();
        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // Affichage des caractéristiques des armes
        System.out.println("Liste des armes :");
        for (Arme arme : armes) {
            System.out.println(arme);
        }

        // Création des personnages
        Guerrier lannister = new Guerrier("Lannister", 45, true);
        Guerrier conan = new Guerrier("Conan", 78, false);
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        // Création d'une liste de personnages
        ArrayList<Personnage> personnages = new ArrayList<>();
        personnages.add(gandalf);
        personnages.add(garcimore);
        personnages.add(conan);
        personnages.add(lannister);

        // Affichage des caractéristiques des personnages
        System.out.println("\nListe des personnages :");
        for (Personnage personnage : personnages) {
            System.out.println(personnage);
        }

        // Attribution et équipement des armes pour les guerriers
        conan.ajouterArme(excalibur);
        conan.ajouterArme(durandal);
        lannister.ajouterArme(excalibur);
        lannister.ajouterArme(durandal);
        conan.equiperArme("Excalibur");
        lannister.equiperArme("Durandal");

        // Attribution et équipement des bâtons pour les magiciens
        gandalf.ajouterArme(chene);
        gandalf.ajouterArme(charme);
        garcimore.ajouterArme(chene);
        garcimore.ajouterArme(charme);
        gandalf.equiperArme("Chene");
        garcimore.equiperArme("Charme");

        // Affichage du nombre total de personnages, de guerriers et de magiciens
        System.out.println("\nNombre total de personnages : " + Personnage.getNombrePersonnages());
        System.out.println("Nombre de guerriers : " + Guerrier.getNombreGuerriers());
        System.out.println("Nombre de magiciens : " + Magicien.getNombreMagiciens());

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

