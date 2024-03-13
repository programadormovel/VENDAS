package model;

public class Produto {
	private int codigo;
	private String descricao;
	private double valorUnitario;
	private long quantidadeAtual;
	private boolean ativo;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}
	public long getQuantidadeAtual() {
		return quantidadeAtual;
	}
	public void setQuantidadeAtual(long quantidadeAtual) {
		this.quantidadeAtual = quantidadeAtual;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
