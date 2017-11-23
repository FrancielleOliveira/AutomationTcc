
@consulta
Feature: Consultas
  Como usuário, desejo cadastrar consultas.

  Background:
    Given eu estou na tela de cadastro de consultas

    Scenario: Salvar consulta com sucesso
      And eu clicar na lupa do campo Paciente
      And eu digitar "Paciente" no campo nome da modal de pesquisa de pacientes
      And eu clicar no botao pesquisar paciente
      And eu clicar no nome do paciente que sera retornado na lista
      And eu clicar na lupa do campo Medico
      And eu digitar "medico" no campo nome da modal de pesquisa de medicos
      And eu clicar no botao pesquisar medico
      And eu clicar no nome do medico que sera retornado na lista
      And eu digitar "Consulta do paciente" no campo descricao
      And eu clicar no botao Salvar
      Then eu devo visualizar a mensagem "Consulta salva com sucesso!"

    Scenario: Salvar consulta sem preencher campos obrigatório.s
      And eu clicar no botao Salvar
      Then eu devo visualizar a mensagem "Paciente é obrigatório." em forma de alert no topo da pagina
      Then eu devo visualizar a mensagem "Médico é obrigatório." em forma de alert no topo da pagina
      Then eu devo visualizar a mensagem "Descrição é obrigatório." em forma de alert no topo da pagina

    Scenario: Salvar consulta sem preencher o campo Paciente
      And eu clicar na lupa do campo Medico
      And eu digitar "medico" no campo nome da modal de pesquisa de medicos
      And eu clicar no botao pesquisar
      And eu clicar no nome do medico que sera retornado na lista
      And eu digitar "Consulta do paciente" no campo descricao
      And eu clicar no botao Salvar
      Then eu devo visualizar a mensagem "Paciente é obrigatório." em forma de alert no topo da pagina

    Scenario: Salvar consulta sem preencher o campo Medico
      And eu clicar na lupa do campo Paciente
      And eu digitar "Paciente" no campo nome da modal de pesquisa de medicos
      And eu clicar no botao pesquisar
      And eu clicar no nome do paciente que sera retornado na lista
      And eu digitar "Consulta do paciente" no campo descricao
      And eu clicar no botao Salvar
      Then eu devo visualizar a mensagem "Médico é obrigatório." em forma de alert no topo da pagina

    Scenario: Salvar consulta sem preencher o campo descricao
      And eu clicar na lupa do campo Paciente
      And eu digitar "Paciente" no campo nome da modal de pesquisa de pacientes
      And eu clicar no botao pesquisar
      And eu clicar no nome do paciente que sera retornado na lista
      And eu clicar na lupa do campo Medico
      And eu digitar "medico" no campo nome da modal de pesquisa de medicos
      And eu clicar no botao pesquisar
      And eu clicar no nome do medico que sera retornado na lista
      And eu clicar no botao Salvar
      Then eu devo visualizar a mensagem "Descrição é obrigatório." em forma de alert no topo da pagina

      