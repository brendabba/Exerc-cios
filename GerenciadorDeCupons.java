package br.com.casadocodigo.livrariabba;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
	
	private Map<String, Double> cupons;
	
	public GerenciadorDeCupons() {
		
		this.cupons = new HashMap<>();
		
		cupons.put("CUP1", 10.0);
		cupons.put("CUP12", 12.0);
		cupons.put("CUP13", 13.0);
		cupons.put("CUP14", 14.0);
		cupons.put("CUP15", 15.0);
		cupons.put("CUP16", 16.0);
		cupons.put("CUP17", 17.0);
		cupons.put("CUP18", 18.0);
		cupons.put("CUP19", 19.0);
		cupons.put("CUP20", 20.0);

	}
	
	public Double validaCupom(String cupom) {
		return this.cupons.get(cupom);
	}
}
