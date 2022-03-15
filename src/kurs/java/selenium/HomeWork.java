package kurs.java.selenium;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        double firtsNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        double secoundNumber = scanner.nextInt();

        System.out.println("Pierwsza liczba:" + firtsNumber);
        System.out.println("Druga liczba:" + secoundNumber);
        System.out.println("Operacje matematyczne");
        double wynik = firtsNumber + secoundNumber;
        System.out.println("Suma liczb: "+firtsNumber+" + "+secoundNumber + " = " + wynik);

        wynik = firtsNumber * secoundNumber;
        System.out.println("różnica liczb: "+firtsNumber+" - "+secoundNumber + " = " + wynik);

        wynik = firtsNumber % secoundNumber;
        System.out.println("modulo liczb: "+firtsNumber+" % "+secoundNumber + " = " + wynik);

        wynik = firtsNumber / secoundNumber;
        System.out.println("dzielenie liczb: "+firtsNumber+" * "+secoundNumber + " = " + wynik);

        wynik = firtsNumber * secoundNumber;
        System.out.println("iloczyn liczb: "+firtsNumber+" * "+secoundNumber + " = " + wynik);


    }
        // napisz program który poprosi użytkownika o 2 liczby, a następnie wykona na nich podstawowe operacje matematyczne

}
