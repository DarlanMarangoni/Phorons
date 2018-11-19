package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AVista implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private double valor;
	private int agencia;
	private int nCheque;
	private String preData;
	
	private Matricula matricula;
	
	public AVista() {
		
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getnCheque() {
		return nCheque;
	}
	
	public void setnCheque(int nCheque) {
		this.nCheque = nCheque;
	}
	
	public String getPreData() {
		return preData;
	}
	
	public void setPreData(String preData) {
		this.preData = preData;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}	
}
