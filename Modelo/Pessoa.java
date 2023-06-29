package Modelo;

public class Pessoa {

    private String nome;
    private int qtdLivrosLidos;
    private String livro;
    private Biblioteca livros;

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdLivrosLidos() {
        return qtdLivrosLidos;
    }

    public void setQtdLivrosLidos(int qtdLivrosLidos) {
        this.qtdLivrosLidos = qtdLivrosLidos;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public Biblioteca getLivros() {
        return livros;
    }

    public void setLivros(Biblioteca livros) {
        this.livros = livros;
    }

    @Override
    public String toString() {
        return String.format("izabel leu o livro %s", getLivros());
    }

    

}
