package pl.gda.wsb.devices;
import  pl.gda.wsb.Producer;
public class Phone extends Device {
    String kolorObudowy;
    double wielkoscEkranu;

    public Phone(Producer producer, String kolorObudowy, double wielkoscEkranu,String model, Integer yearOfProduction ) {
        super(producer,model,yearOfProduction);
        this.kolorObudowy = kolorObudowy;
        this.wielkoscEkranu = wielkoscEkranu;
    }

    public String getProducent() {
        return producer.name();
    }

    public String getKolorObudowy() {
        return kolorObudowy;
    }

    public double getWielkoscEkranu() {
        return wielkoscEkranu;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "producent='" + producer + '\'' +
                ", kolorObudowy='" + kolorObudowy + '\'' +
                ", wielkoscEkranu=" + wielkoscEkranu +
                '}';
    }
}
