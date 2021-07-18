package org.generation.programacaosequencial;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		double a, b, c, r, s, d;

		System.out.println("Insira o valor de A: ");
		a = leia.nextDouble();
		System.out.println("Insira o valor de B: ");
		b = leia.nextDouble();
		System.out.println("Insira o valor de C: ");
		c = leia.nextDouble();

		r = Math.pow(a, b);
		s = Math.pow(b, c);
		d = (r + s) / 2;
		System.out.println("O resultado de D é: " + d + ".");
	}
}
