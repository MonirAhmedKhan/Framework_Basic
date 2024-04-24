package tastCase;

import base.Base;

public class HomePageVerification extends Base{

	public static void main(String[] args) {
		startUp();
		navigate("https://it.microtechlimited.com/index.html");
		assertion("//h1[text()='Welcome to MicroTech NA.']","Welcome to MicroTech NA.");
		
		System.out.println("Hello gitHub");
	System.out.println("Bangladesh");
	}

}
