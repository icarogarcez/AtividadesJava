package org.generation.programacaosequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		int minutos, segundos, horas;
		
		System.out.println("Digite a duração do evento em segundos:");
		segundos = leia.nextInt();
		
		horas = (segundos/3600);
		minutos = (horas/60);
		segundos =  (minutos/60);
		
		System.out.println("A duração do seu evento foi de "+ horas + " horas," + minutos + " minutos e " + segundos + " segundos.");
	}
}