Feature: realizar cadastrado, edicao e deletar tarefa

Eu como usuario quero realizar cadastro, edicao e deletar tarefas

@cadastra
Scenario: Cadastrar tarefa
	Given acesso aba cadastrar de tarefa "https://demo.suiteondemand.com/index.php?action=Login&module=Users&login_module=Tasks&login_action=EditView"
	Then prencher todos campos corretamente	
	When cadastrado realizado com sucesso
	
@editar
Scenario: Editar tarefa
	Given acesso uma tarefa ja criada "https://demo.suiteondemand.com/index.php?action=Login&module=Users&login_module=Tasks&login_action=EditView"
	Then realizo edicao dos campos 
	When tarefa editada com sucesso
			
@deletar
Scenario: deletar tarefa
	Given acesso uma tareja ja criada "https://demo.suiteondemand.com/index.php?action=Login&module=Users&login_module=Tasks&login_action=EditView"
	Then eu deleto a tarefa
	When tarefa deleta com sucesso
	
	

	
