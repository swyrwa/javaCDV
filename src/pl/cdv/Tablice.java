package pl.cdv;

import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
//        Zadanie 1
//        Stwórz tablicę na 3 imiona, którą wypełnisz imionami podanymi przez
//        użytkownika. Na koniec wyświetl je wszystkie
//
//        String[] imiona = new String[3];
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Podaj imię: ");
//        imiona[0] = scanner.next();
//        System.out.println("Podaj imię: ");
//        imiona[1] = scanner.next();
//        System.out.println("Podaj imię: ");
//        imiona[2] = scanner.next();
//
//        System.out.println(imiona[0]);
//        System.out.println(imiona[1]);
//        System.out.println(imiona[2]);

//        Zadanie 2
//        Zainicjalizuj tablicę 5 liczb, następnie wymnóż wszystkie te liczby i wypisz na
//        ekran konsoli

        int[] liczby = {1, 2, 3, 4, 5};
        int mnozenie = liczby[0]*liczby[1]*liczby[2]*liczby[3]*liczby[4];
        System.out.println(mnozenie);

        for(int i : liczby){

            System.out.println(i);
        }

    }
}
