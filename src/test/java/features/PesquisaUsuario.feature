Feature: pesquisar usuarios
  Como usuário, desejo pesquisar usuarios cadastrados no sistema.

  Background:
    Given eu estou na home do sistema
    And eu clicar no botao Pesquisar
    And eu clicar no botao Pesquisar Usuarios


  Scenario: pesquisar usuario por nome existente no sistema
    And eu digitar "Admin" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar todos os usuarios com o nome pesquisado

  Scenario: pesquisar usuario por nome inexistente no sistema
    And eu digitar "xxxxx" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar a frase "Nenhum usuario encontrado"

  Scenario: pesquisar usuario por email existente no sistema
    And eu digitar "fran@saude.com" no campo Email
    And eu clicar no botao pesquisar
    Then eu devo visualizar o usuario "Fran Oliveira" na lista de pesquisa

  Scenario: pesquisar usuario por email inexistente no sistema
    And eu digitar "xxx@saude.com" no campo Email
    And eu clicar no botao pesquisar
    Then eu devo visualizar a frase "Nenhum usuario encontrado"

  Scenario: pesquisar usuarios pelo grupo Administrador
    And eu clicar na opcao Administrador na secao Grupos
    And eu clicar no botao pesquisar
    Then eu devo visualizar todos os usuarios que fazem parte do grupo Administrador

  Scenario: pesquisar usuarios pelo grupo Medico
    And eu clicar na opcao Medico na secao Grupos
    And eu clicar no botao pesquisar
    Then eu devo visualizar todos os usuarios que fazem parte do grupo Medico

  Scenario: pesquisar usuarios pelo grupo Colaborador
    And eu clicar na opcao Colaborador na secao Grupos
    And eu clicar no botao pesquisar
    Then eu devo visualizar todos os usuarios que fazem parte do grupo Colaborador