package sample;

import javafx.beans.property.SimpleStringProperty;

public class Animal {

    private SimpleStringProperty meno;
    private SimpleStringProperty datum_narodenia;
    private SimpleStringProperty stav;
    private SimpleStringProperty zdravotna_karta;
    private SimpleStringProperty  trieda;
    private SimpleStringProperty rad;
    private SimpleStringProperty celad;
    private SimpleStringProperty druh;

    public Animal(String meno, String datum_narodenia, String stav,String zdravotna_karta, String trieda, String rad,String celad,String druh){
        this.meno = new SimpleStringProperty(meno);
        this.datum_narodenia = new SimpleStringProperty(datum_narodenia);
        this.stav = new SimpleStringProperty(stav);
        this.zdravotna_karta = new SimpleStringProperty(zdravotna_karta);
        this.trieda = new SimpleStringProperty(trieda);
        this.rad = new SimpleStringProperty(rad);
        this.celad = new SimpleStringProperty(celad);
        this.druh = new SimpleStringProperty(druh);
    }

    public String getMeno() {
        return meno.get();
    }

    public void setMeno(String meno) {
        this.meno = new SimpleStringProperty(meno);
    }

    public String getDatum_narodenia() { return datum_narodenia.get(); }

    public String getStav() {
        return stav.get();
    }

    public String getZdravotna_karta() {
        return zdravotna_karta.get();
    }

    public String getTrieda() {
        return trieda.get();
    }

    public String getRad() {
        return rad.get();
    }

    public String getCelad() {
        return celad.get();
    }

    public String getDruh(){return druh.get();}
}
