package br.com.generation48.lucasbentes.logica;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
				
		int dias, meses, anos, resto;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual sua idade em dias?: ");
		dias = ler.nextInt();
		
		anos = dias / 365;
		resto = dias % 365;
		meses = resto / 30;
		dias = resto % 30;
		
		System.out.println("################");
		System.out.println("Sua idade em: \nanos: " + anos);
		System.out.println("meses: " + meses);
		System.out.println("dias: " + dias);
		
		ler.close();

	}

}
