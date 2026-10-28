public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;

    Produto(String nome, double preco, int quantidadeEmEstoque){
        this.nome = nome;
        this .preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    void exibirInformacoes(){
        System.out.println("Nome do produto: " + nome);
        System.out.println("Preço do produto: " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);

        if (quantidadeEmEstoque > 0){
            System.out.println("Produto disponível.");
        } else {
            System.out.println("Produto indisponível.");
        }

        System.out.println("==========================");
    }
}
