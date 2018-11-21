package entities;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Aluno extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String escolaridade;
	
	private Matricula matricula;
	
	public Aluno () {
		super();
	}
	
	public Aluno(String cpf, String nome) {
		super(cpf, nome);
	}
	
	public String getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	
}
