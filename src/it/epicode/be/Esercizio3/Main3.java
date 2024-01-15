package it.epicode.be.Esercizio3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;


        }
        System.out.println(Arrays.toString(array));

        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("Inserisci un numero da 1 a 10 (0 se vuoi terminare il processo):");

            int num = scan.nextInt();

            if (num == 0) {
                break;
            }

            System.out.println("Ora inserisci un numero da 1 a 5 per determinare la posizione");

            int position = scan.nextInt() - 1;


            try {
                array[position] = num;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Uh oh..");
            }

            System.out.println(Arrays.toString(array));

        }


    }


}



