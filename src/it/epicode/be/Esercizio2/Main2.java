package it.epicode.be.Esercizio2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Inserisci i kilometri percorsi (anche decimali)");
            double km = scanner.nextDouble();

            System.out.println("Ora inserisci i litri di carburante consumati");
            double litres = scanner.nextDouble();

            calculateKilometer(km, litres);


        } catch (ArithmeticException e) {
            System.out.println("HAI DIVISO PER ZERO !1!111!");
        }

    }

    private static void calculateKilometer(double km, double litres) {
        double division = km / litres;
        if (litres == 0) {
            throw new ArithmeticException("Hai diviso per zero!!!");

        }
        System.out.println(division);

    }
}
