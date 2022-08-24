package com.gen.encapsulamento;

public class TestandoFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario func = new Funcionario();
		func.setNome("Pedro");
		func.setSalario(3.100);
		
		System.out.print(func.getNome());
		System.out.print(func.getSalario());
		
	}

}
