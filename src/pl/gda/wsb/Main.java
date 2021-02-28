package pl.gda.wsb;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");
	    System.out.println("Hello world2");
        Animal zwierze1 = new Animal("Pies","Ssak");
        Animal zwierze2 = new Animal("Kot","Ssak");
        Human czlowiek1 = new Human("Adam",22,"niebieski");
        Human czlowiek2 = new Human("Karol",30,"zielony");
        Phone telefon1 = new Phone("iPhone", "czerwony", 5.5);
        Phone telefon2 = new Phone("Samsung", "szary", 5.7);
        System.out.println("Imie: " + czlowiek1.imie);
        System.out.println("Model telefonu: " + telefon1.model);
        System.out.println("Rodzaj zwierzecia: " + zwierze1.nazwaZwierzecia);
        System.out.println("Imie: " + czlowiek2.imie);
        System.out.println("Model telefonu: " + telefon2.model);
        System.out.println("Rodzaj zwierzecia: " + zwierze2.nazwaZwierzecia);
    }
}
