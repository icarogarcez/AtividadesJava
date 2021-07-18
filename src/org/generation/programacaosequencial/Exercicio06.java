package org.generation.programacaosequencial;

import java.util.Scanner;

public class Exercicio06 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double x1, x2, y1, y2, d, raiz;

		System.out.println("Considere um plano com dois pontos representados por y e x. Agora digite um valor para X1: ");
		x1 = ler.nextDouble();

		System.out.println("Digite um valor para Y1:");
		y1 = ler.nextDouble();

		System.out.println("Digite um valor para X2:");
		x2 = ler.nextDouble();

		System.out.println("Digite um valor para Y2:");
		y2 = ler.nextDouble();

		d = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		raiz = Math.sqrt(d);

		System.out.println("A distância esses dois pontos dentro do plano é de " + d + ".");
	}
}
