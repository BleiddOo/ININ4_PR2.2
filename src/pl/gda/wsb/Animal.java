package pl.gda.wsb;

public class Animal {
    String nazwaZwierzecia;
    final String gatunek;
    private Double waga;

    public static final Double WAGA_PIES = 10.0;
    public static final Double WAGA_KOT = 5.0;
    public static final Double WAGA_MYSZ = 1.0;
    public static final Double WAGA_PODSTAWOWA = 25.0;


    public Double getWaga(){
        return waga;
    }
    public void setWaga(Double newWaga){
        this.waga = newWaga;
    }

    public Animal(String nazwaZwierzecia, String gatunek) {
        this.nazwaZwierzecia = nazwaZwierzecia;
        this.gatunek = gatunek;
        if(gatunek == "mysz"){
            waga = WAGA_MYSZ;
        }else if(gatunek == "pies"){
            waga = WAGA_PIES;
        }else if(gatunek == "kot"){
            waga = WAGA_KOT;
        }else{
            waga = WAGA_PODSTAWOWA;
        }
    }

    void feed(){
        waga = waga + 1;
        System.out.println(gatunek+" :Nakarmiles zwierze. Obecna waga to: "+waga);
    }
    void takeForAWalk(){


        if(waga <= 0){
            System.out.println(gatunek+ ": Waga jest zbyt mala. Zwierze umiera.");
        }else{
            waga = waga - 1;
            System.out.println(gatunek+ ": Wyprowadziles zwierze na spacer. Obecna waga to: "+waga);

        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nazwaZwierzecia='" + nazwaZwierzecia + '\'' +
                ", gatunek='" + gatunek + '\'' +
                ", waga=" + waga +
                '}';
    }
}
