package com.generation.poo;

public class Cliente {
	String nome;
	int idade;
	float saldoLoja;
	String ultimaCompra;
	public Cliente(String nome, int idade, float saldoLoja, String ultimaCompra) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.saldoLoja = saldoLoja;
		this.ultimaCompra = ultimaCompra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getSaldoLoja() {
		return saldoLoja;
	}
	public void setSaldoLoja(float saldoLoja) {
		this.saldoLoja = saldoLoja;
	}
	public String getUltimaCompra() {
		return ultimaCompra;
	}
	public void setUltimaCompra(String ultimaCompra) {
		this.ultimaCompra = ultimaCompra;
	}
	
	
}
