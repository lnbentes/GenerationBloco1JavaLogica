package br.com.generation48.lucasbentes.condicional;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		int a, b, c, comparacao = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com 3 numeros inteiros: ");
		
		a = ler.nextInt();
		b = ler.nextInt();
		c = ler.nextInt();
		
		
		for(int i = 0; i <= 2; i++) {
			if(comparacao < a) {
				comparacao = a;
			}else if(comparacao < b) {
				comparacao = b;
			}else if(comparacao < c) {
				comparacao = c;
			}
		}
		
		System.out.println("O maior valor e: " + comparacao);
		
		ler.close();

	}

}
