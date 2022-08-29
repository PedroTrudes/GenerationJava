package com.gen.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Colecoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection<String> nomes = new ArrayList();
		Collection<String> nomes2 =  Arrays.asList("CCC", "ssss");
		
		//Colocando dados na colection
		nomes.add("Pedro");
		nomes.add("julio");
		nomes.add("Carol");
		nomes.add("Paulo");
		nomes.add("Tata");
		System.out.println("Usuarios: " + nomes);
		
		
		//Correndo pelos dados da lista e pegando cada valor
		for(String name : nomes) {
			System.out.println("Nomes: " + name);
		}
		
		/*Removendo dados da collection*/
		nomes.remove("Paulo");
		System.out.println("Usuarios: " + nomes);
				
		/*Verifica se tem algum nome na collection*/
		System.out.println("contem o nome Pedro? " + nomes.contains("Pedro"));
		
		// Juntando duas collections
		nomes.addAll(nomes2);
		System.out.println("Pegando dados de outra collection: " + nomes);
		
		//Limpando dados da lista
		nomes.clear();
		System.out.println("Usuarios: " + nomes);
		
		
		
		if(nomes.isEmpty()) {
			System.out.println("Arrey esta vazio");
		}else {
			System.out.println("Lista de nomes: "+nomes);
			
		}
		
		
	}	

}
