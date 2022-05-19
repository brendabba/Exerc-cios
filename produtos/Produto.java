package br.com.casadocodigo.livrariabba.produtos;


public interface Produto extends Comparable<Produto>{
	
	double getValor();

	void toSring();
}