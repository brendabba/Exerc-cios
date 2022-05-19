package br.com.casadocodigo.livrariabba.produtos;

import br.com.casadocodigo.livrariabba.Autor;
import br.com.casadocodigo.livrariabba.exception.AutorNuloException;

public abstract class Livro implements Produto{
	
	private String nome;
	private String descricao;
    private double valor;
	private String isbn;
	private Autor autor;

	public Livro(Autor autor) {
		if (autor == null) {
			throw new AutorNuloException(
					"O Autor do Livro não pode ser nulo");
			}
		this.autor = autor;
		this.isbn = "000-00-00000-00-0";
	}
	
	
	public Livro() {
		super();
	}


	public Livro(String nome, String descricao, double valor, String isbn, Autor autor) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.isbn = isbn;
		this.autor = autor;
	}
	
	@Override
	public void toSring() {
		System.out.println("Mostrando detalhes do livro:");
		System.out.println("Nome: "+ nome);
		System.out.println("Descrição: "+ descricao);
		System.out.println("Valor: "+ valor);
		System.out.println("ISBN: "+ isbn);
		
		if(this.temAutor()) {
			autor.toString();
		}
		
		System.out.println("--");
	}
	
	@Override
	public int compareTo(Produto outro) {
		return (int) (this.getValor() - outro.getValor());
	}
	
	
	boolean temAutor() {
		return this.autor != null;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}




	
	
	
}
