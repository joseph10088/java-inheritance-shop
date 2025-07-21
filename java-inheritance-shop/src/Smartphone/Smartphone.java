package Smartphone;

import Prodotto.Prodotto;

public class Smartphone extends Prodotto {
    private int memoriaRom;

    public Smartphone(String nome, String marca, double prezzo, int memoriaRom){
        super(nome, marca, prezzo);
        this.memoriaRom = memoriaRom;
    }

    public void setMemoriaRom(int memoriaRom) {
        this.memoriaRom = memoriaRom;
    }

    public int getMemoriaRom() {
        return memoriaRom;
    }

    @Override
    public String toString() {
        return "smartphone: " + getNome() + " marca: " + getMarca() + " prezzo: " + getPrezzo() + " memoria rom: " + memoriaRom + "GB";
    }
}
