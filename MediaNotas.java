package familia57;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nota1, nota2, nota3;
		double media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a primeira nota: ");
		nota1 = leia.nextInt();
		System.out.println("\nDigite a segunda nota: ");
		nota2 = leia.nextInt();
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextInt();
		
		media = (nota1+nota2+nota3) / 3;
		
		if(media <= 3) {
			System.out.printf("\nVocê reprovou %.2f ", media);
		}else if( media > 3 && media <= 5) {
			System.out.printf("\nVocê esta de Exame %.2f ", media);
		}else if(media > 5 && media <= 10) {
			System.out.printf("\nVocê Foi aprovado %.2f ", media);
		}
	}

}
