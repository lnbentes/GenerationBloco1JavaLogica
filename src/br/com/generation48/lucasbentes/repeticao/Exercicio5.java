package br.com.generation48.lucasbentes.repeticao;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)*/
		
		Scanner ler = new Scanner(System.in);
		int soma = 0, numero;
				
		do {
			System.out.print("Entre com o valor para soma ou 0 para sair: ");
			numero = ler.nextInt();
			soma += numero;
		}while(numero != 0);
		
		System.out.println("####################################");
		System.out.printf("A soma dos numeros e igual a %d", soma);
		
		ler.close();

	}

}
