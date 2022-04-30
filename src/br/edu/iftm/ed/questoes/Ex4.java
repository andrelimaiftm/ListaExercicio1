package br.edu.iftm.ed.questoes;

import br.edu.iftm.ed.estruturas.Lista;

public class Ex4 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<>(10);
        lista.adiciona("A");
        lista.adiciona("B");
        try {
            lista.removePrimeiro();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(lista);

    }
}
