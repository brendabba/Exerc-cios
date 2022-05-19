package br.com.casadocodigo.livrariabba.teste;

import br.com.casadocodigo.livrariabba.GerenciadorDeCupons;

public class ConsultaDeDescontos {

	public static void main(String[] args) {
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		
//		if (gerenciador.validaCupom("CUP1234") != null) {
//			System.out.println("Cupom de desconto válido.");
//		} else {
//			System.out.println("Esse cupom não existe");
//		}
//		
		Double desconto = gerenciador.validaCupom("CUP1");
		
		if(desconto != null) {
			System.out.println("Cupom de desconto válido.");
			System.out.println("Valor "+ desconto);
		}else {
			System.out.println("Esse cupom não existe.");
		}

	}

}
