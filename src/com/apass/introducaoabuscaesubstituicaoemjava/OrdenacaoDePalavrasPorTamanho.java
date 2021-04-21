import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

// 1. Ordenação de palavras por tamanho

public class OrdenacaoDePalavrasPorTamanho {
    public static void main(String[] args) throws NumberFormatException, IOException {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	var numeroTestes = Integer.parseInt(br.readLine());

	List<List<String>> testes = new ArrayList<List<String>>();

	for (var contador = 0; contador < numeroTestes; contador++) {
	    testes.add(List.of(br.readLine().split(" ")));
	}

	testes.forEach(teste -> {
	    teste.stream().sorted((a, b) -> {
		var coparacaoTamanho = Integer.compare(a.length(), b.length()) * -1;
		if (coparacaoTamanho == 0) {
		    return a.compareToIgnoreCase(b);
		}
		return coparacaoTamanho;
	    }).forEach(palavra -> System.out.print(palavra + " "));
	    System.out.println();
	});

    }
}
