package org.generation.programacaosequencial;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		double custoFabrica, custoConsumidor, porcentagemDist, imposto;

		System.out.println("Escreva o valor de f�brica do carro:");
		custoFabrica = leia.nextDouble();

		porcentagemDist = (custoFabrica * 0.28);
		imposto = (custoFabrica * 0.45);
		custoConsumidor = (porcentagemDist + custoFabrica + imposto);

		System.out.println("O custo de Fabrica � de R$ " + custoFabrica + ".");
		System.out.println("O custo de imposto ser� de R$ " + imposto + ".");
		System.out.println("O custo do consumidor � de R$ " + custoConsumidor + ".");
	}
}
