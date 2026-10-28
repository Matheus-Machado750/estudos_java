public class Main {
    public static void main(String[] args) {

        CadastroLivro livro1 = new CadastroLivro();
        CadastroLivro livro2 = new CadastroLivro();
        CadastroLivro livro3 = new CadastroLivro();

        livro1.cadastrar("Guerras Secretas");
        livro2.cadastrar("As Crônicas de Nárnia", "C. S. Lewis");
        livro3.cadastrar("O Hobbit", "J. R. R. Tolkien", 1937);
    }
}