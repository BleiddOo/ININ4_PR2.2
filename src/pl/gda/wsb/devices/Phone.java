package pl.gda.wsb.devices;

public class Phone {
    String producent;
    String kolorObudowy;
    double wielkoscEkranu;

    public Phone(String producent, String kolorObudowy, double wielkoscEkranu) {
        this.producent = producent;
        this.kolorObudowy = kolorObudowy;
        this.wielkoscEkranu = wielkoscEkranu;
    }

    public String getProducent() {
        return producent;
    }

    public String getKolorObudowy() {
        return kolorObudowy;
    }

    public double getWielkoscEkranu() {
        return wielkoscEkranu;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producent='" + producent + '\'' +
                ", kolorObudowy='" + kolorObudowy + '\'' +
                ", wielkoscEkranu=" + wielkoscEkranu +
                '}';
    }
}
