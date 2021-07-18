package org.generation.exerciciointerface;

public class ImpressaoAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a preguica = new Pregui�a();

		cachorro.setNome("Tot�");
		cachorro.setIdade(5);
		cachorro.setRaca("Vira-lata Caramelo");

		cavalo.setNome("Spirit");
		cavalo.setIdade(13);
		cavalo.setRaca("Kiger Mustang");

		preguica.setNome("Roncad�o");
		preguica.setIdade(8);
		preguica.setRaca("---");

		System.out.println("Cachorro: ");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		System.out.println("Ra�a: " + cachorro.getRaca());
		cachorro.locomover();
		cachorro.somAnimal();

		System.out.println();
		System.out.println("Cavalo: ");
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		System.out.println("Ra�a: " + cavalo.getRaca());
		cavalo.locomover();
		cavalo.somAnimal();

		System.out.println();
		System.out.println("Pregui�a: ");
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade());
		System.out.println("Ra�a: " + preguica.getRaca());
		preguica.locomover();
		preguica.somAnimal();
		preguica.subir();

	}
}