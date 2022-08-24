package com.gen.polimorfismo;

public class PessoaJuridica extends Pessoa1{
	private long cnpj;

	public PessoaJuridica(String nome, long cnpj) {
		super(nome);
		this.cnpj = cnpj;
	}

	public long getCnpj() {
		return cnpj;
	}

	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return "Pessoa Juridica: "+ super.getNome() + " CNPJ : " + this.getCnpj();
	
	}
	
	
}
