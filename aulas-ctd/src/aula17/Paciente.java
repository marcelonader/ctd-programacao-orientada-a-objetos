package aula17;

import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao) throws PacienteException {

        Date hoje = new Date();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;

        if (dataInternacao.before(hoje)) {
            throw new PacienteException("Erro: a data informada de internação é anterior à data do cadastro.");

        }  else {
            this.dataInternacao = dataInternacao;
        }

    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }

    public void darAlta(Date dataAlta) throws PacienteException
    {
        if (dataAlta.after(dataInternacao))
            System.out.println("Ok");
        else
            throw new PacienteException("Erro: a data de alta é anterior à data de internação.");

    }
}
