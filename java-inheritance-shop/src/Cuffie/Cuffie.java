package Cuffie;

import Prodotto.Prodotto;

public class Cuffie extends Prodotto {
    private String tipologiaCollegamento;

    public Cuffie(String nome, String marca, double prezzo, String tipologiaCollegamento){
        super(nome, marca, prezzo);
        this.tipologiaCollegamento = tipologiaCollegamento;
    }

    public String getTipologiaCollegamento() {
        return tipologiaCollegamento;
    }

    public void setTipologiaCollegamento(String tipologiaCollegamento) {
        this.tipologiaCollegamento = tipologiaCollegamento;
    }

    @Override
    public String toString() {
        return "cuffie: " + getNome() + " marca: " + getMarca() + " prezzo: " + getPrezzo() + " tipologia collegamento: " + tipologiaCollegamento;
    }
    }
}
