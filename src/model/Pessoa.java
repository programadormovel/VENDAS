package model;

import java.util.Locale;

public abstract class Pessoa {
	private int codigo;
	private String nome;
	private String cpf;
	private String endereco;
	private double rendaMensal;
	private double salario;
	private boolean ativa;
	
	public Pessoa () {
		
	}
	
	public Pessoa(String nome) {
		
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getRendaMensal() {
		return rendaMensal;
	}
	public void setRendaMensal(double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public boolean isAtiva() {
		return ativa;
	}
	public void setAtiva(boolean ativa) {
		this.ativa = ativa;
	}
	
	public String realizarPagamento(double valorDeEntrada) {
		return this.nome + 
				" pagou R$ " + 
				String.format(
						String.valueOf(
								valorDeEntrada).replace(".",","),"####,##");		
	}

	public abstract String realizarPagamento(double d, Locale default1);
	
}
