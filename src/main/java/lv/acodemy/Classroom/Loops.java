package lv.acodemy.Classroom;

import java.util.Random;
import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        //for; foreach, do while, while;

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }


        String[] fruits = {"apple", "banana", "kiwi", "orange", "pear"};
        //fruits[0] = apple
        //fruits[1] = banana
        //.....

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");


            if (fruits[i].equals("kiwi")) {
                System.out.println("I found kiwi!");
                break;
            }

        }

        // enhanced for (projtisj po vsemu massivu)

        for (String fruit : fruits) {
            System.out.println("fruit = " + fruit);

        }

        // Print numbers from 20 to 40.

        for (int x = 20; x < 41; x++) {
            System.out.println(x + " ");
        }

        // Calculate the sum of all even numbers between 1 and 100.

        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }

        }
        System.out.println("Sum of even numbers: " + sum);

        // Print the multiplication table of a given number

        //6;

        int number = 6;
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * number + " ");
        }


        // WHILE LOOP

        int i = 10;
        while (i > 0) {
            System.out.println("Hello World!");
            i--;
        }

        int j = 0;
        while (j < 10) {
            System.out.println("HELLO!!!");
            j++;
        }

        int k = 0;
        do {
            System.out.println("HOLAAA");
            k++;
        } while (k < 10);


        Scanner myScanner = new Scanner(System.in);
        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(5);

        boolean isGuessed = false;
        while (!isGuessed) {
            System.out.println("Please enter number I guessed:");
            int inputNumber = myScanner.nextInt();
            if (randomNumber == inputNumber) {
                System.out.println("BITCH U GUESSED IT!");
                isGuessed = true;
            } else {
                System.out.println("TRY AGAIN!");
            }

        }

        // TODO: Limit guess with 3 times;

        // PEREVERNUTJ IMJA

        String name = "Lana";
        String reversed = "";
        for (int l = name.length() - 1; l >= 0; l--) {
            reversed = reversed + name.charAt(l);
        }
        System.out.println(reversed);

    }
}

        


