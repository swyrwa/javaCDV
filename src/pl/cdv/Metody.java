package pl.cdv;

import java.util.Scanner;

public class Metody {
    public static void main(String[] args) {
//        Przykład 2
//        Napiszmy kolejną metodę w tej samej klasie, która będzie liczyć średnią
//        arytmetyczną dla podanych liczb
//        Średnia nie musi być liczbą całkowitą zatem dobierzemy zwracany typ jako
//        float. Parametrem będzie tablica, w której zdefiniujemy wartości liczbowe dla
//        kolejnych indeksów. Tablicę inicjalizujemy w metodzie main()
//        int[] tablica = {2, 4, 67};
//        System.out.println(srednia(tablica));

        System.out.println(wyswietlNapis("krystyna", "kloska"));
        int[] cyferkoLiczby = { 8, 2, 0, -2};
        System.out.println(zwrocNajmniejszy(cyferkoLiczby));
    }

    //    Stwórz funkcję, która w tablicy podanej jako argument znajdzie element
//    najmniejszy i go zwróci.

    public static int zwrocNajmniejszy(int tablica[]) {
        int najmniejsza = tablica[0];
        for (int i : tablica) {
            if (i < najmniejsza) {
                najmniejsza = i;
            }
        }
        return najmniejsza;
    }

    public static float srednia(int tablica[]) {
        int suma = 0;
        for (int i : tablica) {
            suma += i;
        }
        float sredniaArytmetyczna = suma / (float) tablica.length;
        return sredniaArytmetyczna;
    }

    //    Stwórz funkcję, która będzie miała za zadanie wyświetlić napis: „Hello, I am
//    {name} {lastname}”. Pamiętaj, że name i lastname powinny być osobnymi
//    argumentami. Zastanów się lepiej zastosować funkcję void i wyświetlić
//    automatycznie napis, czy może zwrócić zbudowanego Stringa i dopiero
//    wyświetlić go w funkcji main()?
    public static String wyswietlNapis(String imie, String nazwisko) {
        return "Hello, I am " + imie.toUpperCase() + " " + nazwisko.toUpperCase();
    }


}



