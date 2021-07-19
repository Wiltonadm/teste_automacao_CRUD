$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/tarefas.feature");
formatter.feature({
  "line": 1,
  "name": "realizar cadastrado, edicao e deletar tarefa",
  "description": "\nEu como usuario quero realizar cadastro, edicao e deletar tarefas",
  "id": "realizar-cadastrado,-edicao-e-deletar-tarefa",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 18,
  "name": "deletar tarefa",
  "description": "",
  "id": "realizar-cadastrado,-edicao-e-deletar-tarefa;deletar-tarefa",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@deletar"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "acesso uma tareja ja criada \"https://demo.suiteondemand.com/index.php?action\u003dLogin\u0026module\u003dUsers\u0026login_module\u003dTasks\u0026login_action\u003dEditView\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "eu deleto a tarefa",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "tarefa deleta com sucesso",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://demo.suiteondemand.com/index.php?action\u003dLogin\u0026module\u003dUsers\u0026login_module\u003dTasks\u0026login_action\u003dEditView",
      "offset": 29
    }
  ],
  "location": "DeletarTarefa.acesso_uma_tareja_ja_criada(String)"
});
formatter.result({
  "duration": 20109302000,
  "status": "passed"
});
formatter.match({
  "location": "DeletarTarefa.eu_deleto_a_tarefa()"
});
formatter.result({
  "duration": 2437603200,
  "status": "passed"
});
formatter.match({
  "location": "DeletarTarefa.tarefa_deleta_com_sucesso()"
});
formatter.result({
  "duration": 1448570300,
  "status": "passed"
});
});