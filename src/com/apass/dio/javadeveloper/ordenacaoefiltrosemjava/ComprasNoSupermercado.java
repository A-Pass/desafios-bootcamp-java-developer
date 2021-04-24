package com.apass.dio.javadeveloper.ordenacaoefiltrosemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// 2. Compras no Supermercado

public class ComprasNoSupermercado {
    public static void main(String[] args) throws NumberFormatException, IOException {

	var br = new BufferedReader(new InputStreamReader(System.in));

	var numeroEntradas = Integer.parseInt(br.readLine());

	List<SortedSet<String>> listas = new ArrayList<>();

	for (var contador = 0; contador < numeroEntradas; contador++) {
	    var lista = new TreeSet<String>();
	    var itens = br.readLine().split(" ");
	    for (var item : itens) {
		lista.add(item.toLowerCase());
	    }
	    listas.add(lista);
	}

	for (var lista : listas) {
	    System.out.println(String.join(" ", lista));
	}
    }
}
