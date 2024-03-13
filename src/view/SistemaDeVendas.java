package view;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import controller.ProdutoController;
import model.Cliente;
import model.Pessoa;
import model.Produto;

public class SistemaDeVendas {

	public static void main(String[] args) {
		// Define as configurações regionais
		Locale.setDefault(new Locale("pt", "BR"));
		// Cria objeto utilizando polimorfismo
		Pessoa p1 = new Cliente();
		
		p1.setNome("Adriano");
		
		System.out.println(p1.getNome());
		// realiza pagamento 
		String retorno = p1.realizarPagamento(5.6);
		// padrão do método implementado
		JOptionPane.showMessageDialog(null, retorno);
		// em Real
		retorno = p1.realizarPagamento(5.6, Locale.getDefault());
		JOptionPane.showMessageDialog(null, retorno);
		// em Dólar
		retorno = p1.realizarPagamento(5.6, Locale.US);
		JOptionPane.showMessageDialog(null, retorno);
		// em Euro
		retorno = p1.realizarPagamento(5.6, Locale.FRANCE);	
		JOptionPane.showMessageDialog(null, retorno);

		// Cadastrar produto
		Produto prod1 = new Produto();
		prod1.setCodigo(1);
		prod1.setDescricao("Biscoito");
		prod1.setQuantidadeAtual(10);
		prod1.setValorUnitario(7.5);
		prod1.setAtivo(true);

		ProdutoController pc;
		pc = new ProdutoController();
		
		Produto produtoCadastrado = pc.cadastrarProduto(prod1);	
		JOptionPane.showMessageDialog(null, "Produto " + produtoCadastrado.getDescricao() + " cadastrado!");
		
		// Cadastrar produto
		Produto prod2 = new Produto();
		prod2.setCodigo(2);
		prod2.setDescricao("Refrigerante");
		prod2.setQuantidadeAtual(50);
		prod2.setValorUnitario(9.5);
		prod2.setAtivo(true);
		
		produtoCadastrado = pc.cadastrarProduto(prod2);	
		JOptionPane.showMessageDialog(null, "Produto " + produtoCadastrado.getDescricao() + " cadastrado!");
		
		// Receber 1 produto do teclado
		Scanner teclado = new Scanner(System.in);
		String codigoDoTeclado = JOptionPane.showInputDialog("Digite um código de produto");
		int codigoDoProduto = Integer.parseInt(codigoDoTeclado);
		
		String descricaoDoProduto = JOptionPane.showInputDialog("Digite a descrição do produto");
		String quantidadeDoTeclado = JOptionPane.showInputDialog("Digite a quantidade em estoque do produto");
		int quantidadeDoProduto = Integer.parseInt(quantidadeDoTeclado);
		
		String valorUnitarioDoTeclaco = JOptionPane.showInputDialog("Digite o valor unitário do produto");
		double valorUnitarioDoProduto = Double.parseDouble(valorUnitarioDoTeclaco);
		
		Produto prod3 = new Produto();
		prod3.setCodigo(codigoDoProduto);
		prod3.setDescricao(descricaoDoProduto);
		prod3.setQuantidadeAtual(quantidadeDoProduto);
		prod3.setValorUnitario(valorUnitarioDoProduto);
		prod3.setAtivo(true);

		produtoCadastrado = pc.cadastrarProduto(prod3);
		JOptionPane.showMessageDialog(null, "Produto " + produtoCadastrado.getDescricao() + " cadastrado!");

		// Atividade - Cadastrar mais 3 produtos
		// Refatorar estes cadastros para receber produtos do teclado
		
		// Listar Produtos
		List<Produto> listaDeProdutos = pc.listarProdutos();
		System.out.println("Produtos cadastrados em tempo de execução: ");
		for(Produto item : listaDeProdutos) {
			System.out.println(item.getCodigo() + "-" + item.getDescricao());
		}
		
		
		// Atividade - listar outros dados dos produtos
		
	}

}
