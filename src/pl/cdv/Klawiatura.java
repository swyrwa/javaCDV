package pl.cdv;

import java.util.Scanner;

public class Klawiatura {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int firstValue;
        float secondValue;
        System.out.println("Podaj liczbe całkowitą: ");
        firstValue = scanner.nextInt();
        System.out.println("Podaj liczbę ułamkową: ");
        secondValue = scanner.nextFloat();
        System.out.println("Liczba całkowita to: " + firstValue);
        System.out.println("Liczba całkowita to: " + secondValue);
        String slowo;
        System.out.println("Podaj słowo: ");
        slowo = scanner.next();
        System.out.println("Podane słowo to: " + slowo);*/

        //Wczytaj od użytkownika imię, nazwisko, wiek, wzrost oraz wagę, a następnie
        //wyświetl na ekran konsoli napis:
        //„Nazywasz się {imię} {nazwisko}, masz {wiek} lat, masz {wzrost} cm wzrostu
        //oraz ważysz {waga} kg”
//        String imie;
//        String nazwisko;
//        int wiek;
//        float wzrost;
//        float waga;
//
//        System.out.println("Podaj imię: ");
//        imie = scanner.next();
//        System.out.println("Podaj nazwisko: ");
//        nazwisko = scanner.next();
//        System.out.println("Podaj wiek: ");
//        wiek = scanner.nextInt();
//        System.out.println("Podaj wzrost: ");
//        wzrost = scanner.nextFloat();
//        System.out.println("Podaj wagę: ");
//        waga = scanner.nextFloat();
//        System.out.println("Nazywasz się " + imie +" "+ nazwisko + " , masz " + wiek + " lat, " + "masz "+ wzrost +
//                " cm wzrostu" + " oraz ważysz "+ waga + "kg.");

//        int resultValue = 3 + 5 * 4 - 10 * 2;
//        System.out.println(resultValue);

//        Na podstawie liczby podanej przez użytkownika wypisz użytkownikowi
//        następujące informacje:
//
        int podanaLiczba;
        System.out.println("Podaj liczbe całkowita: ");
        podanaLiczba = scanner.nextInt();

//        Podana liczba jest większa od 10: (true/false)
        boolean wiekszaOd10 = podanaLiczba>10;
        System.out.println("Podana liczba jest większa od 10: " + wiekszaOd10);

//        Podana liczba jest równa 0: (true/false)
        boolean rowna0 = podanaLiczba==0;
        System.out.println("Podana liczba jest równa 0: " + rowna0);

//        Podana liczba jest mniejsza 50: (true/false)
        boolean mniejszaOd50 = podanaLiczba<50;
        System.out.println("Podana liczba jest mniejsza 50: " + mniejszaOd50);

//        Podana liczba jest większa bądź równa 20: (true/false)
        boolean wiekszarowna20 = podanaLiczba>=20;
        System.out.println("Podana liczba jest większa bądź równa 20: " + wiekszarowna20);

//        Podana liczba jest mniejsza bądź równa 30: (true/false)
        boolean mniejszaRowna30 = podanaLiczba<=30;
        System.out.println("Podana liczba jest mniejsza bądź równa 30: " + mniejszaRowna30);

//        Podana liczba jest różna od 5: (true/false)
        boolean roznaOd5 = podanaLiczba!=5;
        System.out.println("Podana liczba jest różna od 5: " + roznaOd5);

//        Podana liczba jest większa od 5 i mniejsza od 10
        boolean wiekszaOd5iMniejszaOd10 = podanaLiczba >5 && podanaLiczba < 10;
        System.out.println("Podana liczba jest wieksza od 5 i mniejsza od 10: " + wiekszaOd5iMniejszaOd10);
    }
}
