package com.apass.dio.javadeveloper.ordenacaoefiltrosemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

// 4. Fila do Banco

public class FilaDoBanco {
    public static void main(String[] args) throws NumberFormatException, IOException {
	var br = new BufferedReader(new InputStreamReader(System.in));

	var numeroEntradas = Integer.parseInt(br.readLine());

	var qtdNaoMudam = new ArrayList<Integer>();

	for (int i = 0; i < numeroEntradas; i++) {
	    var numeroInteiros = Integer.parseInt(br.readLine());

	    var inteiros = Stream.of(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	    var inteirosOrdenados = new ArrayList<Integer>();
	    for (var n : inteiros)
		inteirosOrdenados.add(n);
	    Collections.sort(inteirosOrdenados, Collections.reverseOrder());

	    var qtdNaoMuda = 0;
	    for (var contador = 0; contador < numeroInteiros; contador++) {
		if (inteirosOrdenados.get(contador).equals(inteiros[contador])) {
		    qtdNaoMuda++;
		}
	    }
	    qtdNaoMudam.add(qtdNaoMuda);
	}

	for (var qtdnm : qtdNaoMudam) {
	    System.out.println(qtdnm);
	}
    }
}
