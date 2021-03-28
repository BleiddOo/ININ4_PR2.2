package pl.gda.wsb;

public class Human {
    String imie;
    int wiek;
    String kolorOczu;
    Animal pet;
    Car car;
    public Human(String imie, int wiek, String kolorOczu, Car car) {
        this.imie = imie;
        this.wiek = wiek;
        this.kolorOczu = kolorOczu;
        this.car = car;
    }
}
