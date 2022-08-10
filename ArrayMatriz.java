package familia57;

import java.util.Scanner;

public class ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] numeros = new int [3][2];
		float mediaNumImpar;
		int somaNumImpar=0, contNumImpar=0,i ,j;
		
		Scanner leia = new Scanner(System.in);
		
		for(i =0 ; i<3 ; i++) {
			for(j=0; j<2; j++) {
				System.out.println("\nEntre com um numero: ");
				numeros[i][j] = leia.nextInt();
				if(numeros[i][j] % 2 == 1) {
					somaNumImpar += numeros[i][j];
					contNumImpar++;
				}
				
			}
		}
		mediaNumImpar = somaNumImpar / contNumImpar;
		System.out.printf("\nMedia dos numero impares: %.1f", mediaNumImpar);
	
	}
}
