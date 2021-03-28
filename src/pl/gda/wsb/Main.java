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
        Car samochod1 = new Car(Producer.OPEL,"Astra","Bozy");
        Car samochod2 = new Car(Producer.BMW,"E30","Niebieski");
        Car samochod3 = new Car(Producer.AUDI,"A3","Czarny");
        Human czlowiek1 = new Human("Adam",22,"niebieski");
        Human czlowiek2 = new Human("Karol",30,"zielony");
        Human czlowiek3 = new Human("Jan",15,"zielony");
        Human czlowiek4 = new Human("Jan",15,"zielony");
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
        ArrayList<Human> humansList = new ArrayList<>();
        humansList.add(czlowiek1);
        humansList.add(czlowiek2);
        czlowiek1.car = samochod1;
        czlowiek2.car = samochod2;
        czlowiek1.pet = zwierze1;
        czlowiek2.pet = zwierze2;
        for(Human human : humansList){
            System.out.println(human.imie+" "+ human.car.model +" "+human.pet.gatunek);
        }
        humansList.add(czlowiek3);
        System.out.println("-------------");
        for(Human human : humansList){
            System.out.println(human.imie);
        }
        zwierze1.feed();
        zwierze3.takeForAWalk();
        zwierze3.takeForAWalk();

        if(czlowiek3.equals(czlowiek4)) System.out.println("TRUE");
        else System.out.println("TRUE");

        System.out.println(czlowiek1);
    }
}
