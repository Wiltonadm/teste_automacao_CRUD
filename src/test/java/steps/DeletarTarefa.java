package steps;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import apoio.Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Metodos;

public class DeletarTarefa {

	WebDriver driver;
	Metodos met = new Metodos();
	Login login = new Login();
	String teste = "TESTE AUTOMAÇÃO";
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");


	public void realizarLogin() throws InterruptedException {
		met.preencher(By.id("user_name"), "will");
		met.preencher(By.id("username_password"), "will");
		met.clicar(By.id("bigbutton"));
	}
	
	public void criarTarefaParaDeletar() throws InterruptedException {
		met.esperar(3000);
		met.preencher(By.id("name"), teste + sdf.format(new Date()));
		met.preencher(By.id("date_start_date"), "07/19/2021");
		met.preencher(By.id("date_due_date"), "07/30/2021");
		met.preencher(By.id("description"), "Esse e um teste pratico de automacao");
		met.preencher(By.id("parent_name"), "Testando");
		met.preencher(By.id("contact_name"), "119999999");
		met.clicar(By.id("SAVE"));
	}
	
	@Given("^acesso uma tareja ja criada \"([^\"]*)\"$")
	public void acesso_uma_tareja_ja_criada(String arg1) throws Throwable {
		met.abrirNavegador(arg1);
		realizarLogin();
		met.clicar(By.xpath("//div[@class=\"actionmenulink\"]"));
		criarTarefaParaDeletar();
	}

	@Then("^eu deleto a tarefa$")
	public void eu_deleto_a_tarefa() throws Throwable {
		met.clicar(By.xpath("//li[@id=\"tab-actions\"]"));
		met.clicar(By.xpath("//input[@title=\"Delete\"]"));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.delay(2000);
	}

	@When("^tarefa deleta com sucesso$")
	public void tarefa_deleta_com_sucesso() throws Throwable {
		met.screenShot("Campo apagado com sucesso");
		met.fecharBrowser();
	}

}