package main.java.list.Pesquisa.SomaNumeros;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        for (int i = 0; i < 15; i++) {
            somaNumeros.adicionarNumero(ThreadLocalRandom.current().nextInt(0, 50 + 1));
        }

        System.out.println("Lista de números\n" + somaNumeros.exibirNumeros());

        System.out.println("\nSoma dos números: " + somaNumeros.calcularSoma());

        System.out.println("\nMaior número: " + somaNumeros.maiorValor());

        System.out.println("\nMenor número: " + somaNumeros.menorValor());
    }
}
