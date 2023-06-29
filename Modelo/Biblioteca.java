package Modelo;

public class Biblioteca {
    
    private String nome;
    private int numPagina;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumPagina() {
        return numPagina;
    }
    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }
    @Override
    public String toString() {
        return String.format(getNome());
    }

    //comentario aqui
    
       
}
