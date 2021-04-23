package com.apass.dio.javadeveloper.introducaoabuscaesubstituicaoemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

public class AtalhosWebLoggerBrasil {
	public static void main(String[] args) throws IOException {
		final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String entrada;
		while ((entrada = in.readLine()) != null) {
			var caracteres = entrada.toCharArray();
			var saida = "";
			var entreCharEspecial = false;
			
			for (char c : caracteres) {
				if (ehCaractereEspecial(c)) {
					saida += converteParaHtml(c, entreCharEspecial);
					entreCharEspecial = !entreCharEspecial;
				} else {
					saida += c;
				}
			}
			
			System.out.println(saida);
		}
	}

	static String converteParaHtml(char c, boolean tagFechamento) {
		if (c == '*') {
			return tagFechamento ? "<b/>" : "<b>";
		}

		if (c == '_') {
			return tagFechamento ? "<i/>" : "<i>";
		}

		throw new InvalidParameterException("Caractere '" + c + "' não permitido!");
	}

	static boolean ehCaractereEspecial(char c) {
		return "*_".contains(c + "");
	}
}
