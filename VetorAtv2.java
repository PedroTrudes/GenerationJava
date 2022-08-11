package familia57;

import java.util.Arrays;
import java.util.Scanner;

public class VetorAtv2 {

	

	public static void main(String[] args) {
		// 2- Faça um programa que receba 6 números inteiros e mostre: 
		//• Os números pares digitados;  
		//• A soma dos números pares digitados; 
		//• Os números ímpares digitados; 
		//• A quantidade de números ímpares digitados.

		Scanner leia = new Scanner(System.in);
		
		int [] ListaNumeros = new int[6];
		int [] ListaImpar = new int [6];
		int [] ListaPar = new int [6];
		
		int numeros=0 ,somaPares = 0 , somaImpares = 0, x , j , y, numerosImpar =0;
		
		for(x = 0; x < 6; x++) {
			
			System.out.println("Digite um numero: ");
			ListaNumeros[x] = leia.nextInt();
			
			if(ListaNumeros[x] %2 ==1) {
				
				ListaImpar[somaImpares] += ListaNumeros[x]; 
				somaImpares ++;
			}else {
				
				ListaPar[somaPares] += ListaNumeros[x];
				somaPares ++;
			}
			
		}
		
		System.out.println("\nQuantidade de Impares: "+ somaImpares + "\nQuantidade de Pares: " + somaPares );
		System.out.println("\nlista com todos os numeros: "+  Arrays.toString(ListaNumeros));
		System.out.println("\nLista impares: "+ Arrays.toString(ListaImpar));
		System.out.println("\nLista pares: " + Arrays.toString(ListaPar));
	}

}
