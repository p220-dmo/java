package fr.htc.java.operations.types;

public class Addition implements Operation {


	@Override
	public void process(String title) {
		System.out.println("Je suis dans le choix : "  + title);
	}

}
