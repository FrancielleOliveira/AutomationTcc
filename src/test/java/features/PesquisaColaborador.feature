
@pesquisaColaborador
Feature: pesquisar colaboradores
  Como usuário, desejo pesquisar os colaboradores cadastrados no sistema.

  Background:
    Given eu estou na tela de pesquisa de colaborador


  Scenario: pesquisar colaborador por nome existente no sistema
    And eu digitar "medico fran" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar todos os colaboradores com o nome pesquisado

  Scenario: pesquisar colaborador por nome inexistente no sistema
    And eu digitar "xxxxx" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar a frase "Nenhum colaborador encontrado"

  Scenario: pesquisar colaborador por RG existente no sistema
    And eu digitar "111111111" no campo RG
    And eu clicar no botao pesquisar
    Then eu devo visualizar o colaborador "Colaborador Final" na lista de pesquisa

  Scenario: pesquisar colaborador por nome atividade exercida no sistema
    And eu selecionar a opcao atendente no campo de atividade exercida
    And eu clicar no botao pesquisar
    Then eu devo visualizar a frase todos os colaboradores que possuem a ativadade exercida pesquisada

  Scenario: pesquisar colaborador por atividade exercida no sistema sem retorno
    And eu selecionar a opcao enfermeira no campo de atividade exercida
    And eu clicar no botao pesquisar
    Then eu devo visualizar a frase "Nenhum colaborador encontrado"

  Scenario: apresentar a lista com todos os colaboradores cadastrados no sistema
    And eu clicar no botao pesquisar
    Then eu devo visualizar a lista com todos os colaboradores cadastrados no sistema

  Scenario: excluir um colaborador com sucesso
    And eu digitar "medico fran" no campo nome
    And eu clicar no botao pesquisar
    Then eu devo visualizar o nome pesquisado na lista de resultados
    And eu clicar no icone x na linha do nome pesquisado
    Then eu devo visualizar uma modal com os botoes cancel e Sim exclua agora
    And eu clicar no botao Sim exclua agora
    Then eu devo ver a modal de confirmacao de exclusao
    And eu devo clicar no botao ok
    Then eu devo visualizar a mensagem "Nenhum colaborador encontrado" em forma de alert no topo da pagina