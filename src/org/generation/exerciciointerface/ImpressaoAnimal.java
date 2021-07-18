package org.generation.exerciciointerface;

public class ImpressaoAnimal {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguiça preguica = new Preguiça();

		cachorro.setNome("Totó");
		cachorro.setIdade(5);
		cachorro.setRaca("Vira-lata Caramelo");

		cavalo.setNome("Spirit");
		cavalo.setIdade(13);
		cavalo.setRaca("Kiger Mustang");

		preguica.setNome("Roncadão");
		preguica.setIdade(8);
		preguica.setRaca("---");

		System.out.println("Cachorro: ");
		System.out.println("Nome: " + cachorro.getNome());
		System.out.println("Idade: " + cachorro.getIdade());
		System.out.println("Raça: " + cachorro.getRaca());
		cachorro.locomover();
		cachorro.somAnimal();

		System.out.println();
		System.out.println("Cavalo: ");
		System.out.println("Nome: " + cavalo.getNome());
		System.out.println("Idade: " + cavalo.getIdade());
		System.out.println("Raça: " + cavalo.getRaca());
		cavalo.locomover();
		cavalo.somAnimal();

		System.out.println();
		System.out.println("Preguiça: ");
		System.out.println("Nome: " + preguica.getNome());
		System.out.println("Idade: " + preguica.getIdade());
		System.out.println("Raça: " + preguica.getRaca());
		preguica.locomover();
		preguica.somAnimal();
		preguica.subir();

	}
}