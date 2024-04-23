package base;

import java.nio.file.Paths;
import java.util.ArrayList;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Base {
	public static Page page;

	public static void startUp() {
		String chromePath = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		// playwright declaration and creation
		Playwright playwright;
		playwright = Playwright.create();

		ArrayList<String> arguments = new ArrayList<>();
		arguments.add("--start-maximized");

		LaunchOptions launchOptions;
		launchOptions = new BrowserType.LaunchOptions().setHeadless(false).setArgs(arguments)
				.setExecutablePath(Paths.get(chromePath));

		Browser browser;
		browser = playwright.chromium().launch(launchOptions);

		BrowserContext context = browser.newContext(new Browser.NewContextOptions().setViewportSize(null));

		page = context.newPage();
	}

	public static String innerText(String locator) {
		String s = page.locator(locator).innerText();
		return s;
	}

	public static void fill(String locator, String value) {
		page.locator(locator).fill(value);
	}

	public static void navigate(String url) {
		page.navigate(url);
	}

	public static void click(String locator) {
		page.locator(locator).click();
	}

	public static void selectOption(String xpath, String value) {
		page.selectOption(xpath, value);
	}
	public static void assertion(String xpath,String text) {
		assertThat(page.locator(xpath)).hasText(text);
	}

	public static void browserClose() {
		page.close();

	//	browser.close();

	//	playwright.close();
	}

}
