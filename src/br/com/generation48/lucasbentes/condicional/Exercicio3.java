package br.com.generation48.lucasbentes.condicional;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
10-14 infantil
15-17 juvenil
18-25 adulto*/
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.print("Qual sua idade: ");
		idade = ler.nextInt();
		
		System.out.println("################");
		System.out.print("Seu grupo e: ");
		if(idade >= 10 && idade <= 14) {
			System.out.println("infantil");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("juvenil");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("adulto");
		}
		else{
			System.out.println("Voce nao pode se candidatar para as modalidades");
		}
		
		ler.close();

	}

}
