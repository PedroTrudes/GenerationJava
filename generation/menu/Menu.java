package com.generation.menu;

import java.util.Scanner;

import com.generation.poo.Cliente;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int idade;
		String nome = "", ultimaCompra = "";		
		
		Cliente cli = new Cliente(null , 0, 1000, null);
		
		System.out.println("\nDigite a sua idade: ");
		idade = leia.nextInt();
		
		System.out.println("\nOla Informe seu nome: ");
		nome = leia.next();
		
		System.out.println("\nQual foi a sua ultima compra na loja? ");
		ultimaCompra = leia.next();
		
		cli.setIdade(idade);
		cli.setNome(nome);
		cli.setUltimaCompra(ultimaCompra);
		
		System.out.println("Nome: " + cli.getNome() + "\nIdade: " + cli.getIdade() + "\nSaldo: " + cli.getSaldoLoja()+ "\nUltima Compra: " + cli.getUltimaCompra());
	}

}
