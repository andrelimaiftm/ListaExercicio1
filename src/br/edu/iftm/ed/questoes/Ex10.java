package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.classes.Livro;
import br.edu.iftm.ed.estruturas.Pilha;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Pilha<Livro> pilha = new Pilha<>(20);
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
            pilha.empilhar(l);
        }
        System.out.println(pilha);
    }
}
