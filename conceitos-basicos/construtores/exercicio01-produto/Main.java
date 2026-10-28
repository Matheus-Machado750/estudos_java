public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Chocolate", 20.99, 100);
        Produto produto2 = new Produto("Lápis", 3.50, 500);
        Produto produto3 = new Produto("Ventilador", 70.0, 0);

        produto1.exibirInformacoes();
        produto2.exibirInformacoes();
        produto3.exibirInformacoes();
    }
}