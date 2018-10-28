package com.company;

public class Main {

    public static void main(String[] args) {

        //Definisanje stope poreza
        double stopaPoreza = 0.43;
        String valuta = "€";

        //Definisanje plata radnika
        double plataRadnika1 = 3500;
        double plataRadnika2 = 3200;

        //Racunanje plate radnika
        double porezNaPlatuRadnika1 = plataRadnika1 * stopaPoreza;
        double netoPlataRadnika1 = plataRadnika1 - porezNaPlatuRadnika1;

        String text = "Iznos poreza za radnika 1 je: ";
        //Printanje plata radnika
        System.out.println(text + porezNaPlatuRadnika1 + valuta);
        System.out.println("Neto plata radnika 1 je: " + netoPlataRadnika1 + valuta);
    }
}
