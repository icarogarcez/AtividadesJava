package org.generation.programacaosequencial;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		double n1,n2, n3, p1,p2,p3, media;
		
		System.out.println("Qual � a sua nota em Hist�ria?");
		n1 = leia.nextDouble();
		
		System.out.println("E o peso?");
		p1 = leia.nextDouble();
		
		System.out.println("Qual � a sua nota em Filosofia?");
		n2 = leia.nextDouble();
		
		System.out.println("E o peso?");
		p2 = leia.nextDouble();
		
		System.out.println("Qual � a sua nota em Educa��o F�sica?");
		n3 = leia.nextDouble();
		
		System.out.println("E o peso?");
		p3 = leia.nextDouble();
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("A sua m�dia do primeiro bimestre �: " + media + ".");
	}
}
