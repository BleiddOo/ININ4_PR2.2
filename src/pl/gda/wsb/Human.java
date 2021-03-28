package pl.gda.wsb;

import pl.gda.wsb.devices.Car;

import java.util.Date;
import java.util.Objects;

public class Human {
    String imie;
    int wiek;
    String kolorOczu;
    private Double salary;
    Animal pet;
    Car car;

    public Double getSalary() {
        System.out.println(new Date() + ": Pobrano informacje o wysklosci zarobkow - "+this);
        return salary;
    }

    public void setSalary(Double salary) {
        if(salary < 0) System.out.println("Bład!");
        else{
            System.out.println("Nowe dane zostały wysłane do systemu księgowego!");
            System.out.println("Konieczność odebrania aneksu do umowy od pani Hani z kadr!");
            System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu!");
            this.salary = salary;
        }

    }

    public Human(String imie, int wiek, String kolorOczu, Double salary) {
        this.imie = imie;
        this.wiek = wiek;
        this.kolorOczu = kolorOczu;
        this.salary = salary;
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
