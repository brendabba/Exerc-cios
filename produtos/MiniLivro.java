package br.com.casadocodigo.livrariabba.produtos;

import br.com.casadocodigo.livrariabba.Autor;

public class MiniLivro extends Livro{
	
	public MiniLivro(Autor autor) {
		super(autor);
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		return false;
	}
}
