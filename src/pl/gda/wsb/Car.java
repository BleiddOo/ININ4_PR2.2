package pl.gda.wsb;

public class Car {
    final String model;
    final Producer producer;
    String color;

    public Car(Producer producer, String model, String color){
        this.model = model;
        this.producer = producer;
        this.color = color;
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
