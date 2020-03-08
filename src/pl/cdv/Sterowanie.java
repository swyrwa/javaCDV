package pl.cdv;

import java.util.Scanner;

public class Sterowanie {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Parzysta liczba lub nie; modulo do sprawdzenia że parzysta:

        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        boolean isEvenNumber = number % 2 == 0;
        boolean isNegative = number < 0;
        boolean isPositive = number > 0;

        if (isEvenNumber) {
            System.out.println("Liczba " + number + " jest parzysta!");
            }
        else {
                System.out.println("Liczba " + number + " jest nieparzysta!");
            }

        if (isNegative) {
                System.out.println("Liczba " + number + " jest ujemna!");
            }
        else if (isPositive) {
                System.out.println("Liczba " + number + " jest dodatnia!");
        }
        else {
                System.out.println("Liczba " + number + " jest równa 0!");

            }
        }

    }


