package com.gen.arraylist;

import java.util.ArrayList;

public class TestaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 0.0;
		
		Double y = Double.valueOf(10);
		
		ArrayList<Double> notas = new ArrayList<Double>();
		
		notas.add(y);
		notas.add(7.0);

		notas.add(2.0);

		notas.add(10.0);
		notas.add(3.0);
		notas.add(8.0);
		
		System.out.println(notas.toString());
		
		System.out.println("\nA posição da nota 5 é: " + notas.indexOf(5d));
		
		//Alterando a nota
		notas.set(notas.indexOf(2d), 5.0d);
		System.out.println("\n Valor atualizado de 2.0 para 5.0 : " + notas);

	}

}
