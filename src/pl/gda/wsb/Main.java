package pl.gda.wsb;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");
	    System.out.println("Hello world2");
        Animal zwierze = new Animal("Pies","Ssak");
        Human czlowiek1 = new Human("Adam",22,"niebieski");
        Phone telefon1 = new Phone("iPhone", "czerwony", 5.5);
        System.out.println("Imie: " + czlowiek1.imie);
        System.out.println("Model telefonu: " + telefon1.model);
        System.out.println("Rodzaj zwierzecia: " + zwierze.nazwaZwierzecia);
    }
}
