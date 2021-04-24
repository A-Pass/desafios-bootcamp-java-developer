package com.apass.dio.javadeveloper.fundamentosaritmeticosemjava;

import java.io.IOException;
import java.util.Scanner;

// 4. Contagem de Cédulas

public class ContagemDeCedulas {
    public static void main(String[] args) throws IOException {
	Scanner leitor = new Scanner(System.in);

	int notas100 = 0;
	int notas50 = 0;
	int notas20 = 0;
	int notas10 = 0;
	int notas5 = 0;
	int notas2 = 0;
	int notas1 = 0;

	int valor = leitor.nextInt();

	System.out.println(valor);

	while (valor > 0) {

	    if (valor >= 100) {
		notas100++;
		valor -= 100;
		continue;
	    }

	    if (valor >= 50) {
		notas50++;
		valor -= 50;
		continue;
	    }

	    if (valor >= 20) {
		notas20++;
		valor -= 20;
		continue;
	    }

	    if (valor >= 10) {
		notas10++;
		valor -= 10;
		continue;
	    }

	    if (valor >= 5) {
		notas5++;
		valor -= 5;
		continue;
	    }

	    if (valor >= 2) {
		notas2++;
		valor -= 2;
		continue;
	    }

	    if (valor >= 1) {
		notas1++;
		valor -= 1;
	    }
	}

	leitor.close();
	
	System.out.println(notas100 + " nota(s) de R$ 100,00");
	System.out.println(notas50 + " nota(s) de R$ 50,00");
	System.out.println(notas20 + " nota(s) de R$ 20,00");
	System.out.println(notas10 + " nota(s) de R$ 10,00");
	System.out.println(notas5 + " nota(s) de R$ 5,00");
	System.out.println(notas2 + " nota(s) de R$ 2,00");
	System.out.println(notas1 + " nota(s) de R$ 1,00");

    }
}