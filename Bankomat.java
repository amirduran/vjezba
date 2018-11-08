package com.company;

import java.util.Scanner;

public class Bankomat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int pinPohranjenUBaziBanke = 5587;
        double stanjeRacuna = 500.78;


        System.out.println("Unesite Vas pin");
        int pinKojiJeUnioKorisnik = in.nextInt();

        if (pinKojiJeUnioKorisnik == pinPohranjenUBaziBanke) {

            System.out.println("Unesite iznos koji zelite podici");
            int iznosZaPodici = in.nextInt();

            if (iznosZaPodici > stanjeRacuna) {
                System.out.println("Nemate dovoljno sredstava");
            }
            else {
                System.out.println("Izbacujem novac");
                stanjeRacuna = stanjeRacuna - iznosZaPodici;

                System.out.println("Novo stanje racuna je: " + stanjeRacuna);
            }
        }
        else {
            System.out.println("Pogresan PIN");
        }
    }
}
