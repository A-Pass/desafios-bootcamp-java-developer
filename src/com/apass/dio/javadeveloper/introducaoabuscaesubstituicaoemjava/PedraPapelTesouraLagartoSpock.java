package com.apass.dio.javadeveloper.introducaoabuscaesubstituicaoemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

// 4. Pedra, Papel, Tesoura, Lagarto e Spock
public class PedraPapelTesouraLagartoSpock {
    public static void main(String[] args) throws IOException {
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	var numeroTestes = Integer.parseInt(br.readLine());
  	
  	List<String[]> vence = new ArrayList();
  	vence.add(new String[] {"tesoura", "papel,largato" });
  	vence.add(new String[] {"papel", "pedra,spock" });
  	vence.add(new String[] {"pedra", })
  	
  	for(var contador = 0; contador < numeroTestes; contador++) {
  	    var jogadas = br.readLine().split(" ");
  	    
  	}
    }
}
