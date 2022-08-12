package com.generation.funcionario;

public class Funcionario {
	String nomeFuncionario;
	String cargoFuncionario;
	int cpfFuncionario;
	float salarioFuncionario;
	
	public Funcionario(String nomeFuncionario, String cargoFuncionario, int cpfFuncionario, float salarioFuncionario) {
		super();
		this.nomeFuncionario = nomeFuncionario;
		this.cargoFuncionario = cargoFuncionario;
		this.cpfFuncionario = cpfFuncionario;
		this.salarioFuncionario = salarioFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getCargoFuncionario() {
		return cargoFuncionario;
	}
	public void setCargoFuncionario(String cargoFuncionario) {
		this.cargoFuncionario = cargoFuncionario;
	}
	public int getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(int cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public float getSalarioFuncionario() {
		return salarioFuncionario;
	}
	public void setSalarioFuncionario(float salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	
	
}
