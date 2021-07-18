package org.generation.exerciciointerface;

public class Cachorro extends Animal implements InterfaceAnimal {

	@Override
	public void locomover() {
		System.out.println("Cachorro correndo...");

	}

	@Override
	public void somAnimal() {
		System.out.println("Au, au, au, au!");

	}

}
