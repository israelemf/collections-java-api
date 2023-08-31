package main.java.list.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(Integer numero) {
        numeros.add(numero);
    }

    public Integer calcularSoma() {
        Integer soma = 0;

        for (Integer numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public Integer maiorValor() {
        Integer maiorNumero = -9999999;
        for (Integer numero : numeros) {
            if (numero > maiorNumero) {
                maiorNumero = numero;
            }
        }
        return maiorNumero;
    }

    public Integer menorValor() {
        Integer menorNumero = 9999999;
        for (Integer numero : numeros) {
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        return menorNumero;
    }

    public List<Integer> exibirNumeros() {
        return numeros;
    }

}
