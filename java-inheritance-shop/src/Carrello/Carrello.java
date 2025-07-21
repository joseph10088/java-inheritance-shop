package Carrello;

import Cuffie.Cuffie;
import Prodotto.Prodotto;
import Smartphone.Smartphone;
import Televisori.Televisori;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        /*
         * Create una classe Carrello con metodo main,
         *  in cui chiedete all’utente di valorizzare un carrello di prodotti con dati inseriti tramite scanner.
            Durante la richiesta di valorizzazione chiedete all’utente se sta inserendo uno Smarphone o un Televisore o Cuffie
            e in base alla scelta dell’utente utilizzate il costruttore opportuno.
            Al termine dell’inserimento stampate il carrello (fate l’override del metodo toString per restituire le informazioni da stampare per ogni classe)
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("cosa vuoi aggiungere al carrello ??\n" + "1. Smartphone\n" + "2. Televisione\n" + "3. cuffie");

        int scelta = scan.nextInt();

        Prodotto carrello1 = null;
        scan.nextLine();

        if(scelta == 1){
            System.out.println("smartphone: " + " scrivi: nome, marca, prezzo, memoria rom");
            String nomeSmartphone = scan.nextLine();
            String marcaSmartphone = scan.nextLine();
            double prezzoSmartphone = scan.nextDouble();
            int memoriaRomSmartphone = scan.nextInt();
            carrello1 = new Smartphone(nomeSmartphone, marcaSmartphone,prezzoSmartphone,memoriaRomSmartphone);
            System.out.println(carrello1);
        } else if (scelta == 2){
            System.out.println("televisore : " + "scrivi nome, marca, prezzo, dimensione display, smart: SI O NO ");
            String nome = scan.nextLine();
            String marca = scan.nextLine();
            Double prezzo = scan.nextDouble();
            int display = scan.nextInt();
            String smart = scan.nextLine();
            carrello1 = new Televisori(nome, marca, prezzo, display, smart);
            System.out.println(carrello1);
        } else if (scelta == 3){
            System.out.println("cuffie : " + "nome , marca , prezzo , tipologia collegamento: cablato o wireless");
            String nome = scan.nextLine();
            String marca = scan.nextLine();
            Double prezzo = scan.nextDouble();
            String tipologiaCollegamento = scan.nextLine();
            carrello1 = new Cuffie(nome, marca, prezzo, tipologiaCollegamento);
            System.out.println(carrello1);
        }
    }
}