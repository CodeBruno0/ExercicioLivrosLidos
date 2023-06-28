package Modelo;

public class Biblioteca {
    
    public String titulo;
    public String autor;
    public int numPagina;

    //comentario aqui
    
    @Override
    public String toString() {
        return "Biblioteca [titulo=" + titulo + ", autor=" + autor + ", numPagina=" + numPagina + "]";
    }
    public Biblioteca(String titulo, String autor, int numPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getNumPagina() {
        return numPagina;
    }
    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }
    public void qtd() {
    }
    
}
