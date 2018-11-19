package entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String sigla;
	private String nome;
	private int cargaHoraria;
	private double valor;
	private String dataVigencia;
	private double horaInstrutor;
	private String programa;
	
	private List<Turma> turmas = new ArrayList<>();
	
	public Curso() {
		
	}
	
	public Curso(String sigla, String nome) {
		super();
		this.sigla = sigla;
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataVigencia() {
		return dataVigencia;
	}

	public void setDataVigencia(String dataVigencia) {
		this.dataVigencia = dataVigencia;
	}

	public double getHoraInstrutor() {
		return horaInstrutor;
	}

	public void setHoraInstrutor(double horaInstrutor) {
		this.horaInstrutor = horaInstrutor;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}	
}
