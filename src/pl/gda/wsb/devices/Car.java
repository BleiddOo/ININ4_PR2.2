package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car {
    final String model;
    final Producer producer;
    private Double wartosc;
    String color;

    public Car(Producer producer, String model, String color,Double wartosc){
        this.model = model;
        this.producer = producer;
        this.color = color;
        this.wartosc = wartosc;
    }

    public Double getWartosc() {
        return wartosc;
    }

    public String getModel() {
        return model;
    }

    public Producer getProducer() {
        return producer;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", producer=" + producer +
                ", color='" + color + '\'' +
                '}';
    }
}
