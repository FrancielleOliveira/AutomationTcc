
@medico
Feature: Médicos
  Como usuário, desejo cadastrar e pesquisar médicos.


  Scenario: salvar medico com sucesso
    And eu digitar as informações de medico completas
      | nome |   crm  |  especialidade | telefone |         email       |
      | fran | 000111 |     pediatra   | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Médico salvo com sucesso”

  Scenario: salvar medico sem inserir nome
    And eu digitar todas  as informacoes exceto nome
      |   crm  |  especialidade | telefone |         email       |
      | 000111 |     pediatra   | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo nome” em forma de alert no topo da página

  Scenario: salvar medico sem inserir CRM
    And eu digitar todas  as informacoes exceto CRM
      | nome |  especialidade | telefone |         email       |
      | fran |     pediatra   | 32321111 | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo CRM” em forma de alert no topo da página

  Scenario: salvar medico sem inserir especialidade
    And eu digitar todas  as informacoes exceto especialidade
      | nome  |   crm  | telefone |         email       |
      | fran  | 000111 | 32321111 | franteste@gmail.com |
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo especialidade” em forma de alert no topo da página

  Scenario: salvar medico sem inserir telefone
    And eu digitar todas  as informacoes exceto telefone
      | nome  |   crm  | especialidade |         email       |
      | fran  | 000111 |    pediatra   | franteste@gmail.com |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo telefone” em forma de alert no topo da página

  Scenario: salvar medico sem inserir email
    And eu digitar todas  as informacoes exceto email
      | nome |   crm  |  especialidade | telefone |
      | fran | 000111 |     pediatra   | 32321111 |
    And eu escolher uma especialidade
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo email” em forma de alert no topo da página

  Scenario: salvar medico sem preencher todos os campos obrigatórios
    Given eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo nome” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo CRM” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo especialidade” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo telefone” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo email” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo médico” em forma de alert no topo da página