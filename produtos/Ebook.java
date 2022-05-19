package br.com.casadocodigo.livrariabba.produtos;

import br.com.casadocodigo.livrariabba.Autor;

public class Ebook extends Livro implements Promocional{

	private String waterMark;
	
	public Ebook (Autor autor) {
		super(autor);
	}
	
	public Ebook() {
	}
	
	public Ebook(String nome, String descricao, double valor, String isbn, Autor autor, String waterMark) {
		super(nome, descricao, valor, isbn, autor);
		this.waterMark = waterMark;
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	
	@Override
	public String toString() {
		return "Eu sou um Ebook";
	}
	
	
	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	

}
