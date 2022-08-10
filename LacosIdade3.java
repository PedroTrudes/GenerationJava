package familia57;

import java.util.Scanner;

public class LacosIdade3 {

	public static void main(String[] args) {
		/*
		Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99. (WHILE)
		*/
		
		int idade= 0,qtdPessoas=0, pessoasMenos21 = 0, pessoasMaior50 = 0;
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99){
			System.out.println("\nDigite a sua idade");
			idade = leia.nextInt();
			qtdPessoas ++;
			
			
			if(idade > 0 && idade < 21) {
				pessoasMenos21 ++;
			}else if(idade > 50) {
				pessoasMaior50 ++;
			}
		}
		//Para ele não pegar o -99 como uma pessoa intrevistada
		qtdPessoas -= 1;
		
		System.out.println("\nNumero de pessoas entrevistada: "+ qtdPessoas);
		System.out.println("\nNumero de pessoas com mais de 50: " + pessoasMaior50 + 
				"\nNumero de pessoas com menos de 21: "+ pessoasMenos21);
		
		

	}

}
