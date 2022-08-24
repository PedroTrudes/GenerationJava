package com.gen.interfaces;

public class TesteInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParticipanteForum part = new ParticipanteForum();
		Leitor leitor = part;
		Programador programador = part;
		String java = "JAVA";
		programador.pensando(java.toCharArray());
		
		System.out.println("O participante esta lendo: " + leitor.lendo());
		System.out.println("O programador esta estudando? " + programador.digitando());
		
	}

}
