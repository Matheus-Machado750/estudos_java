public class CadastroLivro {

    String nomeAutor;
    String nomeLivro;
    int ano;

    void cadastrar(String nomeLivro){
        System.out.printf("Nome do Livro: %s | Autor: ? | Ano: ? %n", nomeLivro);
    }

    void cadastrar(String nomeLivro, String nomeAutor){
        System.out.printf("Nome do Livro: %s | Autor: %s | Ano: ? %n", nomeLivro, nomeAutor);
    }

    void cadastrar(String nomeLivro, String nomeAutor, int ano){
        System.out.printf("Nome do Livro: %s | Autor: %s | Ano: %d %n", nomeLivro, nomeAutor, ano);
    }

}
