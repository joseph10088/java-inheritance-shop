package Televisori;

import Prodotto.Prodotto;

public class Televisori extends Prodotto {
    private int dimensioniDisplay;
    private String smart;

    public Televisori(String nome, String marca, double prezzo, int dimensioniDisplay, String smart){
        super(nome, marca, prezzo);
        this.dimensioniDisplay = dimensioniDisplay;
        this.smart = smart;
    }

    public double getDimensioniDisplay() {
        return dimensioniDisplay;
    }

    public void setDimensioniDisplay(int dimensioniDisplay) {
        this.dimensioniDisplay = dimensioniDisplay;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    @Override
    public String toString() {
        return "televisore: " + getNome() + " marca: " + getMarca() + " prezzo: " + getPrezzo() + " dimesione display: " + dimensioniDisplay + " smart: " + smart;
    }
}
