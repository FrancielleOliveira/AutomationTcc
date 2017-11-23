
@pesquisaTriagens
Feature: pesquisar triagens
  Como usuário, desejo pesquisar as triagens cadastradas no sistema.

  Background:
    Given eu estou na tela de pesquisa de triagens

  Scenario: visualizar tela de triagens quando ainda nao existe triagens cadastradas no sitema
    Then eu devo visualizar o campo Nome
    Then eu devo visualizar o campo CPF
    Then eu devo visualizar o campo Data de criacao
    Then eu devo visualizar o campo ate
    Then eu devo visualizar o botao Pesquisar
    Then eu devo visualizar uma tabela com os campos
      | Paciente | CPF | Data de criacao | Usuario |
    Then eu devo visualizar a mensagem "Nenhuma triagem encontrada"

  Scenario: visualizar tela de triagens quando ainda existe triagens cadastradas no sitema
    Then eu devo visualizar o campo Nome
    Then eu devo visualizar o campo CPF
    Then eu devo visualizar o campo Data de criacao
    Then eu devo visualizar o campo ate
    Then eu devo visualizar o botao Pesquisar
    Then eu devo visualizar uma tabela com os campos
      | Paciente | CPF | Data de criacao | Usuario |
    Then eu devo visualizar uma lista com todas as triagens cadastradas no sistema

  Scenario: pesquisar lista de triagem por nome de paciente que possui triagem
    And eu digitar "Paciente teste" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar uma lista com todos os pacientes que possui o nome pesquisado

  Scenario: pesquisar lista de triagem por nome de paciente que nao possui triagem
    And eu digitar "paciente sem triagem" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar a mensagem "Nenhuma Triagem encontrada"

  Scenario: pesquisar lista de triagem por cpf de paciente que possui triagem
    And eu digitar "12121212121" no campo CPF
    And eu clicar no botao pesquisar
    Then eu devo visualizar uma lista com todos os pacientes que possui o cpf pesquisado

  Scenario: pesquisar lista de triagem por cpf de paciente que nao possui triagem
    And eu digitar "11111111111" no campo cpf
    And eu clicar no botao pesquisar
    Then eu devo visualizar a mensagem "Nenhuma Triagem encontrada"

  Scenario: pesquisar lista de triagem por data de criacao existente
    And eu digitar "19122017" no campo data de criacao
    And eu clicar no botao pesquisar
    Then eu devo visualizar uma lista com todas as triagens que foram criadas na data informada

  Scenario: pesquisar lista de triagem por data de criacao inexistente
    And eu digitar "01012017" no campo data de criacao
    And eu clicar no botao pesquisar
    Then eu devo visualizar a mensagem "Nenhuma Triagem encontrada"

  Scenario: pesquisar lista de triagem por periodo de data de criacao valido
    And eu digitar "19122017" no campo data de criacao
    And eu digitar "20112017" no campo ate
    And eu clicar no botao pesquisar
    Then eu devo visualizar uma lista com todas as triagens que foram criadas no periodo informado

  Scenario: visualizar tela de triagem
    And eu digitar "Paciente teste" no campo nome
    And eu clicar no botao pesquisar
    And eu clicar no icone de pontos na linha do paciente encontrado
    Then eu devo visualizar a tela com todas as informacoes da triagem do paciente



