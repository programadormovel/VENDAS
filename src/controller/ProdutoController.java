package controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;

public class ProdutoController implements IProduto {

	List<Produto> listaProduto;
	
	public ProdutoController(){
		this.listaProduto = new ArrayList<Produto>();
	}
	
	@Override
	public Produto cadastrarProduto(Produto produto) {
		this.listaProduto.add(produto);
		return produto;
	}

	@Override
	public List<Produto> listarProdutos() {
		return this.listaProduto;
	}

}
