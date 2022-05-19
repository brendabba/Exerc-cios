package br.com.casadocodigo.livrariabba;

public class Autor {
	
	private String nome;
	private String email;
	private String cpf;
	
	public Autor() {
		super();
	}

	public Autor(String nome, String email, String cpf) {
		super();
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}

@Override
	public String toString() {
		System.out.println("Mostrando detalhes do livro:");
		System.out.println("Nome: "+ nome);
		System.out.println("E-mail: "+ email);
		System.out.println("CPF: "+ cpf);
		return null;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Autor)) return false;
		Autor outro = (Autor) obj;
		return this.nome.equals(outro.nome);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
