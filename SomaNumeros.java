package familia57;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		/*	
		 	Crie um programa que leia um número do teclado até que encontre um
			número igual a zero. No final, mostre a soma dos números
			digitados.(DO...WHILE)
		 */
		
		int numero, somaNumeros = 0;
		Scanner leia = new Scanner(System.in);
		
		
		do {
			System.out.print("Digite um número: ");
			numero=leia.nextInt();
			
			
			somaNumeros += numero;
			
			
		} while(numero != 0);
		
		System.out.println("A soma dos numeros: "+somaNumeros);
	}

}
