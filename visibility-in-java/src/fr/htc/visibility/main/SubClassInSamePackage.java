package fr.htc.visibility.main;

public class SubClassInSamePackage extends MainClass {
	
	
	public void methode() {
		MainClass mainClass = new MainClass();
		System.out.println(super.defaultt);
		System.out.println(super.protecteed);
		System.out.println(super.publiic);
		System.out.println(super.privatee);
		
		System.out.println(MainClass.staticc);
	}

}
