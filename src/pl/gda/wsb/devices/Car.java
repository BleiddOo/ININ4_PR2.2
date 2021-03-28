package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car {
    final String model;
    final Producer producer;
    String color;

    public Car(Producer producer, String model, String color){
        this.model = model;
        this.producer = producer;
        this.color = color;
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
