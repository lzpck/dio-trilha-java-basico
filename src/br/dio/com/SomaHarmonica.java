package br.dio.com;

import java.util.Scanner;

public class SomaHarmonica {

    public static void main(String[] args) {

        double soma = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
        }

        int resultado = (int) Math.round(soma);
        System.out.println(resultado);

        sc.close();
    }
}
