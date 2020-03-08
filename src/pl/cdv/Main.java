package pl.cdv;

public class Main {
    int age = 35;
    long value = 3000423111L;
    float pi = 3.1415f;
    double e = 2.7182818284590d;
    boolean isMale = true;
    double weight = 85d;
    char letterA = 'a';

    //Napisz program, który wyświetli trzy różne zdania opisujące aktualną pogodę
    //wraz z ich długością. W czwartej linii wypisz sumaryczną długość trzech
    //poprzednich zdań//
    static String czyPada = "Nie pada. ";
    static String czyZimno = "Jest ciepło. ";
    static String czyWieje = "Wieje łagodny wiatr. ";
    static String pogoda = czyPada + czyWieje + czyZimno;

    public static void main(String[] args) {
        System.out.printf(czyPada + "Prognoza pogody ma: %d znaków. \n",czyPada.length());
        System.out.printf(czyZimno + "Prognoza pogody ma: %d znaków. \n",czyZimno.length());
        System.out.printf(czyWieje + "Prognoza pogody ma: %d znaków. \n",czyWieje.length());
        System.out.printf(pogoda + "Prognoza pogody ma: %d znaków. \n",pogoda.length());
    }
}
