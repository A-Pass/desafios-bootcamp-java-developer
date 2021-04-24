package com.apass.dio.javadeveloper.solucaodeproblemascomjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

// 1. Contagem repetida de números

public class ContagemRepetidaDeNumeros {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	sc.useLocale(Locale.ENGLISH);
	Locale.setDefault(new Locale("en", "US"));

//declare as variaveis corretamente e continue a sua solução

	ArrayList<Integer> lista = new ArrayList<Integer>();

	int contador = sc.nextInt();
	while (contador-- > 0)
	    lista.add(sc.nextInt());

	SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
	lista.forEach(id -> contaQuant.compute(id,
		(numero, id2) -> (contaQuant.get(id) == null ? 1 : contaQuant.get(id) + 1)));

	contaQuant.entrySet().forEach(entry -> {
	    System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
	});

	sc.close();
    }
}