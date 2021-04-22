package com.apass.dio.javadeveloper.introducaoabuscaesubstituicaoemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// 4. Pedra, Papel, Tesoura, Lagarto e Spock
public class PedraPapelTesouraLagartoSpock {
    public static void main(String[] args) throws IOException {
	  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  	var numeroTestes = Integer.parseInt(br.readLine());
	  	
	  	var vence = new HashMap<String, String>();
	  	vence.put("pedra", "lagarto,tesoura");
	  	vence.put("papel", "pedra,spock");
	  	vence.put("tesoura", "papel,lagarto");
	  	vence.put("lagarto", "spock,papel");
	  	vence.put("spock", "tesoura,pedra");
	  	
	  	for(var contador = 0; contador < numeroTestes; contador++) {
	  	    var jogadas = br.readLine().toLowerCase().split(" ");
	  	    
	  	    if(vence.containsKey(jogadas[0]) && vence.get(jogadas[0]).contains(jogadas[1])) {
	  	    	System.out.println("fernanda");
	  	    } else if(vence.containsKey(jogadas[1]) && vence.get(jogadas[1]).contains(jogadas[0])) {
	  	    	System.out.println("marcia");
	  	    } else {
	  	    	System.out.println("empate");
	  	    }
		}
    }
}
