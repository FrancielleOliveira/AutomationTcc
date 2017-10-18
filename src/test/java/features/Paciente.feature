
@paciente
Feature: Pacientes
  Como usuário, desejo cadastrar e pesquisar pacientes.


  Scenario: salvar paciente com sucesso
    Given eu digitar as informações de paciente completas
      |  nome  |     cpf    |     telefone | 	 email 			|  logradouro| numero | complemento | 	cep   | cidadeUF  |
      | teste  |10567900673 |  34991918899 | franteste@gmail.com|  rua teste | 	 45   |   apt 5 	| 38414446|	uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Paciente salvo com sucesso”

  Scenario: salvar paciente sem inserir nome
    And eu digitar as informações do paciente exceto nome
      |  	  cpf   |  telefone | 	      email       |  logradouro| numero | complemento |     cep   | cidadeUF  |
      | 10567900673 |  32326666 | franteste@gmail.com |  rua teste |    45  | 	  apt 5   |   38414446| uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo nome” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir CPF
    And eu digitar todas  as informacoes do paciente exceto CPF
      |  nome |  telefone | 	email 			|  logradouro| numero | complemento | 	cep   | cidadeUF  |
      | teste |  32326666 | franteste@gmail.com |  rua teste | 	  45  |   apt 5 	| 38414446|	uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo CRM” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir telefone
    And eu digitar todas  as informacoes do paciente exceto tefone
      |  nome |  	cpf 	| 	      email       |  logradouro| numero | complemento |   cep 	|  cidadeUF |
      | teste | 10567900673 | franteste@gmail.com |  rua teste | 	45	| 	  apt 5   | 38414446| uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo telefone” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir email
    And eu digitar todas  as informacoes do paciente exceto email
      |  nome |  	cpf 	|  telefone |  logradouro| numero | complemento | 	cep 	| cidadeUF |
      | teste | 10567900673 |  32326666 |  rua teste | 	45    | 	apt 5 	|   38414446|uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo email” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir logradouro
    And eu digitar todas  as informacoes do paciente exceto logradouro
      |  nome |  	cpf 	|  telefone | 	      email       | numero | complemento | 	cep    | cidadeUF  |
      | teste | 10567900673 |  32326666 | franteste@gmail.com |   45   | 	apt 5 	 | 38414446| uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo logradouro” em forma de alert no topo da página


  Scenario: salvar paciente sem inserir numero
    And eu digitar todas  as informacoes do paciente exceto numero
      |  nome |  	cpf 	|  telefone | 	  email 		  |  logradouro| complemento | 	cep    | cidadeUF  |
      | teste | 10567900673 |  32326666 | franteste@gmail.com |  rua teste |  apt 5 	 | 38414446| uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo numero” em forma de alert no topo da página

  Scenario: salvar paciente sem inserir cep
    And eu digitar todas  as informacoes do paciente exceto cep
      |  nome |  	cpf 	|  telefone | 	  email 		  |  logradouro| numero | complemento | cidadeUF  |
      | teste | 10567900673 |  32326666 | franteste@gmail.com |  rua teste |  45	| 	  apt 5   |	uberlandia|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo cep” em forma de alert no topo da página


  Scenario: salvar paciente sem inserir cidadeUF
    And eu digitar todas  as informacoes do paciente exceto cidadeUF
      |  nome |  	cpf 	|  telefone | 		email 		  |  logradouro| numero | complemento | cep 	|
      | teste | 10567900673 |  32326666 | franteste@gmail.com |  rua teste | 	45	| 	apt 5     | 38414446|
    And eu selecionar uma opção para dependentes
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo cidadeUF” em forma de alert no topo da página

  Scenario: salvar paciente sem preencher todos os campos obrigatórios
    And eu clicar no botão Salvar
    Then eu devo visualizar a mensagem “Favor preencher o campo nome” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo CPF” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo telefone” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo email” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo logradouro” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo numero” em forma de alert no topo da página
    Then eu devo visualizar a mensagem “Favor preencher o campo cep” em forma de alert no topo da página
      
