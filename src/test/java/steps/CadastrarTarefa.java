package steps;

import org.openqa.selenium.By;

import apoio.Login;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Metodos;

public class CadastrarTarefa {
	
	Metodos met = new Metodos();
	Login login = new Login();
	String teste = "TESTE AUTOMAÇÃO";
	
	public void realizarLogin() throws InterruptedException {
		met.preencher(By.id("user_name"), "will");
		met.preencher(By.id("username_password"),"will");
		met.clicar(By.id("bigbutton"));
	}
		
	@Given("^acesso aba cadastrar de tarefa \"([^\"]*)\"$")
	public void acesso_aba_cadastrar_de_tarefa(String arg1) throws Throwable {
		met.abrirNavegador(arg1);
		realizarLogin();
		met.clicar(By.xpath("//div[@class=\"actionmenulink\"]"));

	}

	@Then("^prencher todos campos corretamente$")
	public void prencher_todos_campos_corretamente() throws Throwable {
		met.esperar(3000);
		met.preencher(By.id("name"), teste);
		met.preencher(By.id("date_start_date"), "07/19/2021");
		met.preencher(By.id("date_due_date"), "07/30/2021");
		met.preencher(By.id("description"), "Esse e um teste pratico de automacao");
		met.preencher(By.id("parent_name"), "Testando");
		met.preencher(By.id("contact_name"), "119999999");
		met.clicar(By.id("SAVE"));
		
	}

	@When("^cadastrado realizado com sucesso$")
	public void cadastrado_realizado_com_sucesso() throws Throwable {
		met.validarTexto(By.className("module-title-text"), teste);
		met.screenShot("Cadastro Realizado");
		met.fecharBrowser();
	}

}
