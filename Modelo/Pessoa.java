package Modelo;

public class Pessoa {
    
    public String nome;
    public int qtdLivrosLidos;
    public String livro;
    
    
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

public Biblioteca livros;




public Biblioteca getLivros() {
    return livros;
}
public void setLivros(Biblioteca livros) {
    this.livros = livros;
}


}

          
    
    

