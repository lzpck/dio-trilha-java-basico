package br.dio.com;

import java.util.*;

public class FabricaCarros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro: ");
        int custoFabrica = scan.nextInt();

        System.out.println("Digite a porcentagem do distribuidor: ");
        int porcentagemDistribuidor = scan.nextInt();

        System.out.println("Digite a porcentagem dos impostos: ");
        int PercentualImpostos = scan.nextInt();

        double custoConsumidor;

        custoConsumidor =  custoFabrica + (custoFabrica * (porcentagemDistribuidor / 100.0)) + (custoFabrica * (PercentualImpostos / 100.0));
        System.out.println(custoConsumidor);

        System.out.println();
    }
}
