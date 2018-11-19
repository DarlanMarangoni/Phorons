package entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class APrazo implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private double valor;
	private String dtVencimento;
	private double taxaJuros;
	private int qtdeMensalidades;
	
	private Matricula matricula;
	
	public APrazo() {
		
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
	
	public String getDtVencimento() {
		return dtVencimento;
	}
	
	public void setDtVencimento(String dtVencimento) {
		this.dtVencimento = dtVencimento;
	}
	
	public double getTaxaJuros() {
		return taxaJuros;
	}
	
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public int getQtdeMensalidades() {
		return qtdeMensalidades;
	}
	
	public void setQtdeMensalidades(int qtdeMensalidades) {
		this.qtdeMensalidades = qtdeMensalidades;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}	
}
