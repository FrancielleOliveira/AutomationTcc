
@paciente
Feature: Pacientes
  Como usuário, desejo cadastrar pacientes.

  Background:
    Given eu estou na home do sistema
    And eu clicar no botao Cadastrar
    And eu clicar no botao Cadastro Paciente

  Scenario: salvar paciente com sucesso
    And eu digitar as informações de paciente completas
      |  nome  |     cpf    |     telefone | 	 email 			|  logradouro| numero | complemento | 	cep   | cidadeUF  |
      | teste  |10567900673 |  34991918899 | franteste@gmail.com|  rua teste | 	 45   |   apt 5 	| 38414446|	uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Paciente salvo com sucesso!” em forma de alert no topo da pagina

  Scenario: salvar paciente sem inserir nome
    And eu digitar as informações do paciente exceto nome
      |  	  cpf   |  telefone | 	      email       |  logradouro| numero | complemento |     cep   | cidadeUF  |
      | 10567900673 |  32326666 | franteste@gmail.com |  rua teste |    45  | 	  apt 5   |   38414446| uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Nome é obrigatório.” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir CPF
    And eu digitar todas  as informacoes do paciente exceto CPF
      |  nome |  telefone | 	email 			|  logradouro| numero | complemento | 	cep   | cidadeUF  |
      | teste |  32326666 | franteste@gmail.com |  rua teste | 	  45  |   apt 5 	| 38414446|	uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “CPF é obrigatório.” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir telefone
    And eu digitar todas  as informacoes do paciente exceto tefone
      |  nome |  	cpf 	| 	      email       |  logradouro| numero | complemento |   cep 	|  cidadeUF |
      | teste | 10567900673 | franteste@gmail.com |  rua teste | 	45	| 	  apt 5   | 38414446| uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Telefone é obrigatório.” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir email
    And eu digitar todas  as informacoes do paciente exceto email
      |  nome |  	cpf 	|  telefone |  logradouro| numero | complemento | 	cep 	| cidadeUF |
      | teste | 10567900673 |  32326666 |  rua teste | 	45    | 	apt 5 	|   38414446|uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “E-mail é obrigatório.” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir logradouro
    And eu digitar todas  as informacoes do paciente exceto logradouro
      |  nome |  	cpf 	|  telefone | 	      email       | numero | complemento | 	cep    | cidadeUF  |
      | teste | 10567900673 |  32326666 | franteste@gmail.com |   45   | 	apt 5 	 | 38414446| uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Logradouro é obrigatório.” em forma de alert no topo da página


  Scenario: salvar paciente sem inserir numero
    And eu digitar todas  as informacoes do paciente exceto numero
      |  nome |  	cpf 	|  telefone | 	  email 		  |  logradouro| complemento | 	cep    | cidadeUF  |
      | teste | 10567900673 |  32326666 | franteste@gmail.com |  rua teste |  apt 5 	 | 38414446| uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Número é obrigatório.” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir cep
    And eu digitar todas  as informacoes do paciente exceto cep
      |  nome |  	cpf 	|  telefone | 	  email 		  |  logradouro| numero | complemento | cidadeUF  |
      | teste | 10567900673 |  32326666 | franteste@gmail.com |  rua teste |  45	| 	  apt 5   |	uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “CEP é obrigatório.” em forma de alert no topo da página


  Scenario: salvar paciente sem inserir cidadeUF
    And eu digitar todas  as informacoes do paciente exceto cidadeUF
      |  nome |  	cpf 	|  telefone | 		email 		  |  logradouro| numero | complemento | cep 	|
      | teste | 10567900673 |  32326666 | franteste@gmail.com |  rua teste | 	45	| 	apt 5     | 38414446|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Cidade/UF é obrigatório.” em forma de alert no topo da página

  Scenario: salvar paciente sem preencher todos os campos obrigatórios
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Nome é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Telefone é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “CPF é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Logradouro é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Número é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “CEP é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “E-mail é obrigatório.” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Cidade/UF é obrigatório.” em forma de alert no topo da página
