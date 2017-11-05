
@usuario
Feature: Usuários
  Como usuário, desejo cadastrar outros usuários.


  Scenario: salvar usuario com sucesso
    And eu digitar as informações de usuario completas
      | nome |        email        |  dataNascimento | senha | confirmaSenha |
      | fran | franteste@gmail.com |    01/08/1991   | 1234  |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Usuário salvo com sucesso!” em forma de alert no topo da página

  Scenario: salvar usuario sem inserir nome
    And eu digitar todas  as informacoes exceto nome
      |        email        |  dataNascimento | senha | confirmaSenha |
      | franteste@gmail.com |    01/08/1991   | 1234  |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Nome é obrigatório.” em forma de alert no topo da página

  Scenario: salvar usuario sem inserir email
    And eu digitar todas  as informacoes exceto email
      | nome |  dataNascimento | senha | confirmaSenha |
      | fran |    01/08/1991   | 1234  |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “E-mail é obrigatório.” em forma de alert no topo da página

  Scenario: salvar usuario sem inserir data de nascimento
    And eu digitar todas  as informacoes exceto data de nascimento
      | nome |        email        |   senha | confirmaSenha |
      | fran | franteste@gmail.com |   1234  |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Usuário salvo com sucesso!” em forma de alert no topo da página

  Scenario: salvar usuario sem inserir senha
    And eu digitar todas  as informacoes exceto senha
      | nome |        email        |  dataNascimento  | confirmaSenha |
      | fran | franteste@gmail.com |    01/08/1991    |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Senha é obrigatório.” em forma de alert no topo da página

  Scenario: salvar usuario sem inserir confirmacao de senha
    And eu digitar as informações de usuario exceto confirmacao de senha
      | nome |        email        |  dataNascimento | senha |
      | fran | franteste@gmail.com |    01/08/1991   | 1234  |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Confirmação de senha é obrigatório.” em forma de alert no topo da página

  Scenario: salvar usuario sem selecionar o gruopo
    And eu digitar as informações de usuario
      | nome |        email        |  dataNascimento | senha | confirmaSenha |
      | fran | franteste@gmail.com |    01/08/1991   | 1234  |      1234     |
    And eu clicar no botao de status
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Selecione pelo menos um grupo.” em forma de alert no topo da página

  Scenario: salvar usuario inserindo senhas diferentes
    And eu digitar as informações de usuario exceto confirmacao de senha
      | nome |        email        |  dataNascimento | senha | confirmaSenha |
      | fran | franteste@gmail.com |    01/08/1991   | 1234  |      5678     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Senhas não conferem.” em forma de alert no topo da página

    @teste
  Scenario: salvar usuario sem preencher todos os campos obrigatórios
    Given eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Nome é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “E-mail é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Data de Nascimento é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Senha é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Confirmação de senha é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Selecione pelo menos um grupo.” em forma de alert no topo da página