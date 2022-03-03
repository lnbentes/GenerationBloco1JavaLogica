package br.com.generation48.lucasbentes.condicional;

import java.util.Scanner;

public class Exercico4 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
		
		Scanner ler = new Scanner(System.in);
		int numero;
		double resposta;
		
		System.out.print("Entre com um valor inteiro positivo: ");		
		numero = ler.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Seu numero e um numero par.");
			resposta = Math.sqrt(numero);
			System.out.println("A raiz quadrada de " + numero + " e igual a " + resposta);
		}
		else if(numero % 2 != 0) {
			System.out.println("Seu numero e um numero impar.");
			resposta = Math.pow(numero, 2);
			System.out.println("O número elevado ao quadrado de " + numero + " e igual a " + resposta);
		}
		else if(numero < 0) {
			System.out.println("O seu numero nao pode ser menos que zero!");			
		}
		
		ler.close();

	}

}
