package tastCase;

import base.Base;

//import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Test_Customer_Login extends Base {

	// Login as Customer
	public static void main(String[] args) {

		startUp();

		navigate("https://it.microtechlimited.com");

		click("//a[@href='elogin.php']");

		click("//a[@href='clogin.php']");

		fill("//input[@name='mailuid']", "david@gmail.com");

		fill("//input[@name='pwd']", "1234");

		click("//input[@name='login-submit']");

		String welcomeMessage = innerText("//h2[2]");

		System.out.println(welcomeMessage);
		// assertThat(page.locator("body > div.fw-container > div.fw-body > div >
		// h1")).hasText("Installation");
		assertion("//*[@id='divimg']/div/h2[2]", "Welcome David");
		
		browserClose();
	}

}
