package familia57;

import java.util.Scanner;

public class LacosRepeticao4 {

	public static void main(String[] args) {
		// Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
		int numero, qtdPares =0, qtdImpar=0, x;
		
		Scanner leia = new Scanner(System.in);
		
	
		
		for( x = 0; x<=9; x++) {
			System.out.println("Digite um numero:");
			numero = leia.nextInt();
			
			if(numero % 2 == 1) {
				System.out.println("\nEsse numero é impar");
				qtdImpar ++;
			}else {
				System.out.println("\nEsse numero é par");
				qtdPares ++;
			}
		}
		System.out.println("\nNumero de impares: " + qtdImpar);
		System.out.println("\nNumero de pares: "+ qtdPares);
		
	}

}		
 

