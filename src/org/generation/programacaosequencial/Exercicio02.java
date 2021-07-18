package org.generation.programacaosequencial;

import java.util.Scanner;

public class Exercicio02 {

public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);
		
		int anos, meses,dias;
		System.out.println("Opa, agora insere aqui quantos dias você já viveu.");
		dias = leia.nextInt();

		anos = (dias/365);
		meses =(dias/30);
		
		System.out.println("A sua vida em anos é de: " + anos + ".");
		System.out.println("A sua vida em meses é de: " + meses + ".");
	}

}
