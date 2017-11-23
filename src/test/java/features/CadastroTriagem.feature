
@triagem
Feature: Triagem
  Como usuário, desejo cadastrar e pesquisar fichas de triagens.

  Background:
    Given eu estou na tela de cadastro da triagem

    
  Scenario: Salvar ficha de triagem com sucesso
    And eu clicar na lupa do campo Paciente
    And eu digitar "Paciente" no campo nome da modal de pesquisa de pacientes
    And eu clicar no botao pesquisar paciente
    And eu clicar no nome do paciente que sera retornado na lista
    And eu marcar os sintomas na aba Primeira Etapa
    And eu clicar na aba Segunda etapa
    And eu marcar os sintomas na aba Segunda Etapa
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Triagem salva com sucesso!" em forma de alert no topo da pagina


  Scenario: Salvar ficha de triagem sem preencher o campo paciente
    And eu marcar os sintomas na aba Primeira Etapa
    And eu clicar na aba Segunda etapa
    And eu marcar os sintomas na aba Segunda Etapa
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Paciente é obrigatório." em forma de alert no topo da pagina


