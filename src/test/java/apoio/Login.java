package apoio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.Metodos;

public class Login {
	
	WebDriver driver;
	
	Metodos met = new Metodos();
	
	public void realizarLogin() throws InterruptedException {
		met.preencher(By.id("user_name"), "will");
		met.preencher(By.id("username_password"),"will");
		met.clicar(By.id("bigbutton"));
	}
	
}
