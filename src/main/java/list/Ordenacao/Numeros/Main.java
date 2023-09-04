package main.java.list.Ordenacao.Numeros;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        for (int i = 0; i < 15; i++) {
            ordenacaoNumeros.adicionarNumero(ThreadLocalRandom.current().nextInt(0, 50 + 1));
        }

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
