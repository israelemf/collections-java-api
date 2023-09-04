package main.java.list.Ordenacao.Numeros;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosDescendente = new ArrayList<>(numeros);
        numerosDescendente.sort(Collections.reverseOrder());
        return numerosDescendente;
    }
}
