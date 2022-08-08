package familia57;

import java.util.Scanner;

public class LacosDecisao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Você é Categoria Infantil");
		}else if(idade >= 15 && idade <= 17) {
			System.out.println("Você é Categoria Juvenil");
		}else if(idade >= 18 && idade <= 25) {
			System.out.println("Você é Categoria Adulto");
		}
		
	}

}
