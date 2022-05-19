package br.com.casadocodigo.livrariabba.teste;

import br.com.casadocodigo.livrariabba.Autor;
import br.com.casadocodigo.livrariabba.produtos.Ebook;
import br.com.casadocodigo.livrariabba.produtos.Livro;
import br.com.casadocodigo.livrariabba.produtos.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caleum.com.br");
		autor.setCpf("123.456.789-00");
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.setIsbn("987-85-66250-46-6");
		
		livro.toString();
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("paulo.silveira@caleum.com.br");
		outroAutor.setCpf("222.456.789-00");
		
		Livro outroLivro = new LivroFisico(outroAutor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		
		outroLivro.toString();
		
		Ebook ebook = new Ebook();
		ebook.setNome("Java 8 Prático");
		
		System.out.println(livro.toString());
	}
	
	}


