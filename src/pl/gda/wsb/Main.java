package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

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
        Human czlowiek1 = new Human("Adam",22,"niebieski",3000.0);
        Human czlowiek2 = new Human("Karol",30,"zielony",4000.0);
        Human czlowiek3 = new Human("Jan",15,"zielony",5000.0);
        Human czlowiek4 = new Human("Jan",15,"zielony",6000.0);
        Phone telefon1 = new Phone("iPhone", "czerwony", 5.5);
        Phone telefon2 = new Phone("Samsung", "szary", 5.7);

        System.out.println("Imie: " + czlowiek1.imie);
        System.out.println("Model telefonu: " + telefon1.getProducent());
        System.out.println("Rodzaj zwierzecia: " + zwierze1.nazwaZwierzecia);
        System.out.println("Imie: " + czlowiek2.imie);
        System.out.println("Model telefonu: " + telefon2.getProducent());
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
            System.out.println(human.imie+" "+ human.car.getModel() +" "+human.pet.gatunek);
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

        czlowiek1.setSalary(-750.0);
        czlowiek1.setSalary(1550.0);
    }
}
