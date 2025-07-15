
import Prodotto.Prodotto;

public class App {
    public static void main(String[] args) throws Exception {
        Prodotto prod = new Prodotto();

        prod.setNome("giuseppe");
        System.out.println(prod.getNome());
    }
}
