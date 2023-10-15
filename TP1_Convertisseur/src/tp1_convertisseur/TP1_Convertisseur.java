/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur;

import java.util.Scanner;

/**
 *
 * @author regotiphaine
 */
public class TP1_Convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Bonjour, saisissez une valeur réelle :");
        double nb1 = sc.nextDouble(); //demande a l utilisateur nb1=temperature

        System.out.println("\n Saisissez la convertion que vous voulez effectuer :");
        int operateur = sc.nextInt(); //demande a l utilisateur de choisir un programme

        while (operateur > 6 || operateur < 1) {
            System.out.println("ERREUR La valeur n'est pas comprise entre 1 et 6");
            System.out.println("\n Entrer un nombre :");
            operateur = sc.nextInt(); //boucle tant que operateur (1 a 6) n est pas associe a un programme
        }
        double result;
        switch (operateur) {
            case 1 -> {
                // CelciusVersKelvin
                result = (double) CelciusVersKelvin(nb1);
                System.out.println("La température en Kelvin est : " + result);
            }
            case 2 -> {
                //KelvinVersCelcius
                result = (double) KelvinVersCelcius(nb1);
                System.out.println("La température en Celcius est : " + result);
            }
            case 3 -> {
                //FarenheitVersCelcius
                result = FarenheitVersCelcius(nb1);
                System.out.println("La température en Celcius est : " + result);
            }
            case 4 -> {
                //CelciusVersFarenheit
                result = CelciusVersFarenheit(nb1);
                System.out.println("La température en Fareinheit est : " + result);
            }
            case 5 -> {
                //KelvinVersFarenheit
                result = KelvinVersFarenheit(nb1);
                System.out.println("La température en Fareinheit est : " + result);
            }
            case 6 -> {
                //FarenheitVersKelvin
                result = FarenheitVersKelvin(nb1);
                System.out.println("La température en Kelvin est : " + result);
                //System.out.println("La température en Celcius est : "+nb1);
                //double temp = CelciusVersKelvin(nb1);
                //System.out.println("La température en Kelvin est : " + temp);
            }

            //System.out.println("La température en Celcius est : "+nb1);
            //double temp = CelciusVersKelvin(nb1);
            //System.out.println("La température en Kelvin est : " + temp);
            }
    }

    public static double CelciusVersKelvin(double tempCelcius) {
        double tempKelvin = (double) (tempCelcius + 273.15);
        return tempKelvin;

    }

    public static double KelvinVersCelcius(double tempKelvin) {
        double tempCelcius = (double) (tempKelvin - 273.15);
        return tempCelcius;
    }

    public static double FarenheitVersCelcius(double tempFareinheit) {
        double tempCelcius = (double) ((tempFareinheit - 32) * 5 / 9);
        return tempCelcius;
    }

    public static double CelciusVersFarenheit(double tempCelcius) {
        double tempFareinheit = (double) ((tempCelcius * 9 / 5) + 32);
        return tempFareinheit;
    }

    public static double KelvinVersFarenheit(double tempKelvin) {
        double tempFareinheit = (double) ((tempKelvin - 273.15) * 9 / 5 + 32);
        return tempFareinheit;
    }

    public static double FarenheitVersKelvin(double tempFareinheit) {
        double tempKelvin = (double) ((tempFareinheit - 32) * 5 / 9 + 273.15);
        return tempKelvin;
    }
}
 
    

