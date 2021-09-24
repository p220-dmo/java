package fr.htc.math.main;

import java.util.Scanner;

import fr.htc.math.ops.Arithmitque;

public class AppLuncher {
	private static final short OP_EXIT = 0;
	private static final short DEFAULT_VALUE = -1;
	private static final short OP_ADDITION = 100;
	private static final short OP_SOUSTRACTION = 200;

	public static void main(String[] args) {
		Arithmitque arithmitque = new Arithmitque();
		Scanner scan = new Scanner(System.in);

		int choise = DEFAULT_VALUE;

		do {

			printMenu();
			choise = scan.nextInt();

			switch (choise) {
			case OP_ADDITION:
				arithmitque.add(scan);
				break;
			case OP_SOUSTRACTION:
				arithmitque.soustraction(scan);
				break;
			case OP_EXIT:
				System.out.println("Au revoir !!! :(");
				break;

			default:
				System.out.println("Entrer une valeur entre 0 et 2");
				break;
			}
			System.out.println("\n\n=============================================================");
		} while (choise != 0);

		scan.close();
	}

	/**
	 * Cette methode a pour role d'afficher le menu
	 */
	private static void printMenu() {
		System.out.println("-- APPLICATION MATH UTILS --");

		System.out.println("- Menu Principal");
		System.out.println("\t - Addition     => Tapez " + OP_ADDITION);
		System.out.println("\t - Soustraction => Tapez " + OP_SOUSTRACTION);
		System.out.println("\t - Quittez      => Tapez " + OP_EXIT);
		System.out.print("\t\t\t\t - Faites votre choix : ");
	}

}
