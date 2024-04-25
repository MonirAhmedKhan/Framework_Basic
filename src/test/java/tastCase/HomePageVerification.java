package tastCase;

import base.Base;

public class HomePageVerification extends Base{

	public static void main(String[] args) {
		startUp();
		navigate("https://it.microtechlimited.com/index.html");
		assertion("//h1[text()='Welcome to MicroTech NA.']","Welcome to MicroTech NA.");
		
		System.out.println("Hello gitHub");

		System.out.println("Hello Monir");

		System.out.println("Hello Java");
		System.out.println("Monir");
		System.out.println("Monir-2");
		System.out.println("Monir-3");
		
		


	}

}
