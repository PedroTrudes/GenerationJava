package com.gen.interfaces;

public class ParticipanteForum implements Leitor, Programador {
	String pensamento;

	@Override
	public void pensando(char[] ideias) {
		// TODO Auto-generated method stub
		pensamento = new String(ideias);
	} 

	@Override
	public String digitando() {
		// TODO Auto-generated method stub
		return pensamento;
	}

	@Override
	public String lendo() {
		// TODO Auto-generated method stub
		return "Livros da Casa do codigo";
	}
	
	private String aprendendo() {
		return "JAVA";
	}

}
