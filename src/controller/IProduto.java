package controller;

import java.util.List;

import model.Produto;

public interface IProduto {
	Produto cadastrarProduto(Produto produto);
	List<Produto> listarProdutos();
}
