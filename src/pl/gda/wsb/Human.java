package pl.gda.wsb;

import java.util.Objects;

public class Human {
    String imie;
    int wiek;
    String kolorOczu;
    Animal pet;
    Car car;
    public Human(String imie, int wiek, String kolorOczu) {
        this.imie = imie;
        this.wiek = wiek;
        this.kolorOczu = kolorOczu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return wiek == human.wiek && Objects.equals(imie, human.imie) && Objects.equals(kolorOczu, human.kolorOczu) && Objects.equals(pet, human.pet) && Objects.equals(car, human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, wiek, kolorOczu, pet, car);
    }

    @Override
    public String toString() {
        return "Human{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                ", kolorOczu='" + kolorOczu + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
