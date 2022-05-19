package br.com.casadocodigo.livrariabba.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.casadocodigo.livrariabba.Autor;
import br.com.casadocodigo.livrariabba.produtos.Ebook;
import br.com.casadocodigo.livrariabba.produtos.LivroFisico;
import br.com.casadocodigo.livrariabba.produtos.Produto;

public class RegistroDeVendas {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Maurício Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		if ( fisico.aplicaDescontoDe10Porcento()) {
			System.out.println("Valor agora é "+ fisico.getValor());
		}
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total: "+ carrinho.getTotal());
		
		List<Produto> produtos = carrinho.getProdutos();
		
		for (Produto produto : produtos) {
				System.out.println(produto);
			}
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Rodrigo Turini");
		nomes.add("Adriano Almeida");
		nomes.add("Paulo Silveira");
		
		Collections.sort(nomes);
		
		System.out.println(nomes);
		
		
	}
}



