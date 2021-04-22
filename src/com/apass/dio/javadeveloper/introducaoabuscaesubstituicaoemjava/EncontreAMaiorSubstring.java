package com.apass.dio.javadeveloper.introducaoabuscaesubstituicaoemjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

// 2. Encontre a maior substring.md

public class EncontreAMaiorSubstring {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String min, max, entrada ; //declare suas variaveis aqui
        while ((entrada = in.readLine()) != null) { // complete seu código
            min = in.readLine();
            if (min.length() > entrada.length()) {  
               max = min;
               min = entrada;
            } else {
               max = entrada;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }
}
