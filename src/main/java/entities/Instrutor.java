package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class Instrutor extends Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;

	private String formacao;
	private String areaAtuacao;
	
	private List<Turma> turmas = new ArrayList<>();
	
	private Curso curso;
	
	public Instrutor () {
		super();
	}
	
	public Instrutor(String cpf, String nome) {
		super(cpf, nome);		
	}
	
	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

}
