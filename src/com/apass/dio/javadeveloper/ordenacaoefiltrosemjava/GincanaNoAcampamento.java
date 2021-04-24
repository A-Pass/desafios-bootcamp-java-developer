package com.apass.dio.javadeveloper.ordenacaoefiltrosemjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

// 5. Gincana no Acampamento

public class GincanaNoAcampamento {
    public static void main(String[] args) throws Exception {
	var br = new BufferedReader(new InputStreamReader(System.in));
	List<List<String[]>> entradas = new ArrayList<>();
	List<String> vencedores = new ArrayList<>();

	for (;;) {
	    var numeroEntradas = Integer.parseInt(br.readLine());

	    if (numeroEntradas == 0)
		break;

	    var alunos = new ArrayList<String[]>();

	    for (var contador = 0; contador < numeroEntradas; contador++) {
		var aluno = br.readLine().split(" ");
		alunos.add(aluno);
	    }
	    entradas.add(alunos);
	}

	for (var alunos : entradas) {
	    var aluno = alunos.get(0);
	    for (int indice = 0, qtd = alunos.size(); qtd > 1; qtd = alunos.size()) {
		var numero = Integer.parseInt(aluno[1]);

		var ordem = numero % 2 == 0 ? -1 : 1;

		for (var i = 0; i < numero;) {

		    indice = indice + ordem;
		    if (indice < 0) {
			indice = qtd + indice;
		    }
		    if (indice >= qtd) {
			indice = indice - qtd;
		    }

		    i++;
		}

		aluno = alunos.get(indice);
		alunos.remove(indice);

		numero = Integer.parseInt(aluno[1]);
		ordem = numero % 2 == 0 ? -1 : 1;

		if (ordem == 1)
		    indice -= 1;

	    }

	    vencedores.add(alunos.get(0)[0]);
	}

	for (String nome : vencedores) {
	    System.out.println("Vencedor(a): " + nome);
	}

    }
}
