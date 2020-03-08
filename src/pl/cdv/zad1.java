package pl.cdv;

import java.util.ArrayList;

public class zad1 {
    public static void main(String[] args) {
//        Zadanie 1
//        Oblicz ile jest liczb w parzystych w zbiorze liczb:
//        12, 67, 58, 49, 44, 21, 23, 22, 44, 59, 40.
//        Użyj tablicy oraz pętli

        int[] tablica = {12, 67, 58, 49, 44, 21, 23, 22, 44, 59, 40};
        ArrayList<Integer> parzyste = new ArrayList<>();

        int licznikparzystych = 0;
        for (int i : tablica) {
            if (i % 2 == 0) {
                licznikparzystych ++;

                parzyste.add(i);
            }
        }
        System.out.println("Ilość liczb parzystych: " +licznikparzystych);
        for (int i: parzyste){
            System.out.println(i);
        }
    }
}
