package br.com.generation48.lucasbentes.logica;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		/*Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
		
		int ano, mes, dia, resp;
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qunatos dias de vida voce tem: ");
		dia = ler.nextInt();
		System.out.print("Qunatos meses de vida voce tem: ");
		mes = ler.nextInt();
		System.out.print("Qunatos anos de vida voce tem: ");
		ano = ler.nextInt();
		
		resp=ano*365+mes*30+dia;
		
		System.out.print("Dias vividos: " + resp);
		
		ler.close();
	}

}
