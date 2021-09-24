package fr.htc.math.ops;

import java.util.Scanner;

public class Arithmitque {
	
	public void add(Scanner scanner) {
		System.out.println("Opération Addition");

		System.out.print("Entrer le 1 er param");
		int p1 = scanner.nextInt();
		
		System.out.print("Entrer le 2 eme param");
		int p2 = scanner.nextInt();
		
		System.out.println("La somme est : " + (p1 + p2));

	}
	
	public void soustraction(Scanner scanner) {
		System.out.print("Entrer le 1 er param");
		int p1 = scanner.nextInt();
		
		System.out.print("Entrer le 2 eme param");
		int p2 = scanner.nextInt();
		
		System.out.println("La différence est : " + (p1 - p2));;
	}

}
