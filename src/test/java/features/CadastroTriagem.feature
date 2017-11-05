Feature: Triagem
  Como usuário, desejo cadastrar e pesquisar fichas de triagens.


  Scenario: salvar ficha de triagem com sucesso
    Given eu tocar a lupa do campo paciente
    And eu digitar "Fabiana" no campo Nome
    And eu clicar no botao pesquisar
    And eu clicar no resultado da pesquisa
    And eu tocar a lupa do campo medico
    And eu digitar "xxxxxx" no campo Nome
    And eu clicar no botao pesquisar
    And eu clicar no resultado da pesquisa
    And marcar os sintomas na aba Primeira Etapa
    And clicar na aba Segunda etapa
    And marcar os sintomas na aba Segunda Etapa
    And preencher os itens da Segunda Etapa
    And clicar no botao salvar
    Then eu devo visualizar a mensagem "Triagem salva com sucesso"


  Scenario: salvar ficha de triagem sem preencher o campo paciente
    Given eu tocar a lupa do campo medico
    And eu digitar "xxxxxx" no campo Nome
    And eu clicar no botao pesquisar
    And eu clicar no resultado da pesquisa
    And marcar os sintomas na aba Primeira Etapa
    And clicar na aba Segunda etapa
    And marcar os sintomas na aba Segunda Etapa
    And preencher os itens da Segunda Etapa
    And clicar no botao salvar
    Then eu devo visualizar a mensagem “Paciente é obrigatório.” em forma de alert no topo da página

  Scenario: salvar ficha de triagem sem preencher o campo medico
    Given eu tocar a lupa do campo paciente
    And eu digitar "Fabiana" no campo Nome
    And eu clicar no botao pesquisar
    And eu clicar no resultado da pesquisa
    And marcar os sintomas na aba Primeira Etapa
    And clicar na aba Segunda etapa
    And marcar os sintomas na aba Segunda Etapa
    And preencher os itens da Segunda Etapa
    And clicar no botao salvar
    Then eu devo visualizar a mensagem “Médico é obrigatório.” em forma de alert no topo da página

  Scenario: salvar ficha de triagem sem preencher o campo medico e paciente
    And marcar os sintomas na aba Primeira Etapa
    And clicar na aba Segunda etapa
    And marcar os sintomas na aba Segunda Etapa
    And preencher os itens da Segunda Etapa
    And clicar no botao salvar
    Then eu devo visualizar a mensagem “Paciente é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Médico é obrigatório.” em forma de alert no topo da página

  Scenario: salvar ficha de triagem sem preencher os campos obrigatórios
    Given clicar no botao salvar
    Then eu devo visualizar a mensagem “Paciente é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Médico é obrigatório.” em forma de a






