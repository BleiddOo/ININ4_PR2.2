package pl.gda.wsb;

public class Phone {
    String producent;
    String kolorObudowy;
    double wielkoscEkranu;

    public Phone(String producent, String kolorObudowy, double wielkoscEkranu) {
        this.producent = producent;
        this.kolorObudowy = kolorObudowy;
        this.wielkoscEkranu = wielkoscEkranu;
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
