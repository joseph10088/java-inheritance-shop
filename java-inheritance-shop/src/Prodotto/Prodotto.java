package Prodotto;

import java.util.Random;

public class Prodotto {
private int codice;
private String nome;
private String marca;
private double prezzo;
private double iva;

public Prodotto(String nome, String marca, double prezzo){
    Random rand = new Random();
    codice = rand.nextInt(100) + 1;
    this.nome = nome;
    this.marca = marca;
    this.prezzo = prezzo;
    this.iva = 22;
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

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public void setPrezzo(double prezzo){
        this.prezzo = prezzo;
    }

    public double getIva(){
        return iva;
    }

    public void setIva(double iva){
        this.iva = iva;
    }
}
