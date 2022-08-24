package com.gen.henranca;

public class TestaHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa pedro = new Pessoa("Pedro", 123);
		Funcionario carlos = new Funcionario("Carlos", 321, "TI");
		Cordenador julio = new Cordenador("Julio", 456 , "Aulas de banco");
		
		Pessoa carol = new Funcionario("Carol", 654, "CEO");
		Pessoa maria = new Cordenador("Maria", 789, "Redes");
		
		System.out.println(carlos.getNome()+ " " + carlos.getMatricula() + " " + carlos.getDepartamento());
	}

}
