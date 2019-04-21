package entidade;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Informe o nome do animal: ");
		String nome = sc.nextLine();
		System.out.println("Informe a cor: ");
		String cor = sc.nextLine();
		System.out.println("Informe a raça do animal: ");
		String raca = sc.nextLine();
		System.out.println("Informe o peso: ");
		double peso = sc.nextDouble();

	
		

		System.out.println("Esse animal ja foi tosado? ");
		boolean tosa=sc.nextBoolean();
		
		
		Animal animal = new Animal(peso, cor);
		Cachorro cachorro = new Cachorro(nome, raca);
		Cox cox =new Cox(tosa);
		
		System.out.println(animal.mostraAnimal());
		System.out.println(cachorro.mostrarNome());
		cox.mostraTosa(tosa);
		
		
		sc.close();
	}

}
