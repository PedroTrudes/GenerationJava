package familia57;

import java.util.Scanner;

public class LacosDecisao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		double resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um numero qualquer");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			resultado = Math.sqrt(numero);
		}else {
			resultado = Math.pow(numero, 2);
		}
		
		System.out.printf("\nResultado =  %.2f ", resultado);
		
	}

}
