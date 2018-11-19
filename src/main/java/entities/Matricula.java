package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Matricula implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String data;
	private String qtdeFaltas;
	private double notas;
	
	private Aluno aluno;
	
	private Turma turma;
	
	private AVista aVista;
	
	private APrazo aPrazo;
	
	public Matricula() {
		
	}
	
	public Matricula (String data) {
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getQtdeFaltas() {
		return qtdeFaltas;
	}

	public void setQtdeFaltas(String qtdeFaltas) {
		this.qtdeFaltas = qtdeFaltas;
	}

	public double getNotas() {
		return notas;
	}

	public void setNotas(double notas) {
		this.notas = notas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public AVista getaVista() {
		return aVista;
	}

	public void setaVista(AVista aVista) {
		this.aVista = aVista;
	}

	public APrazo getaPrazo() {
		return aPrazo;
	}

	public void setaPrazo(APrazo aPrazo) {
		this.aPrazo = aPrazo;
	}	
	
}
