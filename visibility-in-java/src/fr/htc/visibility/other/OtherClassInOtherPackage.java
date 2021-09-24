package fr.htc.visibility.other;

import fr.htc.visibility.main.MainClass;

public class OtherClassInOtherPackage {

	public void methode() {
		MainClass mainClass = new MainClass();
		System.out.println(mainClass.defaultt);
		System.out.println(mainClass.protecteed);
		System.out.println(mainClass.publiic);
		System.out.println(mainClass.privatee);
		
		System.out.println(MainClass.staticc);
	}
}
