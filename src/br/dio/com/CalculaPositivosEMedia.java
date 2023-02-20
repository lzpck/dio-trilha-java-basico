package br.dio.com;

import java.io.IOException;
import java.util.Scanner;

public class CalculaPositivosEMedia {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double somaPositivos = 0;
        int quantidadePositivos = 0;

        for (int i = 0; i < 6; i++) {
            double valor = sc.nextDouble();
            if (valor > 0) {
                somaPositivos += valor;
                quantidadePositivos++;
            }
        }

        System.out.println(quantidadePositivos + " valores positivos");
        if (quantidadePositivos > 0) {
            double mediaPositivos = somaPositivos / quantidadePositivos;
            System.out.printf("%.1f\n", mediaPositivos);
        }

        sc.close();
    }
}
