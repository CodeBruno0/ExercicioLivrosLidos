package App;

import java.util.Scanner;

import Modelo.Biblioteca;
import Modelo.Pessoa;


public class App {
    public static void main(String[] args) throws Exception {
        

        System.out.println("*******************************");
        System.out.println("Bem vindo a Biblioteca Virtual!");
        System.out.println("*******************************");
        Scanner scan = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Izabel");
        
        
Biblioteca livro = new Biblioteca();
livro.setNome("Um livro qualquer.");
pessoa.setLivros(livro);

        System.out.printf("Ola %s, os livros lidos foram, %s ", pessoa.getNome(), pessoa.getLivros());

    }

}
