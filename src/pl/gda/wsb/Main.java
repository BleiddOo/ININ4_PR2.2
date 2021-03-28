package pl.gda.wsb;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello world");
	    System.out.println("Hello world2");
        Animal zwierze1 = new Animal("Azor","pies");
        Animal zwierze2 = new Animal("Maurycy","kot");
        Animal zwierze3 = new Animal("Tom","mysz");
        Car samochod1 = new Car("Opel","Astra","Bozy");
        Car samochod2 = new Car("Ford","Mustang","Niebieski");
        Car samochod3 = new Car("Audi","A3","Czarny");
        Human czlowiek1 = new Human("Adam",22,"niebieski", samochod1);
        Human czlowiek2 = new Human("Karol",30,"zielony",samochod2);
        Human czlowiek3 = new Human("Jan",15,"zielony", samochod3);
        Phone telefon1 = new Phone("iPhone", "czerwony", 5.5);
        Phone telefon2 = new Phone("Samsung", "szary", 5.7);

        System.out.println("Imie: " + czlowiek1.imie);
        System.out.println("Model telefonu: " + telefon1.producent);
        System.out.println("Rodzaj zwierzecia: " + zwierze1.nazwaZwierzecia);
        System.out.println("Imie: " + czlowiek2.imie);
        System.out.println("Model telefonu: " + telefon2.producent);
        System.out.println("Rodzaj zwierzecia: " + zwierze2.nazwaZwierzecia);

        if(zwierze1.getWaga() > zwierze2.getWaga()){
            System.out.println("Ciezszy jest: " + zwierze1.nazwaZwierzecia + ". Jego waga to: "+zwierze1.getWaga()+" kg.");
        }
        else if(zwierze1.getWaga() < zwierze2.getWaga()){
            System.out.println("Ciezszy jest: " + zwierze2.nazwaZwierzecia + ". Jego waga to: "+zwierze2.getWaga()+" kg.");
        }
        else{
            System.out.println("Zwierzeta waza tyle samo: " + zwierze1.getWaga() + "kg");
        }
        ArrayList<Human> humanslist = new ArrayList<>();
        humanslist.add(czlowiek1);
        humanslist.add(czlowiek2);

        for(Human human : humanslist){
            System.out.println(human.imie+" "+ human.car.model);
        }
        humanslist.add(czlowiek3);
        System.out.println("-------------");
        for(Human human : humanslist){
            System.out.println(human.imie);
        }
        zwierze1.feed();
        zwierze3.takeForAWalk();
        zwierze3.takeForAWalk();
    }
}
