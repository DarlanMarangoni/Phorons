package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String escolaridade;
	
	private Matricula matricula;
	
	public Aluno () {
		super();
	}
	
	public Aluno(String cpf, String nome) {
		super(cpf, nome);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
