package com.gen.java.repository;

public class Triatleta 
extends Pessoa 
implements Nadador, Corredor, Ciclista{

	public Triatleta(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void aquecer() {
		// TODO Auto-generated method stub
		System.out.println(this.getNome() + " Aquecendo...");
		
	}

	@Override
	public void correrDeBicicleta() {
		// TODO Auto-generated method stub
		System.out.println(this.getNome() + " Correndo de bicicleta ...." );
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		System.out.println(this.getNome() + " Correndo..");
	}

	@Override
	public void nadar() {
		// TODO Auto-generated method stub
		System.out.println( this.getNome() + " Nadando....");
	}

	@Override
	public void cansou() {
		// TODO Auto-generated method stub
		System.out.println(this.getNome() + " Cansou............");
		
	}
	
}
