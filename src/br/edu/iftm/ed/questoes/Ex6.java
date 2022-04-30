package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.classes.Contato;
import br.edu.iftm.ed.estruturas.Lista;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Lista<Contato> lista = new Lista<>(20);
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < 30; i++) {
            System.out.println("Nome: ");
            String nome = entrada.next();
            System.out.println("Telefone: ");
            String telefone = entrada.next();
            System.out.println("Email: ");
            String email = entrada.next();
            Contato c = new Contato(nome, telefone, email);
            lista.adiciona(c);
        }
        System.out.println(lista);
    }
}
