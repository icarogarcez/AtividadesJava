package org.generation.programacaosequencial;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		int anos, meses, dias, idadeDias;

		System.out.println("Informe a sua idade em anos:");
		anos = leia.nextInt();

		System.out.println("Informe quantos meses se passaram desde o seu último aniversário:");
		meses = leia.nextInt();

		System.out.println("E quantos dias?");
		dias = leia.nextInt();

		idadeDias = ((anos * 365) + (meses * 30) + dias);

		System.out.println("Ao total você viveu " + idadeDias + " dias.");

	}

}
