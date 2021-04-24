package com.apass.dio.javadeveloper.fundamentosaritmeticosemjava;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// 2. Exibindo Números Pares

public class ExibindoNumerosPares {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int numero = Integer.parseInt(br.readLine());
    	
    	for (int i = 1; i <=  numero; i++) {
    		if (i % 2 == 0) System.out.println(i);
    	}
    }
	
}
