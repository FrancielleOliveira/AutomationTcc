
@pesquisaPaciente
Feature: Pacientes
  Como usuário, desejo pesquisar pacientes.

  Background:
    Given eu estou na tela de pesquisa de pacientes


    Scenario: pesquisar paciente por nome existente no sistema
      And eu digitar "Fabiana" no campo nome
      And eu clicar no botao pesquisar
      Then eu devo visualizar todos os pacientes com o nome pesquisado

    Scenario: pesquisar paciente por nome inexistente no sistema
      And eu digitar "xxxxx" no campo nome
      And eu clicar no botao pesquisar
      Then eu devo visualizar a frase "Nenhum Paciente encontrado"

    Scenario: pesquisar paciente por CPF existente no sistema
      And eu digitar "24586484848" no campo cpf
      And eu clicar no botao pesquisar
      Then eu devo visualizar o paciente "Fabiana Akemi" na lista de pesquisa

    Scenario: pesquisar paciente por CPF inexistente no sistema
      And eu digitar "12345678911" no campo cpf
      And eu clicar no botao pesquisar
      Then eu devo visualizar a frase "Nenhum Paciente encontrado"




