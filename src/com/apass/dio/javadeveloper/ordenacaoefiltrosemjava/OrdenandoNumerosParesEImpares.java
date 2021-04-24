package com.apass.dio.javadeveloper.ordenacaoefiltrosemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 1. Ordenando Números Pares e Ímpares

public class OrdenandoNumerosParesEImpares {
    public static void main(String[] args) throws NumberFormatException, IOException {

	var br = new BufferedReader(new InputStreamReader(System.in));

	var numeroEntradas = Integer.parseInt(br.readLine());

	List<Integer> pares = new ArrayList<>();
	List<Integer> impares = new ArrayList<>();

	for (var contador = 0; contador < numeroEntradas; contador++) {
	    var valor = Integer.parseInt(br.readLine());

	    if (valor % 2 == 0) {
		pares.add(valor);
	    } else {
		impares.add(valor);
	    }

	}
	Collections.sort(pares);
	Collections.sort(impares);

	Collections.reverse(impares);

	for (var valor : pares) {
	    System.out.println(valor.toString());
	}

	for (var valor : impares) {
	    System.out.println(valor.toString());
	}
    }
}
