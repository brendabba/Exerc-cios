package br.com.casadocodigo.livrariabba.teste;

import java.util.ArrayList;
import java.util.List;

import br.com.casadocodigo.livrariabba.produtos.Produto;

public class CarrinhoDeCompras {
	
	private double total;
	private List<Produto> produtos;
	
	public CarrinhoDeCompras() {
		this.produtos = new ArrayList<>();
	}

	public void adiciona(Produto produtos) {
		this.produtos.add(produtos);
	}
	
	public void remove(int posicao) {
		this.produtos.remove(posicao);
	}
	

	public double getTotal() {
		return total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

}

