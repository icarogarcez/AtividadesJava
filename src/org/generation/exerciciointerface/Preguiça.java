package org.generation.exerciciointerface;

public class Pregui�a extends Animal implements InterfaceAnimal {

	@Override
	public void locomover() {
		System.out.println("Andando bem lentamente...");

	}

	@Override
	public void somAnimal() {
		System.out.println("Zzz... zzz... zz.. z....");

	}

	public void subir() {
		System.out.println("Subindo na �rvore...");
	}

}