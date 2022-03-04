package br.com.generation48.lucasbentes.repeticao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
		
		Scanner ler = new Scanner(System.in);
		int numero[] = new int [10];
		
		System.out.print("Informe 10 numeros pra a organizacao: ");		
		for(int i = 0; i <= 9; i++) {
			numero[i] = ler.nextInt();			
		}
		
		System.out.println("\n########################");
		System.out.println("Os Numeros pares sao: ");
		for(int i = 0; i <= 9; i++) {
			if(numero[i] % 2 == 0) {
				System.out.print(numero[i] + " ");
			}
		}
		
		System.out.println("\n########################");
		System.out.println("Os Numeros impares sao: ");
		for(int i = 0; i <= 9; i++) {
			if(numero[i] % 2 != 0) {
				System.out.print(numero[i] + " ");
			}
		}
		
		ler.close();

	}

}
