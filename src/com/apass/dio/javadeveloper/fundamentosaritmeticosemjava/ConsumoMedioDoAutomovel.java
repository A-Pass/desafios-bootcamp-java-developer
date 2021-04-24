package com.apass.dio.javadeveloper.fundamentosaritmeticosemjava;

import java.io.IOException;
import java.util.Scanner;
import java.text.NumberFormat;

// 5. Consumo Médio do Automóvel

public class ConsumoMedioDoAutomovel {
    public static void main(String[] args) throws IOException {
	Scanner leitor = new Scanner(System.in);

	int distancia = leitor.nextInt();

	double combustivel = leitor.nextDouble();

	double consumoMedio = distancia / combustivel;

	leitor.close();
	
	NumberFormat nf = NumberFormat.getInstance();
	nf.setMaximumFractionDigits(3);
	nf.setMinimumFractionDigits(3);
	System.out.println(nf.format(consumoMedio) + " km/l");
    }
}