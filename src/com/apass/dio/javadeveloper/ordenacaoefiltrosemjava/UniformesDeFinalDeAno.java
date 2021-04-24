package com.apass.dio.javadeveloper.ordenacaoefiltrosemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// 3. Uniformes de Final de Ano

public class UniformesDeFinalDeAno {
    public static void main(String[] args) throws NumberFormatException, IOException {
	var br = new BufferedReader(new InputStreamReader(System.in));

	var numeroEntradas = Integer.parseInt(br.readLine());

	var uniformes = new ArrayList<String[]>();

	for (int i = 0; i < numeroEntradas; i++) {
	    var uniforme = new String[3];

	    uniforme[0] = br.readLine();

	    var cor_tamanho = br.readLine().split(" ");

	    uniforme[1] = cor_tamanho[0];
	    uniforme[2] = cor_tamanho[1];

	    uniformes.add(uniforme);
	}

	uniformes.sort((a, b) -> {
	    var teste = a[1].compareToIgnoreCase(b[1]);

	    if (teste != 0) {
		return teste;
	    }

	    teste = a[2].compareToIgnoreCase(b[2]);

	    if (teste != 0) {
		return teste * -1;
	    }

	    return a[0].compareToIgnoreCase(b[0]);
	});

	for (String[] uniforme : uniformes) {
	    System.out.println(uniforme[1] + " " + uniforme[2] + " " + uniforme[0]);
	}
    }
}
