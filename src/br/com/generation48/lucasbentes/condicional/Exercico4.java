package br.com.generation48.lucasbentes.condicional;

import java.util.Scanner;

public class Exercico4 {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
		
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
			System.out.println("O n�mero elevado ao quadrado de " + numero + " e igual a " + resposta);
		}
		else if(numero < 0) {
			System.out.println("O seu numero nao pode ser menos que zero!");			
		}
		
		ler.close();

	}

}
