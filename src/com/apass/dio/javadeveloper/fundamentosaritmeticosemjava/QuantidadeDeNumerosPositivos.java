package com.apass.dio.javadeveloper.fundamentosaritmeticosemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 1. Quantidade de Números Positivos

public class QuantidadeDeNumerosPositivos {
    public static void main(String[] args) throws IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	double[] valores = new double[6];
	int qtdPositivos = 0;

	for (int contador = 0; contador < 6; contador++) {
	    valores[contador] = Double.parseDouble(br.readLine());

	    if (valores[contador] > 0) {
		qtdPositivos++;
	    }

	}

	System.out.println(qtdPositivos + " valores positivos");
    }
}