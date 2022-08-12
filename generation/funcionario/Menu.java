package com.generation.funcionario;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// não foi preciso importar pois ele esta no mesmo lugar
		String funcionarioNome , cargoFuncionario;
		int cpfFuncionario;
		float salarioFuncionario;
		
		Funcionario fun = new Funcionario(null, null, 0, 0);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Nome do funcionario: ");
		funcionarioNome = leia.next();
		
		System.out.println("\nCargo do funcionario: ");
		cargoFuncionario = leia.next();
		
		System.out.println("\nCPF dp funcionario: ");
		cpfFuncionario = leia.nextInt();
		
		System.out.println("\nSalario do funcionario: ");
		salarioFuncionario = leia.nextFloat();
		
		fun.setNomeFuncionario(funcionarioNome);
		fun.setCargoFuncionario(cargoFuncionario);
		fun.setCpfFuncionario(cpfFuncionario);
		fun.setSalarioFuncionario(salarioFuncionario);

		System.out.println("\n*************************************************************");
		System.out.println("\nApresentação do funcionario");
		System.out.println("\n*************************************************************");
		System.out.println("\n\nNome: "+ fun.getNomeFuncionario() + 
				"\nCargo: " + fun.getCargoFuncionario() + 
				"\nCPF: " + fun.getCpfFuncionario() +
				"\nSalario: " + fun.getSalarioFuncionario());
	}

}
