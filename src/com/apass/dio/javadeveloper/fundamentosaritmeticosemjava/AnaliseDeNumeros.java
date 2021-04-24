package com.apass.dio.javadeveloper.fundamentosaritmeticosemjava;

import java.io.IOException;
import java.util.Scanner;

//3. Análise de Números

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
	Scanner leitor = new Scanner(System.in);
	// declare suas variaveis corretamente
	int valoresPares = 0;
	int valoresImpares = 0;
	int valoresPositivos = 0;
	int valoresNegativos = 0;
	int numero;

	// continue a solução
	for (int i = 0; i < 5; i++) {
	    numero = leitor.nextInt();

	    if (numero % 2 == 0) {
		valoresPares++;
	    } else {
		valoresImpares++;
	    }

	    if (numero < 0) {
		valoresNegativos++;
	    }

	    if (numero > 0) {
		valoresPositivos++;
	    }
	}
	
	leitor.close();
	
	// insira suas variaveis corretamente
	System.out.println(valoresPares + " valor(es) par(es)");
	System.out.println(valoresImpares + " valor(es) impar(es)");
	System.out.println(valoresPositivos + " valor(es) positivo(s)");
	System.out.println(valoresNegativos + " valor(es) negativo(s)");
    }
}