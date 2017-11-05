Feature: pesquisar medico
  Como usuário, desejo pesquisar medicos.

  Background:
    Given eu estou na home do sistema
    And eu clicar no botao Pesquisar
    And eu clicar no botao Pesquisar Medicos


  Scenario: pesquisar medico por nome existente no sistema
    And eu digitar "Teste" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar todos os medicos com o nome pesquisado

  Scenario: pesquisar medico por nome inexistente no sistema
    And eu digitar "xxxxx" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar a frase "Nenhum Medico encontrado"

  Scenario: pesquisar medico por CRM existente no sistema
    And eu digitar "1234567" no campo crm
    And eu clicar no botao pesquisar
    Then eu devo visualizar o medico "Fabiana Akemi" na lista de pesquisa

  Scenario: pesquisar medico por CRM inexistente no sistema
    And eu digitar "9999999" no campo cpf
    And eu clicar no botao pesquisar
    Then eu devo visualizar a frase "Nenhum Medico encontrado"

  Scenario: pesquisar medico por uma determinada especialidade
    And eu selecionar a opcao Clinico no campo especialidade
    And eu clicar no botao pesquisar
    Then eu devo visualizar todos os medicos que estao cadastrados com a especialidade pesquisada
