package org.generation.exerciciointerface;

public class Cavalo extends Animal implements InterfaceAnimal {

	@Override
	public void locomover() {
		System.out.println("Cavalo correndo, pocot�, pocot�!");

	}

	@Override
	public void somAnimal() {
		System.out.println("Iiirrrr�, rilinchin!");

	}
}
