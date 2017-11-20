
@usuario
Feature: Cadastro de Usuários
  Como usuário, desejo cadastrar outros usuários.

  Background:
    Given eu estou na tela de cadastro de usuarios


  Scenario: salvar usuario com sucesso
    And eu digitar as informacoes de usuario completas
      | nome |        email        |  dataNascimento | senha | confirmaSenha |
      | fran | franteste@gmail.com |    01/08/1991   | 1234  |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Usuário salvo com sucesso!" em forma de alert no topo da pagina

  Scenario: salvar usuario sem inserir nome
    And eu digitar todas  as informacoes do usuario exceto nome
      |        email        |  dataNascimento | senha | confirmaSenha |
      | franteste@gmail.com |    01/08/1991   | 1234  |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Nome é obrigatório." em forma de alert no topo da pagina

  Scenario: salvar usuario sem inserir email
    And eu digitar todas  as informacoes do usuario exceto email
      | nome |  dataNascimento | senha | confirmaSenha |
      | fran |    01/08/1991   | 1234  |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "E-mail é obrigatório." em forma de alert no topo da pagina

  Scenario: salvar usuario sem inserir data de nascimento
    And eu digitar todas  as informacoes do usuario exceto data de nascimento
      | nome |        email        |   senha | confirmaSenha |
      | fran | franteste@gmail.com |   1234  |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Usuário salvo com sucesso!" em forma de alert no topo da pagina

  Scenario: salvar usuario sem inserir senha
    And eu digitar todas  as informacoes do usuario exceto senha
      | nome |        email        |  dataNascimento  | confirmaSenha |
      | fran | franteste@gmail.com |    01/08/1991    |      1234     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Senha é obrigatório." em forma de alert no topo da pagina

  Scenario: salvar usuario sem inserir confirmacao de senha
    And eu digitar as informacoes do usuario exceto confirmacao de senha
      | nome |        email        |  dataNascimento | senha |
      | fran | franteste@gmail.com |    01/08/1991   | 1234  |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Confirmação de senha é obrigatório." em forma de alert no topo da pagina

  Scenario: salvar usuario sem selecionar o grupo
    And eu digitar as informacoes de usuario completas
      | nome |        email        |  dataNascimento | senha | confirmaSenha |
      | fran | franteste@gmail.com |    01/08/1991   | 1234  |      1234     |
    And eu clicar no botao de status
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Selecione pelo menos um grupo." em forma de alert no topo da pagina

  Scenario: salvar usuario inserindo senhas diferentes
    And eu digitar as informacoes do usuario exceto confirmacao de senha
      | nome |        email        |  dataNascimento | senha | confirmaSenha |
      | fran | franteste@gmail.com |    01/08/1991   | 1234  |      5678     |
    And eu clicar no botao de status
    And eu escolher um grupo
    And eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Senhas não conferem." em forma de alert no topo da pagina

  Scenario: salvar usuario sem preencher todos os campos obrigatórios
    Given eu clicar no botao Salvar
    Then eu devo visualizar a mensagem "Nome é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "E-mail é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "Data de Nascimento é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "Senha é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "Confirmação de senha é obrigatório." em forma de alert no topo da pagina
    Then eu devo visualizar a mensagem "Selecione pelo menos um grupo." em forma de alert no topo da pagina