package com.gen.polimorfismo;

public class TestaPolimorfismo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PessoaFisica pFisica = new PessoaFisica(null, 0);
		pFisica.setNome("Pedro");
		pFisica.setCpf(457028734L);
		
		PessoaJuridica pJuridica = new PessoaJuridica(null, 0);
		pJuridica.setNome("Carol");
		pJuridica.setCnpj(125478445454545L);
		
		Pessoa1[] pessoas = new Pessoa1[2];
		pessoas[0] = pFisica;
		pessoas[1] = pJuridica;
		
		
		for (Pessoa1 pessoa:pessoas) 
		{
			System.out.println(pessoa.getNome());
		}
		
		//System.out.println(pessoas[1].getNome());
		
	}

}
