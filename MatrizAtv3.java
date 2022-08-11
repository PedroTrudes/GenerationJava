package familia57;

import java.util.Scanner;
import java.util.Arrays;

public class MatrizAtv3 {

	public static void main(String[] args) {
		// 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		int [][][] numeros = new int [3][3][3];
		int i, j ,k, maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		for(i = 0; i <= 2; i++ ) {
			for(j = 0; j <= 2; j++) {
				for(k = 0; k <= 2; k++) {
					System.out.println("Digite um numero: ");
					numeros[i][j][k] = leia.nextInt();
					
					if(numeros[i][j][k] > 10){
						maior ++;
					}
					
				}
			}
		}
		
		System.out.println("\nQuantidade de numeros maior que 10: "+ maior);
		System.out.println("Array:" + Arrays.toString(numeros));

	}

}
