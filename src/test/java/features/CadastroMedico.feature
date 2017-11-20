
@medico
Feature: Medicos
  Como usuario, desejo cadastrar e pesquisar medicos.


  Background:
    Given eu estou na tela de cadastro de medico

  Scenario: salvar medico com sucesso
    And eu digitar as informacoes de medico completas
      | nome |   crm   | telefone |         email       |
      | fran | 000111  | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Medico salvo com sucesso!" em forma de alert no topo da pagina

  Scenario: salvar medico sem inserir nome
    And eu digitar todas  as informacoes do medico exceto nome
      |   crm  | telefone |         email       |
      | 000111 | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Nome é obrigatório." em forma de alert no topo da pagina

  Scenario: salvar medico sem inserir CRM
    And eu digitar todas  as informacoes do medico exceto CRM
      | nome | telefone |         email       |
      | fran | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "CRM é obrigatório." em forma de alert no topo da pagina

  Scenario: salvar medico sem inserir telefone
    And eu digitar todas  as informacoes do medico exceto telefone
      | nome  |   crm  |         email       |
      | fran  | 000111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Telefone é obrigatório" em forma de alert no topo da pagina

  Scenario: salvar medico sem inserir email
    And eu digitar todas  as informacoes do medico exceto email
      | nome |   crm  | telefone |
      | fran | 000111 | 32321111 |
    And eu escolher uma especialidade
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Email é obrigatório." em forma de alert no topo da pagina

  Scenario: salvar medico sem preencher todos os campos obrigatórios
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Nome é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "CRM é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "Especialidade é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "Telefone é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "E-mail é obrigatório." em forma de alert no topo da pagina