package fr.htc.visibility.other;

import fr.htc.visibility.main.MainClass;

public class SubClassInOtherPackage extends MainClass {

	public void methode() {
		MainClass mainClass = new MainClass();
		System.out.println(super.protecteed);
		System.out.println(super.publiic);
		System.out.println(super.defaultt);
		System.out.println(super.privatee);
		
		System.out.println(MainClass.staticc);
	}
}
