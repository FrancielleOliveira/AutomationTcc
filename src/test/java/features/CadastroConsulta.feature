Feature: Consultas
  Como usuário, desejo cadastrar consultas.

  Background:
    Given eu estou na tela de cadastro de consultas

    Scenario: salvar consulta com sucesso
      And eu clicar na lupa do campo Paciente
      And eu digito "Paciente" no campo nome da modal de pesquisa de pacientes
      And eu clicar no botao pesquisar
      And eu clicar no nome do paciente que sera retornado na lista
      And eu clicar na lupa do campo Medico
      And eu digito "medico" no campo nome da modal de pesquisa de medicos
      And eu clicar no botao pesquisar
      And eu clicar no nome do medico que sera retornado na lista
      And eu digito "Consulta do paciente" no campo descricao
      And eu clicar no botao salvar
      Then eu devo visualizar a mensagem "Consulta salva com sucesso!"

    Scenario: salvar consulta sem preencher campos obrigatorios
      And eu clicar no botao salvar
      Then eu devo visualizar a mensagem “Paciente e obrigatorio” em forma de alert no topo da pagina
      Then eu devo visualizar a mensagem “Medico e obrigatorio” em forma de alert no topo da pagina
      Then eu devo visualizar a mensagem “Descricao e obrigatorio” em forma de alert no topo da pagina

    Scenario: salvar consulta sem preencher o campo Paciente
      And eu clicar na lupa do campo Medico
      And eu digito "medico" no campo nome da modal de pesquisa de medicos
      And eu clicar no botao pesquisar
      And eu clicar no nome do medico que sera retornado na lista
      And eu digito "Consulta do paciente" no campo descricao
      And eu clicar no botao salvar
      Then eu devo visualizar a mensagem “Paciente e obrigatorio” em forma de alert no topo da pagina

    Scenario: salvar consulta sem preencher o campo Medico
      And eu clicar na lupa do campo Paciente
      And eu digito "Paciente" no campo nome da modal de pesquisa de medicos
      And eu clicar no botao pesquisar
      And eu clicar no nome do paciente que sera retornado na lista
      And eu digito "Consulta do paciente" no campo descricao
      And eu clicar no botao salvar
      Then eu devo visualizar a mensagem “Medico e obrigatorio” em forma de alert no topo da pagina

    Scenario: salvar consulta sem preencher o campo descricao
      And eu clicar na lupa do campo Paciente
      And eu digito "Paciente" no campo nome da modal de pesquisa de pacientes
      And eu clicar no botao pesquisar
      And eu clicar no nome do paciente que sera retornado na lista
      And eu clicar na lupa do campo Medico
      And eu digito "medico" no campo nome da modal de pesquisa de medicos
      And eu clicar no botao pesquisar
      And eu clicar no nome do medico que sera retornado na lista
      And eu clicar no botao salvar
      Then eu devo visualizar a mensagem “Descricao e obrigatorio” em forma de alert no topo da pagina

      