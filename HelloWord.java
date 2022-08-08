package familia57;

import java.util.Scanner;

public class HelloWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ola mundo");
		Scanner leia = new Scanner(System.in);
		
		String nome = "pedro";
		int idade = 20, op;		
		double nota1, nota2, nota3, nota4, media;
		
		
		
		System.out.println("nome: "+ nome);
		System.out.println("idade: "+ idade);
		
		System.out.println("\nEntrar com a primeira nota: ");
		nota1 = leia.nextDouble();
		System.out.println("\nEntrar com a segunda nota: ");
		nota2 = leia.nextDouble();
		System.out.println("\nEntrar com a terceira nota: ");
		nota3 = leia.nextDouble();
		System.out.println("\nEntrar com a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1+nota2+nota3+nota4) / 4;
		System.out.println("\nSua media é: "+ media);
		
		//PrintF para trabalhar com arredondamentos %.2f duas casas depois da virgula
		System.out.printf("\nMedia aritimetica: %.2f", media,"\n");
		
		if(media >= 6 && media <= 10) {
			System.out.println("\nParabéns "+ nome + " Você passou com " + media);
		}else if(media >=4 && media < 6) {
			System.out.println("\n" + nome +" Você esta de exame devido a sua media que foi: "+ media);
		}else {
			System.out.println("\nVocê foi reprovado");
		}
		
		System.out.println("\nLista de filmes");
		System.out.println("\n 1 - A procura da felicidade");
		System.out.println("\n 2 - Os vigadores");
		System.out.println("\n 3 - Prendame se for capaz");
		System.out.println("\n 4 - Na ilha do medo");
		op = leia.nextInt();
		switch(op) {
		case 1: 
			System.out.println("\n 1 - A procura da felicidade");
			break;
		case 2:
			System.out.println("\n 2 - Os vigadores");
			break;
		case 3:
			System.out.println("\n 3 - Prendame se for capaz");
			break;
		case 4:
			System.out.println("\n 4 - Na ilha do medo");
			break;
		default:
			System.out.println("opção invalida!!");
		}
	}

}
