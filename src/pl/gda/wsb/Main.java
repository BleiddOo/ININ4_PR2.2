package pl.gda.wsb;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");
	    System.out.println("Hello world2");
        Animal zwierze1 = new Animal("Pies","Ssak",10);
        Animal zwierze2 = new Animal("Kot","Ssak",5);
        Human czlowiek1 = new Human("Adam",22,"niebieski");
        Human czlowiek2 = new Human("Karol",30,"zielony");
        Phone telefon1 = new Phone("iPhone", "czerwony", 5.5);
        Phone telefon2 = new Phone("Samsung", "szary", 5.7);
        System.out.println("Imie: " + czlowiek1.imie);
        System.out.println("Model telefonu: " + telefon1.producent);
        System.out.println("Rodzaj zwierzecia: " + zwierze1.nazwaZwierzecia);
        System.out.println("Imie: " + czlowiek2.imie);
        System.out.println("Model telefonu: " + telefon2.producent);
        System.out.println("Rodzaj zwierzecia: " + zwierze2.nazwaZwierzecia);

        if(zwierze1.waga > zwierze2.waga) {
            //System.out.println("Ciezszy jest: " + zwierze1.nazwaZwierzecia + ". Jego waga to: "+zwierze1.waga+" kg.");
            StringBuilder wagaCase1 = new StringBuilder("Ciezszy jest: ").append(zwierze1.nazwaZwierzecia).append(". Jego waga to: ").append(zwierze1.waga).append(" kg.");
            System.out.println(wagaCase1);
        }
        else if(zwierze1.waga < zwierze2.waga){
            //System.out.println("Ciezszy jest: " + zwierze2.nazwaZwierzecia + ". Jego waga to: "+zwierze2.waga+" kg.");
            StringBuilder wagaCase2 = new StringBuilder("Ciezszy jest: ").append(zwierze2.nazwaZwierzecia).append(". Jego waga to: ").append(zwierze2.waga).append(" kg.");
            System.out.println(wagaCase2);
        }
        else{
            //System.out.println("Zwierzeta waza tyle samo: " + zwierze1.waga + "kg");
            StringBuilder wagaCase3 = new StringBuilder("Zwierzeta waza tyle samo: ").append(zwierze1.waga).append("kg");
            System.out.println(wagaCase3);
        }

        ArrayList<Human> humanslist = new ArrayList<>();
        humanslist.add(czlowiek1);
        humanslist.add(czlowiek2);

        for(Human human : humanslist){
            System.out.println(human.imie);
        }
    }
}
