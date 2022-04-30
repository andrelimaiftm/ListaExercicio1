package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.classes.Livro;

import java.util.Scanner;
import java.util.Stack;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Stack<Livro> pilha = new Stack<>();
        for (int i = 0; i < 2; i++) {
            System.out.println("Nome: ");
            String nome = entrada.nextLine();
            System.out.println("isbn: ");
            String isbn = entrada.nextLine();
            System.out.println("ano lancamento: ");
            int ano = entrada.nextInt();
            entrada.nextLine();
            System.out.println("nome autor: ");
            String autor = entrada.nextLine();
            Livro l = new Livro(nome, isbn, ano, autor);
            pilha.push(l);
        }
        System.out.println(pilha);

    }
}
