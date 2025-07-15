package Prodotto;

import java.util.Random;

public class Prodotto {
private int codice;
private String nome;
private String marca;
private double prezzo;
private double iva;

public Prodotto(){
    Random rand = new Random();
    codice = rand.nextInt(100) + 1;
    this.nome = nome;
    this.marca = marca;
    this.prezzo = prezzo;
    this.iva = iva;
}

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
