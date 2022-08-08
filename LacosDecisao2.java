package familia57;

import java.util.Scanner;

public class LacosDecisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 a = b = c
		 a= c =b
		 b = a = c
		 b= c = a
		 c = a = b
		 c = b = a
		 */
		
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nDigite o numer a: ");
		a = scan.nextInt();
		System.out.println("\nDigite o numer b: ");
		b = scan.nextInt();
		System.out.println("\nDigite o numero C: ");
		c = scan.nextInt();
		
		if(a <= b && b<=c) {
			System.out.println("\n Ordem crescente: "+ a + "-" + b + "-"+ c);
		}else if(a <= c && c<=b) {
			System.out.println("\n Ordem crescente: "+ a + "-" + c + "-"+ b);
		}else if(b<=a && a <= c ) {
			System.out.println("\n Ordem crescente: "+ b + "-" + a + "-"+ c);
		}else if(b <= c && c <= a) {
			System.out.println("\n Ordem crescente: "+ b + "-" + c + "-"+ a);
		}else if(c <= a && a <= b) {
			System.out.println("\n Ordem crescente: "+ c + "-" + a + "-"+ b);
		}else if(c <= b && b <= a) {
			System.out.println("\n Ordem crescente: "+ c + "-" + b + "-"+ a);
		}
	
	}

}
