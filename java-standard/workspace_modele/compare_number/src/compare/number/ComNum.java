package compare.number;

import java.util.Scanner;

public class ComNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer un nombre");
		int n, m;
		n = sc.nextInt();
		
		System.out.println("Entrer un deuxi�me nombre");
		m = sc.nextInt();
		
		if (n > m) {
			System.out.println("Le nombre " + n + "est � superieur � " + m);
		} else if (n == m) {
			System.out.println("le nombre " + n + " est eagl � " + m);
		} else {
			System.out.println("le nombre " + n + " est inferieur � " + m);
		}
		sc.close();
	}

}
