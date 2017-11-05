
@medico
Feature: Médicos
  Como usuário, desejo cadastrar e pesquisar médicos.


  Scenario: salvar medico com sucesso
    And eu digitar as informações de medico completas
      | nome |   crm   | telefone |         email       |
      | fran | 000111  | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Médico salvo com sucesso!” em forma de alert no topo da pagina

  Scenario: salvar medico sem inserir nome
    And eu digitar todas  as informacoes exceto nome
      |   crm  | telefone |         email       |
      | 000111 | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Nome é obrigatório.” em forma de alert no topo da página

  Scenario: salvar medico sem inserir CRM
    And eu digitar todas  as informacoes exceto CRM
      | nome | telefone |         email       |
      | fran | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “CRM é obrigatório.” em forma de alert no topo da página

  Scenario: salvar medico sem inserir especialidade
    And eu digitar todas  as informacoes exceto especialidade
      | nome  |   crm  | telefone |         email       |
      | fran  | 000111 | 32321111 | franteste@gmail.com |
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Especialidade é obrigatório.” em forma de alert no topo da página

  Scenario: salvar medico sem inserir telefone
    And eu digitar todas  as informacoes exceto telefone
      | nome  |   crm  |         email       |
      | fran  | 000111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Telefone é obrigatório.” em forma de alert no topo da página

  Scenario: salvar medico sem inserir email
    And eu digitar todas  as informacoes exceto email
      | nome |   crm  |  especialidade | telefone |
      | fran | 000111 |     pediatra   | 32321111 |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Email é obrigatório.” em forma de alert no topo da página

  Scenario: salvar medico sem preencher todos os campos obrigatórios
    Given eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Nome é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “CRM é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Especialidade é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Telefone é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “E-mail é obrigatório.” em forma de alert no topo da página