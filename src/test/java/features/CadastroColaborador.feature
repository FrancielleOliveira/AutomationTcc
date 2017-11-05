
@colaborador
Feature: colaboradors
  Como usuário, desejo cadastrar e pesquisar colaboradores.


  Scenario: salvar  com sucesso
    And eu digitar as informações de colaborador completas
      | nome |     cpf     |    rg    | dataNascimento |  telefone |
      | fran | 11122233307 |  16234567|     01081991   |  32324455 |
    And eu escolher a atividade exercida
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Colaborador salvo com sucesso!” em forma de alert no topo da pagina

  Scenario: salvar colaborador sem inserir nome
    And eu digitar todas  as informacoes do colaborador exceto nome
      |     cpf     |    rg    | dataNascimento |  telefone |
      | 11122233307 |  16234567|     01081991   |  32324455 |
    And eu escolher a atividade exercida
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Nome é obrigatório.” em forma de alert no topo da página

  Scenario: salvar colaborador sem inserir CPF
    And eu digitar todas  as informacoes exceto CPF
      | nome |    rg    | dataNascimento |  telefone |
      | fran |  16234567|     01081991   |  32324455 |
    And eu escolher a atividade exercida
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “CRM é obrigatório.” em forma de alert no topo da página

  Scenario: salvar colaborador sem inserir rg
    And eu digitar todas  as informacoes exceto rg
      | nome |     cpf     | dataNascimento |  telefone |
      | fran | 11122233307 |     01081991   |  32324455 |
    And eu escolher a atividade exercida
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “RG é obrigatório.” em forma de alert no topo da página

  Scenario: salvar colaborador sem inserir data de nascimento
    And eu digitar todas  as informacoes do colaborador exceto data de nascimento
      | nome |     cpf     |    rg    |  telefone |
      | fran | 11122233307 |  16234567|  32324455 |
    And eu escolher a atividade exercida
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Data de Nascimento é obrigatório.” em forma de alert no topo da página

  Scenario: salvar colaborador sem inserir telefone
    And eu digitar todas  as informacoes do colaborador exceto telefone
      | nome |     cpf     |    rg    | dataNascimento |
      | fran | 11122233307 |  16234567|     01081991   |
    And eu escolher a atividade exercida
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Telefone é obrigatório.” em forma de alert no topo da página

  Scenario: salvar colaborador sem escolher uma atividade exercida
    And eu digitar as informações de colaborador completas
      | nome |     cpf     |    rg    | dataNascimento |  telefone |
      | fran | 11122233307 |  16234567|     01081991   |  32324455 |
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Atividade Exercida é obrigatório” em forma de alert no topo da página


  Scenario: salvar colaborador sem preencher todos os campos obrigatórios
    Given eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Nome é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “CPF é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “RG é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Data de Nascimento é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Telefone é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Atividade Exercida é obrigatório.” em forma de alert no topo da página