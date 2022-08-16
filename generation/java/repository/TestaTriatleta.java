package com.gen.java.repository;

public class TestaTriatleta   {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triatleta triatleta = new Triatleta("Pedro");
		
		triatleta.aquecer();
		System.out.println("------------------------------\n");
		triatleta.correr();
		System.out.println("------------------------------\n");
		triatleta.correrDeBicicleta();
		System.out.println("------------------------------\n");
		triatleta.nadar();
		System.out.println("------------------------------\n");
		triatleta.cansou();
	}

}
