package com.apass.dio.javadeveloper.introducaoabuscaesubstituicaoemjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class ValidadorDeDenhasComRequisitos {
    public final static int MAX = 200;

    public static void main(String[] args) throws Exception {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String entrada;
	while ((entrada = br.readLine()) != null) {

	    if (Pattern.matches(".*[a-z]+.*", entrada) && Pattern.matches(".*[A-Z]+.*", entrada)
		    && Pattern.matches(".*[0-9]+.*", entrada) && Pattern.matches("^[a-zA-Z0-9]{6,32}$", entrada)) {
		System.out.println("Senha valida.");
	    } else {
		System.out.println("Senha invalida.");
	    }
	}

    }
}