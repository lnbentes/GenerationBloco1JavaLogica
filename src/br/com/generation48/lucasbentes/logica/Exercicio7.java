package br.com.generation48.lucasbentes.logica;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		/*Um sistema de equações lineares do tipo:
		...
		, pode ser resolvido segundo mostrado abaixo :
		...
		Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
		valores de x e y.*/
		
		double a, b, c, d, e, f; // Entradas
		double x, y; // Saidas
		double denominador;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com 6 valores, lembre de da espaco entre eles.");
		a = ler.nextDouble();
		b = ler.nextDouble();
		c = ler.nextDouble();
		d = ler.nextDouble();
		e = ler.nextDouble();
		f = ler.nextDouble();
		
		denominador = (a * e) - (b * d);

		x = ((c * e) - (b * f)) / denominador;
		y = ((a * f) - (c * d)) / denominador;
		
		System.out.println("################");
		System.out.println("O valor de X = " + x);
		System.out.println("O valor de Y = " + y);
		
		ler.close();
	}

}
