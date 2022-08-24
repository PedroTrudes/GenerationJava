package com.gen.polimorfismo;

public class PessoaFisica extends Pessoa1{
	private long cpf;
	

	public PessoaFisica(String nome, long cpf) {
		super(nome);
		this.cpf = cpf;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return "Pessoa fisica: " + super.getNome() + "- cpf: " + this.getCpf();
	}
	
	
}
