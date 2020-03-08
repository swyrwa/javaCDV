package pl.cdv;

import java.util.ArrayList;
import java.util.Scanner;

public class Listy {
    public static void main(String[] args) {
//        Zadanie 1
//        Napisz aplikację, która będzie pobierać imiona wprowadzane przez
//        użytkownika do momentu wprowadzenia znaku ‘-‘
//        Imiona zapisuj do listy ArrayList
//        Po wprowadzeniu znaku ‘-‘ poproś użytkownika o podanie indeksu od 0 do
//            długości wypełnionej listy i zwróć imię spod tej pozycji

        ArrayList<String> imiona = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String podaneImie = "tak";
        while (!podaneImie.equals("-")) {
            System.out.println("Podaj imie: ");
            podaneImie = scanner.next();
            if (podaneImie.equals("-")) {
                System.out.println("Podaj nr indeksu od 0 do " + (imiona.size()-1));
                int podanyIndeks = scanner.nextInt();
                System.out.println(imiona.get(podanyIndeks));
            } else {
                imiona.add(podaneImie);
            }
        }
    }
}
